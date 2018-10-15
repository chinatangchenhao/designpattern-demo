package com.dt.designpattern.iterator.pattern;

/**
 * 定义一个我们自己的迭代器接口
 *
 */
public interface Iterator<T> {

    public boolean hasNext();

    public T next();
}
