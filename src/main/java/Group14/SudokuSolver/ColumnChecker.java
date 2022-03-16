package Group14.SudokuSolver;

import java.util.ArrayList;

public class ColumnChecker implements Runnable
{
    private ArrayList<String> sudoku;

    public ColumnChecker(ArrayList<String> sudoku) {
        this.sudoku = sudoku;
    }

    public void run()   {
        SudokuSolver test = new SudokuSolver(this.sudoku);
        if (!test.checkColumns())
            System.out.println("Row check has failed");
        else System.out.println("Row check has passed");
    }

    public void setSudoku(ArrayList<String> sudoku) {
        this.sudoku = sudoku;
    }
}
