package com.mx.curso.motor_medicion;

public interface MeasurementResult {

    void addMeasurement(long time);

    double getAverageTime();

    int getSampleSize();
}