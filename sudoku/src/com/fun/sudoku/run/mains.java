package com.fun.sudoku.run;

import com.fun.sudoku.beans.EntryBean;
import com.fun.sudoku.beans.CubeBean;

public class mains{
    public static void main(String[] args) {
        EntryBean bean = new EntryBean();
        bean.setxPosition(1);
        bean.setyPosition(1);
        System.out.println(bean);
    }
}
