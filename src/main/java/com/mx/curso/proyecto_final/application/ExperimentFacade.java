package com.mx.curso.proyecto_final.application;

import com.mx.curso.unidad4.domain.AlgorithmType;
import com.mx.curso.unidad4.modulo_estadistica.analisis.AnalyzedExperiment;
import com.mx.curso.unidad4.motor_medicion.Scenario;

public interface ExperimentFacade {

    AnalyzedExperiment runExperiment(
            AlgorithmType algorithmType,
            int inputSize,
            Scenario scenario
    );
}