package com.mx.curso.proyecto_final.application;

import com.mx.curso.proyecto_final.domain.AlgorithmType;
import com.mx.curso.proyecto_final.modulo_estadistica.analisis.AnalyzedExperiment;
import com.mx.curso.proyecto_final.motor_medicion.Scenario;

public interface ExperimentFacade {

    AnalyzedExperiment runExperiment(
            AlgorithmType algorithmType,
            int inputSize,
            Scenario scenario
    );
}