# 🧪🧑🏽‍💻 Algorithm Performance Laboratory

![Java](https://img.shields.io/badge/Java-24-blue)
![License](https://img.shields.io/badge/License-MIT-green)
![Build](https://img.shields.io/badge/Build-Pending-orange)

Laboratorio educativo para la medición, análisis y visualización del
rendimiento de algoritmos clásicos en Java.

---

## Descripción General 📑

Este proyecto implementa un entorno experimental controlado para la evaluación empírica de la complejidad algorítmica. Permite ejecutar
algoritmos de ordenamiento y búsqueda bajo distintos tamaños de entrada y escenarios, midiendo con precisión sus tiempos de ejecución y
comparándolos con los modelos teóricos esperados.

---

## Algoritmos Implementados 

### Ordenamiento
- Bubble Sort (O(n²))
- Quick Sort (O(n log n))

### Búsqueda
- Linear Search (O(n))
- Binary Search (O(log n))

---

## Requisitos del Sistema 📋

- *Java 17 (LTS)*
- *Maven*
- *IntelliJ IDEA* (recomendado)
- Librería externa:
  - *XChart* (visualización de resultados)

> Java 17 fue seleccionado por ser una versión LTS, estable y ampliamente
> compatible con entornos académicos. El proyecto no utiliza
> características experimentales ni preview.

---

## Estructura del Proyecto 🗂️

- algorithms/ → Implementación de algoritmos
- generators/ → Generación de datos de prueba
- controller/ → Control de experimentos
- analysis/ → Análisis estadístico
- charts/ → Visualización de resultados
- cli/ → Interfaz por línea de comandos

---

## Ejecución del Proyecto 💻

	1.	Clonar el repositorio:
```bash
git clone https://github.com/Rodrig033/ALGORITHM_PERFORMANCE_LABORATORY.git
cd ALGORITHM_PERFORMANCE_LABORATORY
	2.	Abrir el proyecto en IntelliJ IDEA
	3.	Configurar el SDK en Java 17
	4.	Ejecutar la clase principal: CliApp.java

Desde la interfaz CLI es posible:
	•	Seleccionar algoritmos
	•	Definir tamaños de entrada
	•	Elegir escenarios
	•	Ejecutar experimentos individuales o en batch
	•	Visualizar resultados y gráficas
```

## Resultados y Análisis 📈
El sistema mide tiempos promedio de ejecución para cada algoritmo y escenario, permitiendo observar el crecimiento del tiempo en función del tamaño de entrada y validar empíricamente la notación Big-O.

## Enfoque Experimental 
La arquitectura separa claramente: 

	•	Algoritmos
	•	Generación de datos
	•	Medición de tiempos
	•	Análisis de resultados
  
Esto garantiza mediciones reproducibles y precisas.

## Equipo de Desarrollo 👨🏻‍💻👩🏻‍💻🧑🏽‍💻
	•	Farid López Córdoba Arquitectura general y control del flujo del sistema, interfaz CLI.
	•	Daniela Bravo González Implementación de algoritmos, documentación técnica y análisis.
	•	Rafael González Reyes Motor de medición, generación de datos.

## Contexto Académico 👨‍🏫
Proyecto desarrollado como laboratorio experimental para la materia de Estructuras de Datos, con el objetivo de reforzar la comprensión práctica del análisis de algoritmos.
```bash
git clone https://github.com/Rodrig033/ALGORITHM_PERFORMANCE_LABORATORY.git
cd  https://github.com/Rodrig033/ALGORITHM_PERFORMANCE_LABORATORY.git

```
