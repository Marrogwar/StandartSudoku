package com.company;

public class Square {
    public int RowBeg(int row){
        int value = row;
        int ret = 0;
        switch (value) {
            case 0:
            case 1:
            case 2:
                ret = 0;
                break;
            case 3:
            case 4:
            case 5:
                ret = 3;
                break;
            case 6:
            case 7:
            case 8:
                ret = 6;
                break;
        }
        return ret;
    }

    public int RowEnd(int row){
        int value = row;
        int ret = 0;
        switch (value) {
            case 0:
            case 1:
            case 2:
                ret = 2;
                break;
            case 3:
            case 4:
            case 5:
                ret = 5;
                break;
            case 6:
            case 7:
            case 8:
                ret = 8;
                break;
        }
        return ret;
    }

    public int ColBeg(int col){
        int value = col;
        int ret = 0;
        switch (value) {
            case 0:
            case 1:
            case 2:
                ret = 0;
                break;
            case 3:
            case 4:
            case 5:
                ret = 3;
                break;
            case 6:
            case 7:
            case 8:
                ret = 6;
                break;
        }
        return ret;
    }

    public int ColEnd(int col){
        int value = col;
        int ret = 0;
        switch (value) {
            case 0:
            case 1:
            case 2:
                ret = 2;
                break;
            case 3:
            case 4:
            case 5:
                ret = 5;
                break;
            case 6:
            case 7:
            case 8:
                ret = 8;
                break;
        }
        return ret;
    }
}
