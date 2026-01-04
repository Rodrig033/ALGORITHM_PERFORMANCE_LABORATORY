package com.mx.curso.modulo_estadistica.visualizacion;
import java.util.List;

public interface ChartData {
    String getTitle();
    String getxAxisLabel();
    String getyAxisLabel();
    List<Integer> getXValues();
    List<Double> getYValues();
}
