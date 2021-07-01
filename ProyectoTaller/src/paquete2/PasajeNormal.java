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
public class PasajeNormal extends PasajeInterCantonal implements Serializable{
    protected double porcentajeAdicional;

    public PasajeNormal(String nombrePasajero, String identificacion, String origen, String destino, double distancia,
                        double tarifaBase) {
        super(nombrePasajero, identificacion, origen, destino, distancia, tarifaBase);
    }

    public double getPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public void setPorcentajeAdicional(double porcentajeAdicional) {
        this.porcentajeAdicional = porcentajeAdicional;
    }

    @Override
    public void calcularValorPasaje() {
        this.valorPasaje = (distancia * 0.15) + (tarifaBase +(tarifaBase * (porcentajeAdicional / 100)));
    }

    @Override
    public String toString() {
        return  String.format(" %s Porcentaje adicional: %s ", super.toString(), porcentajeAdicional);

    }

}
