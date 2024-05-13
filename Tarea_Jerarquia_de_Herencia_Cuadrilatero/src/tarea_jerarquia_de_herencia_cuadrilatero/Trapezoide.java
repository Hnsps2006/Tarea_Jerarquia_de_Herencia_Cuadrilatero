/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_jerarquia_de_herencia_cuadrilatero;

/**
 *
 * @author eliza
 */
class Trapezoide extends Cuadrilatero {

    public Trapezoide(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3, punto4);
    }

    @Override
    public double calcularArea() {
        double vector1X = punto2.getCordenada_x();
        double vector1Y = punto2.getCordenada_y();

        double vector2X = punto1.getCordenada_x();
        double vector2Y = punto1.getCordenada_y();

        double productoCruz = Math.pow(vector1X - vector2X, 2) + Math.pow(vector1Y - vector2Y, 2);

        double vector3X = punto4.getCordenada_x();
        double vector3Y = punto4.getCordenada_y();

        double vector4X = punto3.getCordenada_x();
        double vector4Y = punto3.getCordenada_y();

        double productoCruz2 = Math.pow(vector3X - vector4X, 2) + Math.pow(vector3Y - vector4Y, 2);

        double base = Math.sqrt(productoCruz);
        double base2 = Math.sqrt(productoCruz2);

        double punto_medio = (punto3.getCordenada_x() + punto4.getCordenada_x() / 2);
        double punto_medio2 = (punto3.getCordenada_y() + punto4.getCordenada_y() / 2);

        double altura2 = Math.abs(punto3.getCordenada_y() - punto1.getCordenada_y());

        double area = ((base + base2) / 2);
        return area * altura2;
    }
}
