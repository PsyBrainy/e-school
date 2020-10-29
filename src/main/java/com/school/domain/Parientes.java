package com.school.domain;

public class Parientes {

    private int idParientes;
    private String nombrePadre;
    private String nombreMadre;
    private String correoPadre;
    private String correoMadre;
    private String comentarios;
    private Alumno alumno;

    public int getIdParientes() {
        return idParientes;
    }

    public void setIdParientes(int idParientes) {
        this.idParientes = idParientes;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public String getCorreoPadre() {
        return correoPadre;
    }

    public void setCorreoPadre(String correoPadre) {
        this.correoPadre = correoPadre;
    }

    public String getCorreoMadre() {
        return correoMadre;
    }

    public void setCorreoMadre(String correoMadre) {
        this.correoMadre = correoMadre;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
