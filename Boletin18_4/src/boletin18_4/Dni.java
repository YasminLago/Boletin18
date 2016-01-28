package boletin18_4;
//Yasmin

import java.util.Scanner;

public class Dni {
    String[] letraDni = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    int dni;
    public void calcularLetra() {
        Scanner d = new Scanner(System.in);
        System.out.println("Introduce el número de dni: ");
        int dni = d.nextInt();
        int posicion=dni%23;
        System.out.println("Tu letra es: "+letraDni[posicion]);
        System.out.println("NIF: "+dni+"-"+letraDni[posicion]);
    }
    
}