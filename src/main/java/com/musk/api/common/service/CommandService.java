package com.musk.api.common.service;
import com.musk.api.component.Messenger;

public interface CommandService<T> {
    Messenger save(T t);
    Messenger deleteById(Long id);
    Messenger modify(T t);
}
