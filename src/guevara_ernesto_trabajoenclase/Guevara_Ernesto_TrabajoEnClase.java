/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guevara_ernesto_trabajoenclase;

import java.util.Scanner;

/**
 *
 * @author Ernesto
 */
public class Guevara_Ernesto_TrabajoEnClase {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);

        while (true) {
            System.out.println("Menu de Ejercicios");
            System.out.println("1. Triangulos");
            System.out.println("2. MCM y MCD");
            System.out.println("3. Numero Perfecto");
            int op = lea.nextInt();

            if (op == 1) {
                int contador = 1, triangulomayor = 0;
                double areamayor = 0;

                while (contador <= 8) {
                    int base = 0, altura = 0;
                    double resultado = 0;
                    try {
                        System.out.println("Triangulo #" + contador + ":");
                        System.out.println("Ingrese la base del triangulo: ");
                        base = lea.nextInt();
                        System.out.println("Ingrese la altura del triangulo: ");
                        altura = lea.nextInt();
                        resultado = (base * altura) / 2;
                        System.out.println("El resultado es: " + resultado);
                    } catch (Exception e) {
                        System.out.println("En esta area solo se pueden ingresar numeros enteros, no caracteres ni numeros decimales");
                        lea.nextLine();          
                    }
                    
                    if(base<0 && altura<0){
                        System.out.println("No pueden haber valores negativos");
                    }

                    if (base > 0 && altura > 0 && resultado > 0) {
                        contador++;
                    }

                    if (resultado > areamayor) {
                        triangulomayor = contador;
                        areamayor = resultado;
                    }
                }

                System.out.println("El triangulo de mayor area: " + triangulomayor);
                System.out.println("El area es de: " + areamayor);
            }
            
            if(op==2){
                while(true){
                try{
                 System.out.println("Ingrese un numero: ");
                 int numero=lea.nextInt();
                 System.out.println("Ingrese un segundo numero: ");
                 int numero2=lea.nextInt();
                }catch(Exception e){
                    System.out.println("Solo se puede ingresar numeros enteros");
                    lea.nextLine();
                }
              }
            }
            
            if(op==3){
                    
                }
            }

        }
    }

}
