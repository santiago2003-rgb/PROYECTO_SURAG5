package com.example.SERVIDORSURA5G.HELPERS;

import com.example.SERVIDORSURA5G.MODELOS.Medico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionMedico {

    private Medico medico = new Medico();

    public boolean validarNombres(String nombres){
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ]{1,50}$";;

        Pattern patron = Pattern.compile(expresionRegular);

        Matcher coincidencia = patron.matcher(nombres);

        if (coincidencia.find()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarMatriculaProfesiona(String matriculaProfesional){
        String expresionRegular2 = "^.{0,20}$";

        Pattern patron2 = Pattern.compile(expresionRegular2);

        Matcher coincidencia2 = patron2.matcher(matriculaProfesional);

        if (coincidencia2.find()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarEspecialidad(String especialidad){
        String expresionRegular3 = "^.{0,20}$";

        Pattern patron3 = Pattern.compile(expresionRegular3);

        Matcher coincidencia3 = patron3.matcher(especialidad);

        if (coincidencia3.find()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarSalario(String salario){
        if () {

        }
    }

    public boolean validarIps(String ips) {
        String expresionRegular4 = "^.{50}$\n";;

        Pattern patron4 = Pattern.compile(expresionRegular4);

        Matcher coincidencia4 = patron4.matcher(ips);

        if (coincidencia4.find()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarCorreo(String correo) {
        String expresionRegular5 = "^correo@sura\\.com\\.co$";

        Pattern patron5 = Pattern.compile(expresionRegular5);

        Matcher coincidencia5 = patron5.matcher(correo);

        if (coincidencia5.find()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarTelefono(String telefono) {

        String expresionRegular6 = "^\\d{10}$";

        Pattern patron6 = Pattern.compile(expresionRegular6);

        Matcher coincidencia6 = patron6.matcher(telefono);

        if (coincidencia6.find()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarDireccion(String direccion){

        String expresionRegular7 = "^.{0,50}$";

        Pattern patron7 = Pattern.compile(expresionRegular7);

        Matcher coincidencia7 = patron7.matcher(direccion);

        if (coincidencia7.find()) {
            return true;
        } else {
            return false;
        }
    }
}
