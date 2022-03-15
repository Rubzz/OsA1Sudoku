package Group14.SudokuSolver;

import java.util.ArrayList;


public class SudokuSolver {
    private ArrayList<String> sudoku = new ArrayList<>();

    private void addNumber(int number) {
        this.sudoku.add("" + number);
    }

    private void addSudokuLine() {
        this.sudoku.add("1");
        this.sudoku.add("2");
        this.sudoku.add("3");
        this.sudoku.add("4");
        this.sudoku.add("5");
        this.sudoku.add("6");
        this.sudoku.add("7");
        this.sudoku.add("8");
        this.sudoku.add("9");
    }

    /**
     * Checks an array of 9 strings if they contain the numbers from 1-9 and returns true if they do.
     * @param sudokuLine the array to check
     * @return true or false based on if the array contains 1-9 or not
     */
    public boolean checkSolveLine(ArrayList<String> sudokuLine) {
        ArrayList<String> line = sudokuLine;
        if (line.contains("1") && line.contains("2") && line.contains("3") &&
                line.contains("4") && line.contains("5") && line.contains("6") &&
                line.contains("7") && line.contains("8") && line.contains("9")) {
            System.out.println("line is valid");
            return true;
        }
        else  {
            System.out.println("line is invalid");
            return false;
        }
    }

    /**
     * Sends a row to be checked for the numbers 1-9
     * @param row the row to check
     * @return true if the row contains the numbers 1-9
     */
    public boolean checkRow(int row)  {
        ArrayList<String> sudokuLine = new ArrayList<String>();
        int x = (row-1);
        sudokuLine.add(this.sudoku.get(0+(9*x)));
        sudokuLine.add(this.sudoku.get(1+(9*x)));
        sudokuLine.add(this.sudoku.get(2+(9*x)));
        sudokuLine.add(this.sudoku.get(3+(9*x)));
        sudokuLine.add(this.sudoku.get(4+(9*x)));
        sudokuLine.add(this.sudoku.get(5+(9*x)));
        sudokuLine.add(this.sudoku.get(6+(9*x)));
        sudokuLine.add(this.sudoku.get(7+(9*x)));
        sudokuLine.add(this.sudoku.get(8+(9*x)));
        return checkSolveLine(sudokuLine);
    }

    /**
     * Sends a column to be checked for the numbers 1-9
     * @param column the column to check
     * @return true if the column contains the numbers 1-9
     */
    public boolean checkColumn(int column) {
        ArrayList<String> sudokuLine = new ArrayList<String>();
        int x = (column-1);
        sudokuLine.add(this.sudoku.get(0+x));
        sudokuLine.add(this.sudoku.get(9+x));
        sudokuLine.add(this.sudoku.get(18+x));
        sudokuLine.add(this.sudoku.get(27+x));
        sudokuLine.add(this.sudoku.get(36+x));
        sudokuLine.add(this.sudoku.get(45+x));
        sudokuLine.add(this.sudoku.get(54+x));
        sudokuLine.add(this.sudoku.get(63+x));
        sudokuLine.add(this.sudoku.get(72+x));
        return checkSolveLine(sudokuLine);
    }

    /**
     * Sends a box to be checked for the numbers 1-9
     * @param box the box to check
     * @return true if the box contains the numbers 1-9
     */
    public boolean checkBox123(int box)  {
        ArrayList<String> sudokuLine = new ArrayList<String>();
        int x = (box-1);
        sudokuLine.add(this.sudoku.get(0+(3*x)));
        sudokuLine.add(this.sudoku.get(1+(3*x)));
        sudokuLine.add(this.sudoku.get(2+(3*x)));
        sudokuLine.add(this.sudoku.get(9+(3*x)));
        sudokuLine.add(this.sudoku.get(10+(3*x)));
        sudokuLine.add(this.sudoku.get(11+(3*x)));
        sudokuLine.add(this.sudoku.get(18+(3*x)));
        sudokuLine.add(this.sudoku.get(19+(3*x)));
        sudokuLine.add(this.sudoku.get(20+(3*x)));
        return checkSolveLine(sudokuLine);
    }

