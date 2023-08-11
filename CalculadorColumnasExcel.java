package algoritmia;

import java.util.Scanner;

public class CalculadorColumnasExcel {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String columna = "";
        int total = 0;
        int inter=0;
        System.out.println("Que Columna quieres comprobar:");
        columna = teclado.nextLine();
        for (int i = 0; i < columna.length(); i++) {
           inter = (int)(columna.charAt(columna.length()-i-1))-64;
           inter = (int)(inter * Math.pow(26, i));
           total += inter;
        }
        System.out.println(total);
    }
}
