package com.mx.curso.proyecto_final.modulo_estadistica.analisis;

import com.mx.curso.proyecto_final.motor_medicion.MeasurementResult;

public interface AnalysisService {

    AnalysisResult analyze(MeasurementResult result);
}