/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_jerarquia_de_herencia_cuadrilatero;

import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class Tarea_Jerarquia_de_Herencia_Cuadrilatero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas de los puntos para el paralelogramo:");
        Punto punto1 = ingresarPunto(entrada, "Punto 1");
        Punto punto2 = ingresarPunto(entrada, "Punto 2");
        Punto punto3 = ingresarPunto(entrada, "Punto 3");
        Punto punto4 = ingresarPunto(entrada, "Punto 4");

        Paralelogramo paralelogramo = new Paralelogramo(punto1, punto2, punto3, punto4);
        System.out.println("Área del Paralelogramo: " + paralelogramo.calcularArea());

        Cuadrilatero cuadrilatero = new Cuadrilatero(punto1, punto2, punto3, punto4);

        System.out.println("\nIngrese las coordenadas de los puntos para el trapecio:");
        punto1 = ingresarPunto(entrada, "Punto 1");
        punto2 = ingresarPunto(entrada, "Punto 2");
        punto3 = ingresarPunto(entrada, "Punto 3");
        punto4 = ingresarPunto(entrada, "Punto 4");

        Trapezoide trapecio = new Trapezoide(punto1, punto2, punto3, punto4);
        System.out.println("Área del Trapecio: " + trapecio.calcularArea());

        System.out.println("\nIngrese las coordenadas de los puntos para el cuadrado:");
        punto1 = ingresarPunto(entrada, "Punto 1");
        punto2 = ingresarPunto(entrada, "Punto 2");
        punto3 = ingresarPunto(entrada, "Punto 3");
        punto4 = ingresarPunto(entrada, "Punto 4");

        Cuadrado cuadrado = new Cuadrado(punto1, punto2, punto3, punto4);
        System.out.println("Área del Cuadrado: " + cuadrado.calcularArea());

        System.out.println("\nIngrese las coordenadas de los puntos para el rectángulo:");
        punto1 = ingresarPunto(entrada, "Punto 1");
        punto2 = ingresarPunto(entrada, "Punto 2");
        punto3 = ingresarPunto(entrada, "Punto 3");
        punto4 = ingresarPunto(entrada, "Punto 4");

        Rectangulo rectangulo = new Rectangulo(punto1, punto2, punto3, punto4);
        System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());

    }

    public static Punto ingresarPunto(Scanner entrada, String nombrePunto) {
        System.out.print(nombrePunto + " (x): ");
        double x = entrada.nextDouble();
        System.out.print(nombrePunto + " (y): ");
        double y = entrada.nextDouble();
        return new Punto(x, y);
    }
}
