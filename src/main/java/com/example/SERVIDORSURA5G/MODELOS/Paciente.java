package com.example.SERVIDORSURA5G.MODELOS;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
 @Table(name = "pacientes")

public class Paciente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombres; //35 LETRAS Y SOLO LETRAS
    private LocalDate anioNacimiento; //MAXIMO 1900
    private String ciudad; //VALIDAR 40 CARACTERESY SOLO LETRAS
    private String correo; //CORRO VALIDO @SURA.COM.CO
    private String telefono; //MAXIMO 12 CARACTERES Y SOLO NUMEROS
    private String ips; //MAXIMO 50 CARACTERES
    private String grupoIngresos; //SOLO SE ADMITE A, B O C EN MAYUSCULA
    private Boolean tienePoliza;
    private LocalDate fechaAfiliacion; //NO PUEDE SER MENOR A 2010

    @ManyToOne
    @JoinColumn(name = "fk_medico", referencedColumnName = "id")
    @JsonManagedReference
    private Medico medico;

    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference
    private List<Medicamento> medicamentos;

    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference
    private List<Enfermedad> enfermedads;

    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference
    private List<SignoVital> signoVitals;

    public Paciente() {
    }

    public Paciente(long id, String nombres, LocalDate anioNacimiento, String ciudad, String correo, String telefono, String ips, String grupoIngresos, Boolean tienePoliza, LocalDate fechaAfiliacion) {
        this.id = id;
        this.nombres = nombres;
        this.anioNacimiento = anioNacimiento;
        this.ciudad = ciudad;
        this.correo = correo;
        this.telefono = telefono;
        this.ips = ips;
        this.grupoIngresos = grupoIngresos;
        this.tienePoliza = tienePoliza;
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public LocalDate getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(LocalDate anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getGrupoIngresos() {
        return grupoIngresos;
    }

    public void setGrupoIngresos(String grupoIngresos) {
        this.grupoIngresos = grupoIngresos;
    }

    public Boolean getTienePoliza() {
        return tienePoliza;
    }

    public void setTienePoliza(Boolean tienePoliza) {
        this.tienePoliza = tienePoliza;
    }

    public LocalDate getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(LocalDate fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", anioNacimiento=" + anioNacimiento +
                ", ciudad='" + ciudad + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", ips='" + ips + '\'' +
                ", grupoIngresos='" + grupoIngresos + '\'' +
                ", tienePoliza=" + tienePoliza +
                ", fechaAfiliacion=" + fechaAfiliacion +
                '}';
    }
}
