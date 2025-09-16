/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosalario;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


          System.out.print("Digite o salário bruto: ");
            double salarioBruto = scanner.nextDouble();

          System.out.print("Digite o valor da prestação: ");
            double prestacao = scanner.nextDouble();


            double limite = salarioBruto * 0.3;

            if (prestacao <= limite) {
            
                System.out.println("Empréstimo pode ser concedido!");
        } else {
            System.out.println("Empréstimo NÃO pode ser concedido!");
        }

        scanner.close();
    }
}
