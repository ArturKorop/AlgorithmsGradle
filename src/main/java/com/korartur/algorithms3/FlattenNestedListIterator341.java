package com.korartur.algorithms3;

import com.korartur.utils.NestedInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class FlattenNestedListIterator341 implements Iterator<Integer> {

    private List<NestedInteger> list;
    private int listIndex;
    private NestedInteger value;

    private Stack<NestedInteger> currents = new Stack<>();
    private Stack<Integer> curIndexes = new Stack<>();

    public FlattenNestedListIterator341(List<NestedInteger> nestedList) {
        list = nestedList;
        if(list == null || list.size() == 0) return;
        listIndex = 0;
        while (value == null && listIndex < list.size()){
            initNext(list.get(listIndex));
            listIndex++;
        }
        listIndex--;

    }

    @Override
    public boolean hasNext() {
        return value != null;
    }

    @Override
    public Integer next() {
        Integer res = value.getInteger();
        value = null;
        updateValue();
        if(value == null){
            listIndex++;
            while (value == null && listIndex < list.size()){
                initNext(list.get(listIndex));
                listIndex++;
            }

            listIndex--;
        }

        return res;
    }

    private void initNext(NestedInteger current) {
        int index = 0;
        while (!current.isInteger()) {
            if(current.getList().size() > 0) {
                currents.push(current);
                curIndexes.push(0);
                current = current.getList().get(0);
            } else {
                current = null;
                updateValue();
                break;
            }
        }

        if(value == null) {
            value = current;
        }
    }

    private void updateValue() {
        if (currents == null || currents.size() == 0) return;

        NestedInteger cur = currents.peek();
        int curIndex = curIndexes.pop();
        curIndex++;

        if (curIndex == cur.getList().size()) {
            currents.pop();
            updateValue();
        } else {
            if (cur.getList().get(curIndex).isInteger()) {
                value = cur.getList().get(curIndex);
                curIndexes.push(curIndex);
            } else {
                curIndexes.push(curIndex);
                initNext(cur.getList().get(curIndex));
            }
        }
    }
}
