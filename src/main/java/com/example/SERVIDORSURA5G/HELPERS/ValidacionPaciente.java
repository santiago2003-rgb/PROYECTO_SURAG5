package com.example.SERVIDORSURA5G.HELPERS;

import com.example.SERVIDORSURA5G.MODELOS.Paciente;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionPaciente {

    //1. INYECTAR UN OBJETO DE LA CLASE MODELO
    //INYECTAR = TRAER UNA CLASE Y USARLA DENTRO DE OTRA
    private Paciente paciente = new Paciente();

    //2. CREAMOS UN METODO PARA CADA CAMPO QUE QUIERO VALIDAR
    public boolean validarNombres(String nombres){
        //1. SE CONSULTA UNA EXPRESION REGULAR ALMACENANDOLA EN UNA VARIABLE TIPO STRING
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$";

        //2.ACTIVAR EL PATRON
        Pattern patron = Pattern.compile(expresionRegular);

        //3. SE BUSCA COINCIDENCIA ENTRE LA CADENA Y EL PATRON
        Matcher coincidencia = patron.matcher(nombres);

        //4. INDICO SI HUBO O NO HUBO COINCIDENCIA
        if (coincidencia.find()) {
            return true;
        } else {
            return false;
        }
    }
    public boolean validarFechaNacimiento(LocalDate fecha) {}
    public boolean validarCiudad(String ciudad){
        //1. SE CONSULTA UNA EXPRESION REGULAR ALMACENANDOLA EN UNA VARIABLE TIPO STRING
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$";

        //2.ACTIVAR EL PATRON
        Pattern patron = Pattern.compile(expresionRegular);

        //3. SE BUSCA COINCIDENCIA ENTRE LA CADENA Y EL PATRON
        Matcher coincidencia = patron.matcher(ciudad);

        //4. INDICO SI HUBO O NO HUBO COINCIDENCIA
        if (coincidencia.find()) {
            return  true;
        } else {
            return false;
        }
    }
    public boolean validarCorreo(String correo){
        //1. SE CONSULTA UNA EXPRESION REGULAR ALMACENANDOLA EN UNA VARIABLE TIPO STRING
        String expresionRegular = "^correo@sura\\.com\\.co$";

        //2.ACTIVAR EL PATRON
        Pattern patron = Pattern.compile(expresionRegular);

        //3. SE BUSCA COINCIDENCIA ENTRE LA CADENA Y EL PATRON
        Matcher coincidencia = patron.matcher(correo);

        //4. INDICO SI HUBO O NO HUBO COINCIDENCIA
        if (coincidencia.find()) {
            return true;
        } else {
            return false;
        }
    }
    public boolean validarTelefono(String telefono){

        //1. SE CONSULTA UNA EXPRESION REGULAR ALMACENANDOLA EN UNA VARIABLE TIPO STRING
        String expresionRegular = "^[0-9]+$";

        //2.ACTIVAR EL PATRON
        Pattern patron = Pattern.compile(expresionRegular);

        //3. SE BUSCA COINCIDENCIA ENTRE LA CADENA Y EL PATRON
        Matcher coincidencia = patron.matcher(telefono);

        //4. INDICO SI HUBO O NO HUBO COINCIDENCIA
        if (coincidencia.find()) {
            return true;
        } else {
            return false;
        }
    }
    public boolean validarIps(String ips){}
    public boolean validarGrupoIngresos(String grupoIngresos){}
    public boolean validarFechaAfiliacion(LocalDate fechaAfiliacion){}



}
