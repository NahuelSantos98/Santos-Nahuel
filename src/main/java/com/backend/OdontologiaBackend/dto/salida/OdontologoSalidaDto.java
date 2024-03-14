package com.backend.OdontologiaBackend.dto.salida;

public class OdontologoSalidaDto {

    //No validacion ya que esta previamente validado por el codigo en sí.
    private int id;
    private int numeroMatricula;
    private String nombre;
    private String apellido;

    public OdontologoSalidaDto() {
    }

    public OdontologoSalidaDto(int id, int numeroMatricula, String nombre, String apellido) {
        this.id = id;
        this.numeroMatricula = numeroMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}