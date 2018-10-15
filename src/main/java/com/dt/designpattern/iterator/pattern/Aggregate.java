package com.dt.designpattern.iterator.pattern;

/**
 * 代表了一个集合类
 *
 */
public interface Aggregate<T> {

    public Iterator<T> iterator();
}
