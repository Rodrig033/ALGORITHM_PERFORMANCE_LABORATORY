package com.mx.curso.motor_medicion;

public interface Algorithm<T> {
    void execute(T data);
    String getName();
}
