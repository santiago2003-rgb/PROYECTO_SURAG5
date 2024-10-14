package com.example.SERVIDORSURA5G.HELPERS;

import com.example.SERVIDORSURA5G.MODELOS.Paciente;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionPaciente {

    private Paciente paciente = new Paciente();

    public boolean validarNombres(String nombres){
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$";

        Pattern patron = Pattern.compile(expresionRegular);

        Matcher coincidencia = patron.matcher(nombres);

        if (coincidencia.find()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarFechaNacimiento(LocalDate fecha) {

    }
    public boolean validarCiudad(String ciudad){
        String expresionRegularDos = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$";

        Pattern patronDos = Pattern.compile(expresionRegularDos);

        Matcher coincidenciaDos = patronDos.matcher(ciudad);

        if (coincidenciaDos.find()) {
            return  true;
        } else {
            return false;
        }
    }

    public boolean validarCorreo(String correo){
        String expresionRegularTres = "^correo@sura\\.com\\.co$";

        Pattern patronTres = Pattern.compile(expresionRegularTres);

        Matcher coincidenciaTres = patronTres.matcher(correo);

        if (coincidenciaTres.find()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarTelefono(String telefono){

        String expresionRegularCuatro = "^[0-9]+$";

        Pattern patronCuatro = Pattern.compile(expresionRegularCuatro);

        Matcher coincidenciaCuatro = patronCuatro.matcher(telefono);

        if (coincidenciaCuatro.find()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarIps(String ips){
        String expresionRegularQuinto = "^.{0,50}$";

        Pattern patronQuinto = Pattern.compile(expresionRegularQuinto);

        Matcher coincidenciaQuinto = patronQuinto.matcher(ips);

        if (coincidenciaQuinto.find()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarGrupoIngresos(String grupoIngresos){
        if (grupoIngresos.toUpperCase().equals("A") || grupoIngresos.toUpperCase().equals("B") ||grupoIngresos.toUpperCase().equals("C")) {
            return true;
        } else {
            return false;
        }
    }
    public boolean validarFechaAfiliacion(LocalDate fechaAfiliacion){

    }
}
