package com.korartur.utils;

import java.util.List;

public class NestedIntegerImpl implements NestedInteger{

    private Integer value;
    private List<NestedInteger> list;
    private boolean  isInteger;

    public NestedIntegerImpl(Integer value, List<NestedInteger> list, boolean isInteger){
        this.value = value;
        this.list = list;
        this.isInteger = isInteger;
    }

    @Override
    public boolean isInteger() {
        return isInteger;
    }

    @Override
    public Integer getInteger() {
        return value;
    }

    @Override
    public List<NestedInteger> getList() {
        return list;
    }
}
