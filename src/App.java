import controllers.SortPersonaMethods;
import models.Persona;
import models.Resultado;
import utils.Benchmarking;

public class App {

    public static void main(String[] args) {

        SortPersonaMethods sorter =
                new SortPersonaMethods();

        int[] muestras = {10000, 50000, 100000};

        System.out.println("=== ESCENARIO 1: DESORDENADO ===");

        for (int size : muestras) {

            Persona[] base = generarPersonas(size);

            Persona[] copiaInsercion = base.clone();
            Persona[] copiaQuick = base.clone();

            Resultado r1 = Benchmarking.medirTiempo(
                    () -> {
                        sorter.insertionSort(copiaInsercion);
                        return null;
                    },
                    "Insercion",
                    "Desordenado",
                    size
            );

            Resultado r2 = Benchmarking.medirTiempo(
                    () -> {
                        sorter.quickSort(
                                copiaQuick,
                                0,
                                copiaQuick.length - 1
                        );
                        return null;
                    },
                    "QuickSort",
                    "Desordenado",
                    size
            );

            System.out.println(r1);
            System.out.println(r2);
            System.out.println();
        }

        System.out.println(
                "\n=== ESCENARIO 2: CASI ORDENADO + 1 PERSONA ==="
        );

        for (int size : muestras) {

            Persona[] base = generarPersonas(size);

            sorter.quickSort(
                    base,
                    0,
                    base.length - 1
            );

            Persona[] nuevo =
                    new Persona[size + 1];

            System.arraycopy(
                    base,
                    0,
                    nuevo,
                    0,
                    base.length
            );

            nuevo[size] =
                    new Persona("Nueva Persona", 50);

            Persona[] copiaInsercion = nuevo.clone();
            Persona[] copiaQuick = nuevo.clone();

            Resultado r1 = Benchmarking.medirTiempo(
                    () -> {
                        sorter.insertionSort(copiaInsercion);
                        return null;
                    },
                    "Insercion",
                    "Casi ordenado + 1 persona",
                    nuevo.length
            );

            Resultado r2 = Benchmarking.medirTiempo(
                    () -> {
                        sorter.quickSort(
                                copiaQuick,
                                0,
                                copiaQuick.length - 1
                        );
                        return null;
                    },
                    "QuickSort",
                    "Casi ordenado + 1 persona",
                    nuevo.length
            );

            System.out.println(r1);
            System.out.println(r2);
            System.out.println();
        }
    }

    public static Persona[] generarPersonas(
            int cantidad) {

        Persona[] personas =
                new Persona[cantidad];

        for (int i = 0; i < cantidad; i++) {

            String nombre =
                    "Persona " + (i + 1);

            int edad =
                    (int) (Math.random() * 101);

            personas[i] =
                    new Persona(nombre, edad);
        }

        return personas;
    }
}