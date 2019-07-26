package com.dao;

public interface Cached {

    Boolean set(String key, Object value);

    Boolean delete(String key);

    Object get(String key);

}
