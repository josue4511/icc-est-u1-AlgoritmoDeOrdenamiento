## Tabla 1. Escenario 1: arreglo completamente desordenado

| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
|---|---|---|---|---|
| 10.000 | 2892,11 ms | 18,10 ms | QuickSort | QuickSort fue significativamente más rápido. |
| 50.000 | 99286,47 ms | 110,49 ms | QuickSort | La diferencia de rendimiento aumentó al crecer la muestra. |
| 100.000 | 484634,05 ms | 408,96 ms | QuickSort | Inserción incrementó considerablemente su tiempo de ejecución. |

## Tabla 2. Escenario 2: arreglo ordenado más una nueva persona

| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
|---|---|---|---|---|
| 10.001 | 2,65 ms | 21,42 ms | Inserción | Inserción aprovechó que el arreglo estaba casi ordenado. |
| 50.001 | 18,00 ms | 143,09 ms | Inserción | Inserción mantuvo tiempos bajos aun con más elementos. |
| 100.001 | 31,25 ms | 420,25 ms | Inserción | Inserción fue más eficiente en este escenario. |

## Análisis requerido

Después de completar las tablas, se debe responder:

- ¿Qué algoritmo fue más rápido en el escenario desordenado?
QuickSort fue mas rapido.
- ¿Qué algoritmo fue más rápido en el escenario casi ordenado?
Inserción fue mas rápido.
- ¿El crecimiento del tamaño de muestra afectó por igual a los dos algoritmos?
No, afectó mas a Inserción.
- ¿Por qué Inserción puede mejorar cuando el arreglo ya está casi ordenado?
Porque necesita hacer menos movimientos que el resto de los demas.
- ¿Por qué QuickSort suele ser mejor cuando los datos están muy desordenados?
Porque ordena grandes cantidades de datos de forma más eficiente.

**Nota:** Los resultados, observaciones y análisis deben ser escritos por cada uno con base en su ejecución. No se permite presentar análisis generados por IA.

## Conclusiones

Se debe redactar al menos tres conclusiones propias. Las conclusiones deben estar relacionadas directamente con los tiempos obtenidos.

- Conclusión 1: QuickSort fue más rápido en los аrreglos desordenаdos.
- Conclusión 2: Inserción tuvo mejor rendimiento en los аrreglos cаsi ordenаdos.
- Conclusión 3: Аl аumentаr el tаmаño de lа muestrа, Inserción tаrdó mucho más que QuickSort.

**Importante:** Las conclusiones no pueden ser generadas con IA. Deben reflejar su análisis a partir de los resultados reales de la práctica.   