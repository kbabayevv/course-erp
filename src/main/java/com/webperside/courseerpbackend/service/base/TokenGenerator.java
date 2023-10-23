package com.webperside.courseerpbackend.service.base;

public interface TokenGenerator<T> {

    String generator(T obj);
}
