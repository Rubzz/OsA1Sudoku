package Group14.SudokuSolver;

import java.util.ArrayList;


public class SudokuSolver implements Runnable  {
    private String threadName;        //Name of the running thread
    private ArrayList<String> sudoku;  //The full sudoku table
    private Thread t;
    private int testsPassed =0;
    private int allPassed=27;


    public SudokuSolver(String threadStatus)
    {
        this.threadName = threadStatus;
        sudoku = new ArrayList();

    }

    @Override
    public void run()
    {
        System.out.println("");
        System.out.println("Running " +  threadName );
        if( threadName == "RowChecker" ){
            this.checkRows();
        }
        else if( threadName == "ColumnChecker" ){
            this.checkColumns();
        }
        else if( threadName == "BoxChecker"){
            this.checkBoxes();
        }
        else if (threadName == "Sudoku result")
        {
            checkSudoku();
        }
//        try {
//            wait(200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }

    public void checkSudoku()
    {

        if (!(testsPassed==allPassed))
        {
            System.out.println("This sudoku table is not valid!");
        }

        else if ((testsPassed==allPassed))
        {
            System.out.println("This sudoku table is valid!");
        }
    }

    /**
     * Checks an array of 9 strings if they contain the numbers from 1-9 and returns true if they do.
     * @param sudokuLine the array to check
     * @return true or false based on if the array contains 1-9 or not
     */
    public boolean checkSolveLine(ArrayList<String> sudokuLine) {

        if (!(sudokuLine.contains("1") && sudokuLine.contains("2") && sudokuLine.contains("3") &&
                sudokuLine.contains("4") && sudokuLine.contains("5") && sudokuLine.contains("6") &&
                sudokuLine.contains("7") && sudokuLine.contains("8") && sudokuLine.contains("9"))) {
            System.out.println(threadName+" line is invalid");
            return false;
        }
        else  {
            System.out.println(threadName+" line is valid");
            testsPassed++;

            return true;
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

//    public String getThreadName() {
//        return threadName;
//    }

    public void mergeArrayLists(ArrayList<String> mergeList)
    {
        getSudokuSolver().addAll(mergeList);
    }

    public ArrayList<String> getSudokuSolver()
    {
        return sudoku;
    }

    public void start () {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this);
            t.start();
            t.setName(threadName);
        }
    }


//    private void addNumber(int number) {
//        this.sudoku.add("" + number);
//    }
//
//    private void addSudokuLine() {
//        this.sudoku.add("1");
//        this.sudoku.add("2");
//        this.sudoku.add("3");
//        this.sudoku.add("4");
//        this.sudoku.add("5");
//        this.sudoku.add("6");
//        this.sudoku.add("7");
//        this.sudoku.add("8");
//        this.sudoku.add("9");
//    }

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
