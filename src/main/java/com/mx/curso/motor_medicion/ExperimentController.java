package com.mx.curso.motor_medicion;

public interface ExperimentController<T> {
    MeasurementResult runExperiment(
            Algorithm<T> algorithm,
            DataGenerator<T> generator,
            int size,
            Scenario scenario,
            int repetitions
    );
}
