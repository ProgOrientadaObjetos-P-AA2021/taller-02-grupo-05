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
public class PasajeMenorEdad extends PasajeInterCantonal
        implements Serializable {

    private double porcentajeDescuento;

    public PasajeMenorEdad(String nombrePasajero, String identificacion, 
            String origen, String destino, double distancia, double tarifaBase){
        super(nombrePasajero, identificacion, origen, destino, distancia,
                tarifaBase);
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public void calcularValorPasaje() {
        this.valorPasaje = (distancia * 0.10) + (tarifaBase - 
                (tarifaBase * porcentajeDescuento / 100));
    }

    @Override
    public String toString() {
        return String.format("%s\nPorcentaje descuento: %s\n"
                , super.toString(), porcentajeDescuento);
    }
}
