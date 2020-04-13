package com.fun.sudoku.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

import com.fun.sudoku.beans.CubeBean;
import com.fun.sudoku.beans.EntryBean;
import com.fun.sudoku.beans.MasterBean;
import com.sun.org.apache.xpath.internal.operations.Number;

public class InitCubeBeans{

    private void initCubeBeansMaster(MasterBean masterBean){
        CubeBeans[] cubeBeansMaster = CubeBean[9];
        CubeBeans cube_1 = new CubeBeans();
        CubeBeans cube_2 = new CubeBeans();
        CubeBeans cube_3 = new CubeBeans();
        CubeBeans cube_4 = new CubeBeans();
        CubeBeans cube_5 = new CubeBeans();
        CubeBeans cube_6 = new CubeBeans();
        CubeBeans cube_7 = new CubeBeans();
        CubeBeans cube_8 = new CubeBeans();
        CubeBeans cube_9 = new CubeBeans();

        HashMap<String, EntryBean> positionMap = masterBean.getPositionMap();

        //init cube_1
        for(x=0, y=0; x<=2 && y<=2; ){
            String key = new Number(x).toString() + "_" + new Number(y).toString();
            LinkedHashSet<Integer> numbersInCube = new LinkedHashSet<Integer>();
            List<Integer> missingNumbers = new ArrayList<Integer>();
            addNumbersToArray(missingNumbers);
            cube_1.setxPosition(0);
            cube_1.setyPosition(0);
            EntryBean bean = positionMap.get(key);
            numbersInCube.add(bean.getValue());
            missingNumbers.remove(bean.getValue());
        }
    }

    private void addNumbersToArray(List<Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
    }

    

    private void createRowsAndColumns(MasterBean masterBean){
        
        int[] inputRows = masterBean.getInputDataMaster();
        // return variables
        CubeBeans[] cubeBeansMaster;
        LinkedHashSet<EntryBean> masterLinkedSet;
        EntryBean[] rows;
        EntryBean[] columns;
        HashMap<String, EntryBean> positionMap = masterBean.getPositionMap();
        
        //start processing
        int y = 0;
        for (int[] row : inputRows) {
            
            int x = 0;
            for (int entry : row) {
                EntryBean bean = new EntryBean();    
                bean.setValue(entry);
                bean.setxPosition(x);
                bean.setyPosition(y);
                LinkedHashSet<EntryBean> tempRow = determineAndInitializeRow(x,masterBean);
                LinkedHashSet<EntryBean> tempColumn = determineAndInitializeColumns(x,masterBean);
                
                tempRow.add(bean);
                tempColumn.add(bean);
                positionMap.put((new Number(x)).toString()+'_'+(new Number(y)).toString(), value);
                x++;
            }
            y++;
        }
    }

    private determineAndInitializeRow(int x, MasterBean masterBean){
        LinkedHashSet<EntryBean> tempRow;
        if(masterBean != null){
            switch (x){
                case 0 :{
                    tempRow = masterBean.getRow_1();
                    if(masterBean.getRow_1() == null){
                        tempRow = new LinkedHashSet<EntryBean>();
                        masterBean.setRow_1(tempRow);
                    }
                    return masterBean.getRow_1();
                }
                case 1 :{
                    tempRow = masterBean.getRow_2();
                    if(masterBean.getRow_2() == null){
                        tempRow = new LinkedHashSet<EntryBean>();
                        masterBean.setRow_2(tempRow);
                    }
                    return masterBean.getRow_2();
                }
                case 2 :{
                    tempRow = masterBean.getRow_3();
                    if(masterBean.getRow_3() == null){
                        tempRow = new LinkedHashSet<EntryBean>();
                        masterBean.setRow_3(tempRow);
                    }
                    return masterBean.getRow_3();
                }
                case 3 :{
                    tempRow = masterBean.getRow_4();
                    if(masterBean.getRow_4() == null){
                        tempRow = new LinkedHashSet<EntryBean>();
                        masterBean.setRow_4(tempRow);
                    }
                    return masterBean.getRow_4();
                }
                case 4 :{
                    tempRow = masterBean.getRow_5();
                    if(masterBean.getRow_5() == null){
                        tempRow = new LinkedHashSet<EntryBean>();
                        masterBean.setRow_5(tempRow);
                    }
                    return masterBean.getRow_5();
                }
                case 5 :{
                    tempRow = masterBean.getRow_6();
                    if(masterBean.getRow_6() == null){
                        tempRow = new LinkedHashSet<EntryBean>();
                        masterBean.setRow_6(tempRow);
                    }
                    return masterBean.getRow_6();
                }
                case 6 :{
                    tempRow = masterBean.getRow_7();
                    if(masterBean.getRow_7() == null){
                        tempRow = new LinkedHashSet<EntryBean>();
                        masterBean.setRow_7(tempRow);
                    }
                    return masterBean.getRow_7();
                }
                case 7 :{
                    tempRow = masterBean.getRow_8();
                    if(masterBean.getRow_8() == null){
                        tempRow = new LinkedHashSet<EntryBean>();
                        masterBean.setRow_8(tempRow);
                    }
                    return masterBean.getRow_8();
                }
                case 8 :{
                    tempRow = masterBean.getRow_9();
                    if(masterBean.getRow_9() == null){
                        tempRow = new LinkedHashSet<EntryBean>();
                        masterBean.setRow_9(tempRow);
                    }
                    return masterBean.getRow_9();
                }
            }
        }
    }

