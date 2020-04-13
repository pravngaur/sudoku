package com.fun.sudoku.beans;

import java.util.LinkedHashSet;
import com.fun.sudoku.beans.EntryBean;

public class CubeBean{
    
    private LinkedHashSet<Integer> numbersInCube;
    /* private LinkedHashSet<EntryBean> row_set_2;
    private LinkedHashSet<EntryBean> row_set_3;
    private LinkedHashSet<EntryBean> column_set_1;
    private LinkedHashSet<EntryBean> column_set_2;
    private LinkedHashSet<EntryBean> column_set_3; */
    private int xPosition;
    private int yPosition;
    private List<Integer> missingNumbers;

    
/* 
    public LinkedHashSet<EntryBean> getRow_set_2() {
        return row_set_2;
    }

    public void setRow_set_2(LinkedHashSet<EntryBean> row_set_2) {
        this.row_set_2 = row_set_2;
    }

    public LinkedHashSet<EntryBean> getRow_set_3() {
        return row_set_3;
    }

    public void setRow_set_3(LinkedHashSet<EntryBean> row_set_3) {
        this.row_set_3 = row_set_3;
    }

    public LinkedHashSet<EntryBean> getColumn_set_1() {
        return column_set_1;
    }

    public void setColumn_set_1(LinkedHashSet<EntryBean> column_set_1) {
        this.column_set_1 = column_set_1;
    }

    public LinkedHashSet<EntryBean> getColumn_set_2() {
        return column_set_2;
    }

    public void setColumn_set_2(LinkedHashSet<EntryBean> column_set_2) {
        this.column_set_2 = column_set_2;
    }

    public LinkedHashSet<EntryBean> getColumn_set_3() {
        return column_set_3;
    }

    public void setColumn_set_3(LinkedHashSet<EntryBean> column_set_3) {
        this.column_set_3 = column_set_3;
    } */

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public List<Integer> getMissingNumbers() {
        return missingNumbers;
    }

    public void setMissingNumbers(List<Integer> missingNumbers) {
        this.missingNumbers = missingNumbers;
    }

    public LinkedHashSet<Integer> getNumbersInCube() {
        return numbersInCube;
    }

    public void setNumbersInCube(LinkedHashSet<Integer> numbersInCube) {
        this.numbersInCube = numbersInCube;
    }

    
}