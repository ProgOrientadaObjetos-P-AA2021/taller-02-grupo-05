/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import paquete2.*;
import paquete3.*;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "pasajes.data";
        ArrayList<PasajeInterCantonal> pasajes = new ArrayList<>();
        PasajeMenorEdad pMenorE = new PasajeMenorEdad("Junior James",
                "1500000000", "San Lucas", "Loja", 51.00, 4.00);
        pMenorE.setPorcentajeDescuento(10);

        PasajeNormal pNormal = new PasajeNormal("Carla Gonzales",
                "1900000000", "Loja", "Taquil", 40.00, 5.00);
        pNormal.setPorcentajeAdicional(12);

        PasajeUniversitario pUniversitario = new PasajeUniversitario(
                "Jhordan Belfort", "1400000000", "Catamayo", "Loja", 33.00,
                 2.50, "Universidad Nacional De Loja");

        PasajeTerceraEdad pTEdad = new PasajeTerceraEdad("Franco Sigcho",
                "1600000000", "Loja", "El Cisne", 52.00, 5.00);

        pasajes.add(pTEdad);
        pasajes.add(pUniversitario);
        pasajes.add(pMenorE);
        pasajes.add(pNormal);

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < pasajes.size(); i++) {
            pasajes.get(i).calcularValorPasaje();
            // establecer el valor del atributo registro
            archivo.establecerRegistro(pasajes.get(i));
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaPasajes();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
