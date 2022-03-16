package Group14.SudokuSolver;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Window;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


/**
 * A controller for the SudokuSolver application
 * @author (Alejandro Grønhaug)
 * @version (v0.1)
 */


public class Controller {
    private static String version = "V 0.1-SNAPSHOT";
    private static String application = "SudokuSolver";
    public ArrayList<String> sudokuTable;


    /**
     * Initializes the controller.
     */
    public void initialize()
    {
    }

    /**
     *Clears the existing table and creates a dialog for importing .txt files
     * which relays the file to a helping method
     * @throws IOException
     */
    @FXML
    public void importAppendFileDialog() throws IOException
    {
        //sudokuSolver.getSudokuSolver().clear();
        Scene scene = new Scene(new Group());
        Window chooseDialogWindow = scene.getWindow();
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Comma-delimited value (*.csv)", "*.csv");
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showOpenDialog(chooseDialogWindow);
        if(file != null){ parseFromFile(file);}
        else if (file == null) {System.out.println("Window was closed");}
    }


    /**
     * Parses the .txt file
     * @param file A file to be parsed and presented in the tableview
     * @throws IOException
     */
    public void parseFromFile(File file) throws IOException {
        CSV_Reader fileReader = new CSV_Reader();
        SudokuSolver thread1 = new SudokuSolver("RowChecker");
        SudokuSolver thread2 = new SudokuSolver ("ColumnChecker");
        SudokuSolver thread3 = new SudokuSolver ("BoxChecker");
        //SudokuSolver thread4 = new SudokuSolver ("Sudoku result");


        thread1.getSudokuSolver().clear();
        thread2.getSudokuSolver().clear();
        thread3.getSudokuSolver().clear();
        System.out.println("Checking sudoku values..");
        System.out.println("");

        sudokuTable=fileReader.fileParseToArrayList(file);
        thread1.mergeArrayLists(sudokuTable);
        thread2.mergeArrayLists(sudokuTable);
        thread3.mergeArrayLists(sudokuTable);


        thread1.run();
        thread2.run();
        thread3.run();
        //thread4.run();

    }

}
