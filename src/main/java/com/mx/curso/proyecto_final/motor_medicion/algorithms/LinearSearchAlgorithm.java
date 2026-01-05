package com.mx.curso.proyecto_final.motor_medicion.algorithms;
import com.mx.curso.proyecto_final.motor_medicion.Algorithm;

public class LinearSearchAlgorithm implements Algorithm<int[]> {

    @Override
    public void execute(int[] data) {
        if (data == null) {
            return;
        }

        int target = data.length > 0 ? data[0] : 0;

        for (int value : data) {
            if (value == target) {
                return;
            }
        }
    }

    @Override
    public String getName() {
        return "Linear Search";
    }
}