package boletin18_2;
//Yasmin

import java.util.Scanner;

public class NotasPro {
    int numElementos = pedirNumElementos();
    int[] notas = new int[numElementos];

    public int pedirNumElementos() {
        Scanner el = new Scanner(System.in);
        System.out.println("Introduce el numero de elementos: ");
        numElementos = el.nextInt();
        return numElementos;
    }
    public int pedirNotas() {
        Scanner nt = new Scanner(System.in);
        System.out.println("Introduce a nota: ");
        int nota = nt.nextInt();
        return nota;
    }

    public void cargarArray() {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = pedirNotas();
        }

    }

    public void aprobadosSuspensos() {
        int aprobados = 0;
        int suspensos = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
    }

    public void notaMediaClase() {
        int media=0;
        for (int i = 0; i < notas.length; i++) {
            media=media+notas[i];
        }
            media=media/notas.length;
        System.out.println("Media da clase: "+media);
    }
    public void notaMaior(){
    int notaAlta=notas[0];
    for(int i=1;i<notas.length;i++){
        if(notas[i]>notaAlta){
        notaAlta=notas[i];
     }
     }
    System.out.println("A nota mais alta e: "+notaAlta);
}
}