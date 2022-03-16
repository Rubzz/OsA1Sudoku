package Group14.SudokuSolver;

import java.util.ArrayList;

public class SudokuSolverTesting {
    private ArrayList<String> sudoku;

   /**
    * returns the sudoku saved in the tester
    * @return the sudoku as an ArrayList
    */
    public ArrayList<String> getSudoku()  {
       return sudoku;
    }

   /**
    * runs the code to test if the sudoku is valid
    * @param args
    */
     public static void main(String[] args) {
     SudokuSolver solver = new SudokuSolver();
     SudokuSolverTesting tester = new SudokuSolverTesting();
     tester.addCorrectSudoku();
     solver.setSudoku(tester.getSudoku());
     if (solver.checkRows() && solver.checkColumns() && solver.checkBoxes())
     System.out.println("works");
     else System.out.println("not works");
     }

   /**
    * adds a correct sudoku to the field
    */
   public void addCorrectSudoku() {
        this.sudoku.add("9");
        this.sudoku.add("2");
        this.sudoku.add("5");
        this.sudoku.add("6");
        this.sudoku.add("3");
        this.sudoku.add("1");
        this.sudoku.add("8");
        this.sudoku.add("4");
        this.sudoku.add("7");
        this.sudoku.add("6");
        this.sudoku.add("1");
        this.sudoku.add("8");
        this.sudoku.add("5");
        this.sudoku.add("7");
        this.sudoku.add("4");
        this.sudoku.add("2");
        this.sudoku.add("9");
        this.sudoku.add("3");
        this.sudoku.add("3");
        this.sudoku.add("7");
        this.sudoku.add("4");
        this.sudoku.add("9");
        this.sudoku.add("8");
        this.sudoku.add("2");
        this.sudoku.add("5");
        this.sudoku.add("6");
        this.sudoku.add("1");
        this.sudoku.add("7");
        this.sudoku.add("4");
        this.sudoku.add("9");
        this.sudoku.add("8");
        this.sudoku.add("2");
        this.sudoku.add("6");
        this.sudoku.add("1");
        this.sudoku.add("3");
        this.sudoku.add("5");
        this.sudoku.add("8");
        this.sudoku.add("5");
        this.sudoku.add("2");
        this.sudoku.add("4");
        this.sudoku.add("1");
        this.sudoku.add("3");
        this.sudoku.add("9");
        this.sudoku.add("7");
        this.sudoku.add("6");
        this.sudoku.add("1");
        this.sudoku.add("6");
        this.sudoku.add("3");
        this.sudoku.add("7");
        this.sudoku.add("9");
        this.sudoku.add("5");
        this.sudoku.add("4");
        this.sudoku.add("8");
        this.sudoku.add("2");
        this.sudoku.add("2");
        this.sudoku.add("8");
        this.sudoku.add("7");
        this.sudoku.add("3");
        this.sudoku.add("5");
        this.sudoku.add("9");
        this.sudoku.add("6");
        this.sudoku.add("1");
        this.sudoku.add("4");
        this.sudoku.add("4");
        this.sudoku.add("9");
        this.sudoku.add("1");
        this.sudoku.add("2");
        this.sudoku.add("6");
        this.sudoku.add("7");
        this.sudoku.add("3");
        this.sudoku.add("5");
        this.sudoku.add("8");
        this.sudoku.add("5");
        this.sudoku.add("3");
        this.sudoku.add("6");
        this.sudoku.add("1");
        this.sudoku.add("4");
        this.sudoku.add("8");
        this.sudoku.add("7");
        this.sudoku.add("2");
        this.sudoku.add("9");
    }
}
