/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_jerarquia_de_herencia_cuadrilatero;

/**
 *
 * @author eliza
 */
class Rectangulo extends Paralelogramo {

    public Rectangulo(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3, punto4);
    }

    @Override
    public double calcularArea() {
        double base = Math.abs(punto2.getCordenada_y() - punto1.getCordenada_y());
        double altura = Math.abs(punto4.getCordenada_x() - punto1.getCordenada_x());
        return base * altura;
    }
}
