/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class PasajeUniversitario extends PasajeInterCantonal {

    private String nameUniversidad;

    public PasajeUniversitario(String n, String c, String o, String d,
            double nkm, double tb, String nu) {
        super(n, c, o, d, nkm, tb);
    }

    public String getNameUniversidad() {
        return nameUniversidad;
    }

    public void setNameUniversidad(String n) {
        this.nameUniversidad = n;
    }

    @Override
    public void calcularValorPasaje() {
        this.valorPasaje = tarifaBase / 2;
    }

    @Override
    public String toString() {
        String cadena = String.format("Pasaje Universitario\n"
                + "Nombre-Pasajero: %s\n"
                + "Cedula: %s\n"
                + "Origen: %s\n"
                + "Destino: %s\n"
                + "Km de distancia: %.2f\n"
                + "Tarifa Base: %.2f\n"
                + "Valor Pasaje: %.2f\n");

        return cadena;
    }

}
