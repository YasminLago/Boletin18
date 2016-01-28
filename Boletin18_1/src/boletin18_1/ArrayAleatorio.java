package boletin18_1;
//Yasmin
public class ArrayAleatorio {

    int[] numeros = new int[6];

    public void cargarArray() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 50 + 1);
        }
    }

    public void visualizaReves() {
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }

    public static boolean noRepeticiones(int[] numeros, int posicion, int numeroAleatorio) {
        for (int i = 0; i < posicion; i++) {
            if (numeros[i] == numeroAleatorio) {
                return true;
            }
        }
        return false;
    }
}