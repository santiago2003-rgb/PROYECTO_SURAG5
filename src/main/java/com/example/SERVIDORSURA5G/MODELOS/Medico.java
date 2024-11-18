package com.example.SERVIDORSURA5G.MODELOS;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "medicos")

public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres; //35 CARACTERES Y SOLO LETRAS
    private String matriculaProfesional; //20 CARACTERES
    private String especialidad; //20 CARACTERES
    private String salario; //SOLO POSITIVOS MENOS DE 10 MEGAS Y MAXIMO 20
    private String ips; //50 CARACTERES
    private String correo;
    private String telefono; //12 CARACTERES
    private String direccion; //50 CARACTERES
    private Boolean disponibleFinDeSemana;

    @OneToMany(mappedBy = "medico")
    @JsonManagedReference
    private List<Paciente> pacientes;

    public Medico() {
    }

    public Medico(Long id, String nombres, String matriculaProfesional, String especialidad, String salario, String ips, String correo, String telefono, String direccion, Boolean disponibleFinDeSemana) {
        this.id = id;
        this.nombres = nombres;
        this.matriculaProfesional = matriculaProfesional;
        this.especialidad = especialidad;
        this.salario = salario;
        this.ips = ips;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.disponibleFinDeSemana = disponibleFinDeSemana;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getMatriculaProfesional() {
        return matriculaProfesional;
    }

    public void setMatriculaProfesional(String matriculaProfesional) {
        this.matriculaProfesional = matriculaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getDisponibleFinDeSemana() {
        return disponibleFinDeSemana;
    }

    public void setDisponibleFinDeSemana(Boolean disponibleFinDeSemana) {
        this.disponibleFinDeSemana = disponibleFinDeSemana;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", matriculaProfesional='" + matriculaProfesional + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", salario='" + salario + '\'' +
                ", ips='" + ips + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", disponibleFinDeSemana=" + disponibleFinDeSemana +
                '}';
    }
}
