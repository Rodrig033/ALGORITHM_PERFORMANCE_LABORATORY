package com.mx.curso.modulo_estadistica.analisis;

import com.mx.curso.unidad4.motor_medicion.MeasurementResult;

public interface AnalysisService {

    AnalysisResult analyze(MeasurementResult result);
}