package juego;

import java.lang.Math;

public class Funcionalidad {

    private int numeros[] = new int[18];
    private String cartas[] = new String[18];

    private int numeroAzar() {
        int numeroTemporal = (int) (Math.random() * 18);
        return numeroTemporal;
    }

    private boolean detectarRepetido(int numero) {
        boolean repetido = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                repetido = true;
            }
        }
        return repetido;
    }

    public void darValores() {
        for (int i = 0; i < numeros.length; i++) {
            int numeroTemporal = numeroAzar();
            while(detectarRepetido(numeroTemporal)){
                numeroTemporal = numeroAzar();
            }
            numeros[i] = numeroTemporal;
        }
    }
}
