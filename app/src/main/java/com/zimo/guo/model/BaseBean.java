package com.zimo.guo.model;


import java.io.Serializable;


public class BaseBean<T> implements Serializable{

    private int numRows;
    private ResultBean resultObj;
    private T obj;

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public ResultBean getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultBean resultObj) {
        this.resultObj = resultObj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "BaseBean{" +
                "numRows=" + numRows +
                ", resultObj=" + resultObj +
                ", obj=" + obj +
                '}';
    }
}
