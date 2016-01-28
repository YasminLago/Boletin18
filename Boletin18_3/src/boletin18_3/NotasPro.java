package boletin18_3;
//Yasmin

import java.util.Scanner;

public class NotasPro {

    int numElementos = pedirNumElementos();
    int[] notas = new int[numElementos];
    String[] nomes = new String[numElementos];

    public int pedirNumElementos() {
        Scanner el = new Scanner(System.in);
        System.out.println("Introduce el numero de elementos: ");
        numElementos = el.nextInt();
        return numElementos;
    }

    public String pedirNomes() {
        Scanner nom = new Scanner(System.in);
        System.out.println("Introduce un nome: ");
        String nome = nom.next();
        return nome;
    }

    public int pedirNotas() {
        Scanner nt = new Scanner(System.in);
        System.out.println("Introduce a nota: ");
        int nota = nt.nextInt();
        return nota;
    }

    public void cargarArray() {
        for (int i = 0; i < notas.length; i++) {
            nomes[i] = pedirNomes();
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
        int media = 0;
        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
        }
        media = media / notas.length;
        System.out.println("Media da clase: " + media);
    }

    public void notaMaior() {
        int notaAlta = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notaAlta) {
                notaAlta = notas[i];
            }
        }
        System.out.println("A nota mais alta e: " + notaAlta);
    }

    public void visualizar() {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nomes [" + i + "]=" + nomes[i]);
            System.out.println("Notas [" + i + "]=" + notas[i]);
        }
    }

    public void mostrarNotaAlumno() {
        String consultaNota = pedirNomes();
        for (int i = 0; i < numElementos; i++) {
            if (consultaNota.equalsIgnoreCase(nomes[i])) {
                System.out.println("Nome: " + nomes[i] + " Nota: " + notas[i]);
            }
        }
        //System.out.println("Non se encontra o nome");
    }

    public void alumnosAprobados() {
        System.out.println("Lista de aprobados");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println("Nome: " + nomes[i] + " Nota: " + notas[i]);
            }

        }
    }

    public void ordenacionNotas() {
        System.out.println("Notas de menor a maior: ");
        int aux;
        String aux2;
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[i] < notas[j]) {
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;

                    aux2 = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = aux2;
                }
            }
        }
    }
}