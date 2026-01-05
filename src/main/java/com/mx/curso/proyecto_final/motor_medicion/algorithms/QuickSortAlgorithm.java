package com.mx.curso.proyecto_final.motor_medicion.algorithms;
import com.mx.curso.proyecto_final.motor_medicion.Algorithm;

/**
 * Implementación robusta de Quick Sort para experimentos académicos.
 * Evita StackOverflowError incluso en arreglos ordenados o con valores repetidos.
 */
public class QuickSortAlgorithm implements Algorithm<int[]> {

    @Override
    public void execute(int[] data) {
        if (data == null || data.length < 2) {
            return;
        }
        quickSort(data, 0, data.length - 1);
    }

    private void quickSort(int[] data, int low, int high) {
        while (low < high) {
            int pivotIndex = partition(data, low, high);

            // Recurre primero sobre el subarreglo más pequeño
            if (pivotIndex - low < high - pivotIndex) {
                quickSort(data, low, pivotIndex);
                low = pivotIndex + 1;
            } else {
                quickSort(data, pivotIndex + 1, high);
                high = pivotIndex;
            }
        }
    }

    private int partition(int[] data, int low, int high) {
        int pivot = data[(low + high) / 2];

        while (low <= high) {
            while (data[low] < pivot) {
                low++;
            }
            while (data[high] > pivot) {
                high--;
            }

            if (low <= high) {
                swap(data, low, high);
                low++;
                high--;
            }
        }
        return high;
    }

    private void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    @Override
    public String getName() {
        return "Quick Sort";
    }
}
