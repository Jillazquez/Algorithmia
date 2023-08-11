package algoritmia;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite;
        long actual=1,anterior=0,suma=1;
        System.out.println("Hasta donde quieres:");
        limite = teclado.nextInt();
        teclado.nextLine();//Consumo el salto de linea
        for(int i = 0;i < limite ;i++){
            System.out.print(suma+",");
            suma = actual+anterior;
            anterior = actual;
            actual = suma;
            
        }
    }
}
