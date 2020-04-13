package com.fun.sudoku.beans;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class MasterBean{
    private int[] inputDataMaster;
    private CubeBeans[] cubeBeansMaster;
    private LinkedHashSet<EntryBean> masterLinkedSet;
    private LinkedHashSet<EntryBean> row_1;
    private LinkedHashSet<EntryBean> row_2;
    private LinkedHashSet<EntryBean> row_3;
    private LinkedHashSet<EntryBean> row_4;
    private LinkedHashSet<EntryBean> row_5;
    private LinkedHashSet<EntryBean> row_6;
    private LinkedHashSet<EntryBean> row_7;
    private LinkedHashSet<EntryBean> row_8;
    private LinkedHashSet<EntryBean> row_9;
    private LinkedHashSet<EntryBean> column_1;
    private LinkedHashSet<EntryBean> column_2;
    private LinkedHashSet<EntryBean> column_3;
    private LinkedHashSet<EntryBean> column_4;
    private LinkedHashSet<EntryBean> column_5;
    private LinkedHashSet<EntryBean> column_6;
    private LinkedHashSet<EntryBean> column_7;
    private LinkedHashSet<EntryBean> column_8;
    private LinkedHashSet<EntryBean> column_9;
    private HashMap<String,EntryBean> positionMap;

    public int[] getInputDataMaster() {
        return inputDataMaster;
    }

    public void setInputDataMaster(int[] inputDataMaster) {
        this.inputDataMaster = inputDataMaster;
    }

    public CubeBeans[] getCubeBeansMaster() {
        return cubeBeansMaster;
    }

    public void setCubeBeansMaster(CubeBeans[] cubeBeansMaster) {
        this.cubeBeansMaster = cubeBeansMaster;
    }

    public LinkedHashSet<EntryBean> getMasterLinkedSet() {
        return masterLinkedSet;
    }

    public void setMasterLinkedSet(LinkedHashSet<EntryBean> masterLinkedSet) {
        this.masterLinkedSet = masterLinkedSet;
    }

    public LinkedHashSet<EntryBean> getRow_1() {
        return row_1;
    }

    public void setRow_1(LinkedHashSet<EntryBean> row_1) {
        this.row_1 = row_1;
    }

    public LinkedHashSet<EntryBean> getRow_2() {
        return row_2;
    }

    public void setRow_2(LinkedHashSet<EntryBean> row_2) {
        this.row_2 = row_2;
    }

    public LinkedHashSet<EntryBean> getRow_3() {
        return row_3;
    }

    public void setRow_3(LinkedHashSet<EntryBean> row_3) {
        this.row_3 = row_3;
    }

    public LinkedHashSet<EntryBean> getRow_4() {
        return row_4;
    }

    public void setRow_4(LinkedHashSet<EntryBean> row_4) {
        this.row_4 = row_4;
    }

    public LinkedHashSet<EntryBean> getRow_5() {
        return row_5;
    }

    public void setRow_5(LinkedHashSet<EntryBean> row_5) {
        this.row_5 = row_5;
    }

    public LinkedHashSet<EntryBean> getRow_6() {
        return row_6;
    }

    public void setRow_6(LinkedHashSet<EntryBean> row_6) {
        this.row_6 = row_6;
    }

    public LinkedHashSet<EntryBean> getRow_7() {
        return row_7;
    }

    public void setRow_7(LinkedHashSet<EntryBean> row_7) {
        this.row_7 = row_7;
    }

    public LinkedHashSet<EntryBean> getRow_8() {
        return row_8;
    }

    public void setRow_8(LinkedHashSet<EntryBean> row_8) {
        this.row_8 = row_8;
    }

    public LinkedHashSet<EntryBean> getRow_9() {
        return row_9;
    }

    public void setRow_9(LinkedHashSet<EntryBean> row_9) {
        this.row_9 = row_9;
    }

    public LinkedHashSet<EntryBean> getColumn_1() {
        return column_1;
    }

    public void setColumn_1(LinkedHashSet<EntryBean> column_1) {
        this.column_1 = column_1;
    }

    public LinkedHashSet<EntryBean> getColumn_2() {
        return column_2;
    }

    public void setColumn_2(LinkedHashSet<EntryBean> column_2) {
        this.column_2 = column_2;
    }

    public LinkedHashSet<EntryBean> getColumn_3() {
        return column_3;
    }

    public void setColumn_3(LinkedHashSet<EntryBean> column_3) {
        this.column_3 = column_3;
    }

    public LinkedHashSet<EntryBean> getColumn_4() {
        return column_4;
    }

    public void setColumn_4(LinkedHashSet<EntryBean> column_4) {
        this.column_4 = column_4;
    }

    public LinkedHashSet<EntryBean> getColumn_5() {
        return column_5;
    }

    public void setColumn_5(LinkedHashSet<EntryBean> column_5) {
        this.column_5 = column_5;
    }

    public LinkedHashSet<EntryBean> getColumn_6() {
        return column_6;
    }

    public void setColumn_6(LinkedHashSet<EntryBean> column_6) {
        this.column_6 = column_6;
    }

    public LinkedHashSet<EntryBean> getColumn_7() {
        return column_7;
    }

    public void setColumn_7(LinkedHashSet<EntryBean> column_7) {
        this.column_7 = column_7;
    }

    public LinkedHashSet<EntryBean> getColumn_8() {
        return column_8;
    }

    public void setColumn_8(LinkedHashSet<EntryBean> column_8) {
        this.column_8 = column_8;
    }

    public LinkedHashSet<EntryBean> getColumn_9() {
        return column_9;
    }

    public void setColumn_9(LinkedHashSet<EntryBean> column_9) {
        this.column_9 = column_9;
    }

    public HashMap<String, EntryBean> getPositionMap() {
        if(positionMap == null){
            positionMap = new HashMap<String, EntryBean>();
        }
        return positionMap;
    }

    public void setPositionMap(HashMap<string, EntryBean> positionMap) {
        this.positionMap = positionMap;
    }

    
}