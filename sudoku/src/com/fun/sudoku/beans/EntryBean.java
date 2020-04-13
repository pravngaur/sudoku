package com.fun.sudoku.beans;

public class EntryBean{
    private int xPosition;
    private int yPosition;
    private int value;

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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    /* @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + value;
        result = prime * result + xPosition;
        result = prime * result + yPosition;
        return result;
    } */

    @Override
    public boolean equals(Object obj) {
        
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EntryBean other = (EntryBean) obj;
        if (value != other.value)
            return false;
        /* if (xPosition != other.xPosition)
            return false;
        if (yPosition != other.yPosition)
            return false; */
        return true;
    }

    

}

