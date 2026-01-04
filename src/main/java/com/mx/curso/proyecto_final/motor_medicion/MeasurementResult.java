package com.mx.curso.proyecto_final.motor_medicion;

public interface MeasurementResult {

    void addMeasurement(long time);

    double getAverageTime();

    int getSampleSize();
}