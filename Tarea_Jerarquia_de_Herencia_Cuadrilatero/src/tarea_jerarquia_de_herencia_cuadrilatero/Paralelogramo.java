/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_jerarquia_de_herencia_cuadrilatero;

/**
 *
 * @author eliza
 */
class Paralelogramo extends Cuadrilatero {

    public Paralelogramo(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3, punto4);
    }

    @Override
    public double calcularArea() {
        double vector1X = punto2.getCordenada_x();
        double vector1Y = punto2.getCordenada_y();

        double vector2X = punto1.getCordenada_x();
        double vector2Y = punto1.getCordenada_y();

        double productoCruz = Math.pow(vector1X - vector2X, 2) + Math.pow(vector1Y - vector2Y, 2);

        double base = Math.sqrt(productoCruz);

        double altura = Math.abs(punto3.getCordenada_y() - punto1.getCordenada_y());

        double area = base * altura;
        return area;
    }
}
