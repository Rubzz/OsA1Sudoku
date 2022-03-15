package Group14.SudokuSolver;

import java.util.ArrayList;


public class SudokuSolver implements Runnable  {
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

    public boolean checkBox123(int boxColumn)  {
        ArrayList<String> sudokuLine = new ArrayList<String>();
        int x = (boxColumn-1);
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

    public boolean checkBox456(int boxColumn)  {
        ArrayList<String> sudokuLine = new ArrayList<String>();
        int x = (boxColumn-1);
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

    public boolean checkBox789(int boxColumn)  {
        ArrayList<String> sudokuLine = new ArrayList<String>();
        int x = (boxColumn-1);
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

    public boolean checkRows() {
        if (checkRow(1) && checkRow(2) && checkRow(3) && checkRow(4) && checkRow(5) && checkRow(6) &&
                checkRow(7) && checkRow(8) && checkRow(9))
            return true;
        else return false;
    }

        public boolean checkColumns() {
            if (checkColumn(1) && checkColumn(2) && checkColumn(3) &&
        checkColumn(4) && checkColumn(5) && checkColumn(6) && checkColumn(7) && checkColumn(8) && checkColumn(9))
            return true;
        else return false;
    }

    public boolean checkBoxes() {
        if (checkBox123(1) && checkBox123(2) && checkBox123(3) &&
                checkBox456(1) && checkBox456(2) && checkBox456(3) &&
                checkBox789(1) && checkBox789(2) && checkBox789(3))
            return true;
        else return false;
    }

    public void mergeArrayLists(ArrayList<String> mergeList)
    {
        getSudokuSolver().addAll(mergeList);
    }

    public ArrayList<String> getSudokuSolver()
    {
        return sudoku;
    }

    @Override
    public void run() {

    }

//     public void run()  {
//        System.out.println("My first thread is running…");
//     }
//    public void addCorrectSudoku() {
//        this.sudoku.add("9");
//        this.sudoku.add("2");
//        this.sudoku.add("5");
//        this.sudoku.add("6");
//        this.sudoku.add("3");
//        this.sudoku.add("1");
//        this.sudoku.add("8");
//        this.sudoku.add("4");
//        this.sudoku.add("7");
//        this.sudoku.add("6");
//        this.sudoku.add("1");
//        this.sudoku.add("8");
//        this.sudoku.add("5");
//        this.sudoku.add("7");
//        this.sudoku.add("4");
//        this.sudoku.add("2");
//        this.sudoku.add("9");
//        this.sudoku.add("3");
//        this.sudoku.add("3");
//        this.sudoku.add("7");
//        this.sudoku.add("4");
//        this.sudoku.add("9");
//        this.sudoku.add("8");
//        this.sudoku.add("2");
//        this.sudoku.add("5");
//        this.sudoku.add("6");
//        this.sudoku.add("1");
//        this.sudoku.add("7");
//        this.sudoku.add("4");
//        this.sudoku.add("9");
//        this.sudoku.add("8");
//        this.sudoku.add("2");
//        this.sudoku.add("6");
//        this.sudoku.add("1");
//        this.sudoku.add("3");
//        this.sudoku.add("5");
//        this.sudoku.add("8");
//        this.sudoku.add("5");
//        this.sudoku.add("2");
//        this.sudoku.add("4");
//        this.sudoku.add("1");
//        this.sudoku.add("3");
//        this.sudoku.add("9");
//        this.sudoku.add("7");
//        this.sudoku.add("6");
//        this.sudoku.add("1");
//        this.sudoku.add("6");
//        this.sudoku.add("3");
//        this.sudoku.add("7");
//        this.sudoku.add("9");
//        this.sudoku.add("5");
//        this.sudoku.add("4");
//        this.sudoku.add("8");
//        this.sudoku.add("2");
//        this.sudoku.add("2");
//        this.sudoku.add("8");
//        this.sudoku.add("7");
//        this.sudoku.add("3");
//        this.sudoku.add("5");
//        this.sudoku.add("9");
//        this.sudoku.add("6");
//        this.sudoku.add("1");
//        this.sudoku.add("4");
//        this.sudoku.add("4");
//        this.sudoku.add("9");
//        this.sudoku.add("1");
//        this.sudoku.add("2");
//        this.sudoku.add("6");
//        this.sudoku.add("7");
//        this.sudoku.add("3");
//        this.sudoku.add("5");
//        this.sudoku.add("8");
//        this.sudoku.add("5");
//        this.sudoku.add("3");
//        this.sudoku.add("6");
//        this.sudoku.add("1");
//        this.sudoku.add("4");
//        this.sudoku.add("8");
//        this.sudoku.add("7");
//        this.sudoku.add("2");
//        this.sudoku.add("9");
//    }
}
