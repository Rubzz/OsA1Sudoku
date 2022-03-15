package Group14.SudokuSolver;

import java.util.ArrayList;

public class BoxChecker implements Runnable
{
    private ArrayList<String> sudoku;

    public BoxChecker(ArrayList<String> sudoku) {
        this.sudoku = sudoku;
    }

    public void run()   {
        SudokuSolver test = new SudokuSolver(this.sudoku);
        if (!test.checkBoxes())
            System.out.println("Row check has failed");
        else System.out.println("Row check has passed");
    }

    public void setSudoku(ArrayList<String> sudoku) {
        this.sudoku = sudoku;
    }
}
