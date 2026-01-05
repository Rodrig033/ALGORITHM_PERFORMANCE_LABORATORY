package com.mx.curso.proyecto_final.modulo_estadistica.analisis;
import com.mx.curso.proyecto_final.motor_medicion.Scenario;

public interface ExperimentMetadata {
    String getAlgorithmName();
    int getInputSize();
    Scenario getScenario();
}