    private determineAndInitializeColumns(int x, MasterBean masterBean){
        LinkedHashSet<EntryBean> tempColumn;
        if(masterBean != null){
            switch (x){
                case 0 :{
                    tempColumn = masterBean.getColumn_1();
                    if(masterBean.getColumn_1() == null){
                        tempColumn = new LinkedHashSet<EntryBean>();
                        masterBean.setColumn_1(tempColumn);
                    }
                    return masterBean.getColumn_1();
                }
                case 1 :{
                    tempColumn = masterBean.getColumn_2();
                    if(masterBean.getColumn_2() == null){
                        tempColumn = new LinkedHashSet<EntryBean>();
                        masterBean.setColumn_2(tempColumn);
                    }
                    return masterBean.getColumn_2();
                }
                case 2 :{
                    tempColumn = masterBean.getColumn_3();
                    if(masterBean.getColumn_3() == null){
                        tempColumn = new LinkedHashSet<EntryBean>();
                        masterBean.setColumn_3(tempColumn);
                    }
                    return masterBean.getColumn_3();
                }
                case 3 :{
                    tempColumn = masterBean.getColumn_4();
                    if(masterBean.getColumn_4() == null){
                        tempColumn = new LinkedHashSet<EntryBean>();
                        masterBean.setColumn_4(tempColumn);
                    }
                    return masterBean.getColumn_4();
                }
                case 4 :{
                    tempColumn = masterBean.getColumn_5();
                    if(masterBean.getColumn_5() == null){
                        tempColumn = new LinkedHashSet<EntryBean>();
                        masterBean.setColumn_5(tempColumn);
                    }
                    return masterBean.getColumn_5();
                }
                case 5 :{
                    tempColumn = masterBean.getColumn_6();
                    if(masterBean.getColumn_6() == null){
                        tempColumn = new LinkedHashSet<EntryBean>();
                        masterBean.setColumn_6(tempColumn);
                    }
                    return masterBean.getColumn_6();
                }
                case 6 :{
                    tempColumn = masterBean.getColumn_7();
                    if(masterBean.getColumn_7() == null){
                        tempColumn = new LinkedHashSet<EntryBean>();
                        masterBean.setColumn_7(tempColumn);
                    }
                    return masterBean.getColumn_7();
                }
                case 7 :{
                    tempColumn = masterBean.getColumn_8();
                    if(masterBean.getColumn_8() == null){
                        tempColumn = new LinkedHashSet<EntryBean>();
                        masterBean.setColumn_8(tempColumn);
                    }
                    return masterBean.getColumn_8();
                }
                case 8 :{
                    tempColumn = masterBean.getColumn_9();
                    if(masterBean.getColumn_9() == null){
                        tempColumn = new LinkedHashSet<EntryBean>();
                        masterBean.setColumn_9(tempColumn);
                    }
                    return masterBean.getColumn_9();
                }
            }
        }
    }
}