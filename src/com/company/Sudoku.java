package com.company;

import java.util.Random;

class Sudoku {
    private Random random = new Random();
    int[][] sudoku = new int[9][9];

    public void filler(){
        for (int row = 0; row < 9; row++){
            for (int col = 0; col < 9; col++){
                boolean passed = false;
                while (passed == false){
                    sudoku[row][col] = random.nextInt(9) + 1;
                    if (checkRow(row, col) && checkColumn(row, col) && checkSquare(row, col)){
                        passed = true;
                    }
                    else continue;
                }

            }
        }
    }

    private boolean checkRow(int row, int col){
        for (int i = 0; i < 9; i++){
            if (sudoku[i][col] == sudoku[row][col]){
                if (i == row) continue;
                else return false;
            }
        }
        return true;
    }

    private boolean checkColumn(int row, int col){
        for (int i = 0; i < 9; i++){
            if (sudoku[row][i] == sudoku[row][col]){
                if (i == col) continue;
                else return false;
            }
        }
        return true;
    }

    private boolean checkSquare(int row, int col){
        Square square = new Square();
        int rowBeg = square.RowBeg(row);
        int rowEnd = square.RowEnd(row);
        int colBeg = square.ColBeg(col);
        int colEnd = square.ColEnd(col);
        for (int i = rowBeg; i <= rowEnd; i++){
            for (int j = colBeg; j <+ colEnd; j++){
                if (sudoku [row][col] == sudoku [i][j]){
                    if ( row == i && col == j ) continue;
                    else return false;
                }
            }
        }
        return true;
    }

    public void printSudoku() {
        filler();
        System.out.print("Sudoku: \n");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
