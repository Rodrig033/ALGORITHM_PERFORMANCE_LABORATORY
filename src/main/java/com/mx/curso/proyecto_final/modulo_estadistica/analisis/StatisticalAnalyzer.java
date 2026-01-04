package com.mx.curso.proyecto_final.modulo_estadistica.analisis;
import com.mx.curso.unidad4.motor_medicion.MeasurementResult;

public interface StatisticalAnalyzer {
    AnalysisResult analyze(MeasurementResult measurementResult);
}
