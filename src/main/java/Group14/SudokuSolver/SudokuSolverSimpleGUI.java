package Group14.SudokuSolver;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Logger;


/**
 * Creates the Graphical User Interface to be launched
 *
 * @author (Alejandro Grønhaug)
 * @version (v0.1)
 */


public class SudokuSolverSimpleGUI extends Application
{
    private Logger logger = Logger.getLogger(this.getClass().getName());

    /**
     * Launches the application
     * @param args
     */
    public static void main(String[] args)
    {
        launch();
    }

    /**
     * Sets up the stage, retrieves the fxml file and opens the application
     * @param appStage The stage where the application will show
     * @throws IOException
     * @throws RuntimeException
     */
    @Override
    public void start(Stage appStage) throws IOException, RuntimeException {
        //
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SudokuGUI.fxml"));
        try {
            Parent root = fxmlLoader.load();
            appStage.setTitle("Simple Sudoku Solver");
            appStage.setScene(new Scene(root));
            appStage.setResizable(true);
            appStage.show();

        } catch (IOException e) {
            logger.severe("ERROR: An I/O Exception occurred. Cause: "+e.getCause());
            throw e;
        }



    }
}

