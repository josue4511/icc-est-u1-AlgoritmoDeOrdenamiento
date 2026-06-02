package controllers;

import models.Persona;

public class SortPersonaMethods {

    public void insertionSort(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona auxiliar = personas[i];
            int j = i - 1;

            while (j >= 0 &&
                   personas[j].getCriterioOrdenamiento()
                   > auxiliar.getCriterioOrdenamiento()) {

                personas[j + 1] = personas[j];
                j--;
            }

            personas[j + 1] = auxiliar;
        }
    }

    public void quickSort(Persona[] personas, int inicio, int fin) {

        if (personas == null) {
            return;
        }

        if (inicio >= fin) {
            return;
        }

        int indicePivote = particionar(personas, inicio, fin);

        quickSort(personas, inicio, indicePivote - 1);
        quickSort(personas, indicePivote + 1, fin);
    }

    private int particionar(Persona[] personas, int inicio, int fin) {

    
        int indiceAleatorio =
                inicio + (int) (Math.random() * (fin - inicio + 1));

        intercambiar(personas, indiceAleatorio, fin);

        Persona pivote = personas[fin];

        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {

            if (personas[j].getCriterioOrdenamiento()
                    <= pivote.getCriterioOrdenamiento()) {

                i++;
                intercambiar(personas, i, j);
            }
        }

        intercambiar(personas, i + 1, fin);

        return i + 1;
    }

    private void intercambiar(Persona[] personas, int i, int j) {

        Persona aux = personas[i];
        personas[i] = personas[j];
        personas[j] = aux;
    }
}