    /**
     * Sends a box to be checked for the numbers 1-9
     * @param box the box to check
     * @return true if the box contains the numbers 1-9
     */
    public boolean checkBox456(int box)  {
        ArrayList<String> sudokuLine = new ArrayList<String>();
        int x = (box-4);
        sudokuLine.add(this.sudoku.get(27+(3*x)));
        sudokuLine.add(this.sudoku.get(28+(3*x)));
        sudokuLine.add(this.sudoku.get(29+(3*x)));
        sudokuLine.add(this.sudoku.get(36+(3*x)));
        sudokuLine.add(this.sudoku.get(37+(3*x)));
        sudokuLine.add(this.sudoku.get(38+(3*x)));
        sudokuLine.add(this.sudoku.get(45+(3*x)));
        sudokuLine.add(this.sudoku.get(46+(3*x)));
        sudokuLine.add(this.sudoku.get(47+(3*x)));
        return checkSolveLine(sudokuLine);
    }

    /**
     * Sends a box to be checked for the numbers 1-9
     * @param box the box to check
     * @return true if the box contains the numbers 1-9
     */
    public boolean checkBox789(int box)  {
        ArrayList<String> sudokuLine = new ArrayList<String>();
        int x = (box-7);
        sudokuLine.add(this.sudoku.get(54+(3*x)));
        sudokuLine.add(this.sudoku.get(55+(3*x)));
        sudokuLine.add(this.sudoku.get(56+(3*x)));
        sudokuLine.add(this.sudoku.get(63+(3*x)));
        sudokuLine.add(this.sudoku.get(64+(3*x)));
        sudokuLine.add(this.sudoku.get(65+(3*x)));
        sudokuLine.add(this.sudoku.get(72+(3*x)));
        sudokuLine.add(this.sudoku.get(73+(3*x)));
        sudokuLine.add(this.sudoku.get(74+(3*x)));
        return checkSolveLine(sudokuLine);
    }

    /**
     * Calls to check every single row in the sudoku
     * @return true if all rows contains the numbers 1-9
     */
    public boolean checkRows() {
        if (checkRow(1) && checkRow(2) && checkRow(3) && checkRow(4) && checkRow(5) && checkRow(6) &&
                checkRow(7) && checkRow(8) && checkRow(9))
            return true;
        else return false;
    }

    /**
     * Calls to check every single column in the sudoku
     * @return true if all columns contains the numbers 1-9
     */
        public boolean checkColumns() {
            if (checkColumn(1) && checkColumn(2) && checkColumn(3) &&
        checkColumn(4) && checkColumn(5) && checkColumn(6) && checkColumn(7) && checkColumn(8) && checkColumn(9))
            return true;
        else return false;
    }

    /**
     * Calls to check every single box in the sudoku
     * @return true if all boxes contains the numbers 1-9
     */
    public boolean checkBoxes() {
        if (checkBox123(1) && checkBox123(2) && checkBox123(3) &&
                checkBox456(4) && checkBox456(5) && checkBox456(6) &&
                checkBox789(7) && checkBox789(8) && checkBox789(9))
            return true;
        else return false;
    }

    public void mergeArrayLists(ArrayList<String> mergeList)
    {
        getSudokuSolver().addAll(mergeList);
    }

    /**
     * returns the sudoku saved in the solver
     * @return the sudoku as an ArrayList
     */
    public ArrayList<String> getSudokuSolver() {
        return sudoku;
    }

    /**
     * sets the sudoku in the solver
     * @param sudoku an arraylist with strings containing the sudoku
     */
    public void setSudoku(ArrayList<String> sudoku) {
        this.sudoku = sudoku;
    }
}
