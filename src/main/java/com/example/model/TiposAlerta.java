package com.example.model;

public class TiposAlerta {

    private int tipoAlertaId;
    private String nombreTipo;
    private String descripcionAlerta;
    private String prioridad;
    private boolean activo;

    public TiposAlerta(int tipoAlertaId, String nombreTipo, String descripcionAlerta, String prioridad,
            boolean activo) {
        this.tipoAlertaId = tipoAlertaId;
        this.nombreTipo = nombreTipo;
        this.descripcionAlerta = descripcionAlerta;
        this.prioridad = prioridad;
        this.activo = activo;
    }

    public TiposAlerta() {
    }

    public int getTipoAlertaId() {
        return tipoAlertaId;
    }

    public void setTipoAlertaId(int tipoAlertaId) {
        this.tipoAlertaId = tipoAlertaId;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public String getDescripcionAlerta() {
        return descripcionAlerta;
    }

    public void setDescripcionAlerta(String descripcionAlerta) {
        this.descripcionAlerta = descripcionAlerta;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "TiposAlerta [tipoAlertaId=" + tipoAlertaId + ", nombreTipo=" + nombreTipo + ", descripcionAlerta="
                + descripcionAlerta + ", prioridad=" + prioridad + ", activo=" + activo + "]";
    }

}