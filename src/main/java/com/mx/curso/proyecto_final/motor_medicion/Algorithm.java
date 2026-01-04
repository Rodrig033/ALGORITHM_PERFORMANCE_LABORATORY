package com.mx.curso.proyecto_final.motor_medicion;

public interface Algorithm<T> {
    void execute(T data);
    String getName();
}
