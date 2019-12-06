package com.caixun.zy_group.entity;

import java.util.List;

public class Result<T> {
    private boolean flag;
    private String message;
    private List<T> rows;

    public Result() {
    }

    public Result(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public Result(boolean flag, String message, List<T> rows) {
        this.flag = flag;
        this.message = message;
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "Result{" +
                "flag=" + flag +
                ", message='" + message + '\'' +
                ", rows=" + rows +
                '}';
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
