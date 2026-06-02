package models;

public class Resultado {
    private String algoritmo;
    private String escenario;
    private int sample;
    private double tiempoNano;
    private double tiempoMillis;

    public Resultado(String algoritmo, String escenario, int sample, double tiempoNano) {
        this.algoritmo = algoritmo;
        this.escenario = escenario;
        this.sample = sample;
        this.tiempoNano = tiempoNano;
        this.tiempoMillis = tiempoNano / 1000000.0;
    }

    public String getAlgoritmo() {
        return algoritmo;
    }

    public String getEscenario() {
        return escenario;
    }

    public int getSample() {
        return sample;
    }

    public double getTiempoNano() {
        return tiempoNano;
    }

    public double getTiempoMillis() {
        return tiempoMillis;
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %d | %.2f ms", escenario, algoritmo, sample, tiempoMillis);
    }
}