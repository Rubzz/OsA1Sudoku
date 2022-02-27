module Group14.SudokuSolver
{
        requires javafx.graphics;
        requires javafx.controls;
        requires javafx.fxml;
        requires java.logging;
        requires java.desktop;

        opens Group14.SudokuSolver to javafx.fxml;
        exports Group14.SudokuSolver;

        }