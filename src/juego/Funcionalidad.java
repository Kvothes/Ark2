package juego;

import java.lang.Math;

public class Funcionalidad {

    private int numeros[] = new int[18];
    private String cartas[] = new String[18];

    public int[] getNumeros(){
        darValores();
        return this.numeros;
    }
    public String[] getCartas(){
        return this.cartas;
    }
    
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

    private boolean todosPosibles() {
        boolean cero = false;
        boolean todos = true;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0 && cero == false) {
                cero = true;
            } else if (numeros[i] == 0 && cero) {
                todos = false;
            }
        }
        return todos;
    }

    private void darValores() {
        for (int i = 0; i < numeros.length; i++) {
            int numeroTemporal = numeroAzar();
            while (detectarRepetido(numeroTemporal) && !todosPosibles()) {
                numeroTemporal = numeroAzar();
            }
            numeros[i] = numeroTemporal;
            
        }
        numeros[numeros.length - 1] = 0;
    }
}
