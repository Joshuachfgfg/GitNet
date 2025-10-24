package com.mycompany.gitnett;

import java.util.Scanner;

public class Gitnett {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;
        int opcion;

        do {
            System.out.println("=== Gitnett - Calculadora Simple ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1 || opcion == 2) {
                System.out.print("Ingresa el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                num2 = sc.nextDouble();

                if (opcion == 1) {
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                }
            } else if (opcion != 3) {
                System.out.println("Opcion no valida.");
            }

            System.out.println(); // salto de línea
        } while (opcion != 3);

        System.out.println("Saliendo de Gitnett...");
        sc.close();
    }
}
iuhuhuhu
