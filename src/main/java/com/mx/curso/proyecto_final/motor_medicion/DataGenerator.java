package com.mx.curso.proyecto_final.motor_medicion;

public interface DataGenerator<T> {
    T generate(int size, Scenario scenario);
}
