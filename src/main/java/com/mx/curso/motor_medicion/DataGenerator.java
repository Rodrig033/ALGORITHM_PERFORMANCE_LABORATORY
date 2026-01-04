package com.mx.curso.motor_medicion;

public interface DataGenerator<T> {
    T generate(int size, Scenario scenario);
}
