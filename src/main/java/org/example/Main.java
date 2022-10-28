package org.example;

import org.example.clases.Empleado;

public class Main {

    public static void main(String[] args) {
        //PARA USAR UNA CLASE
        // DEBO CREAR UN OBJETO DE ESA CLASE
        //UN OBJETO ES UNA VARIABLE QUE NO ES PRIMITIVA
        Empleado objeto = new Empleado();

        //USAR UNA CLASE ES ACCEDER A SUS ATRIBUTOS Y METODOS
        //ACCEDO A UN ATRIBUTO PARA ALMACENAR UN VALOR EN MEMORIA
        System.out.println(objeto.nombres);

        //ACCEDO A UN METODO PARA DISFRUTAR  LA FUNCIONALIDAD DEL SUBPROGRAMA
        objeto.saludar();


    }
}