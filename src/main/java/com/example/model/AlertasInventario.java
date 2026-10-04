package com.example.model;

import java.time.LocalDateTime;

public class AlertasInventario {

    private int alertaId;
    private int inventarioId;
    private int tipoAlertaId;
    private LocalDateTime fechaGeneracion;
    private LocalDateTime fechaResolucion;
    private boolean activa;

    public AlertasInventario(int alertaId, int inventarioId, int tipoAlertaId, LocalDateTime fechaGeneracion,
            LocalDateTime fechaResolucion, boolean activa) {
        this.alertaId = alertaId;
        this.inventarioId = inventarioId;
        this.tipoAlertaId = tipoAlertaId;
        this.fechaGeneracion = fechaGeneracion;
        this.fechaResolucion = fechaResolucion;
        this.activa = activa;
    }

    public AlertasInventario() {
    }

    public int getAlertaId() {
        return alertaId;
    }

    public void setAlertaId(int alertaId) {
        this.alertaId = alertaId;
    }

    public int getInventarioId() {
        return inventarioId;
    }

    public void setInventarioId(int inventarioId) {
        this.inventarioId = inventarioId;
    }

    public int getTipoAlertaId() {
        return tipoAlertaId;
    }

    public void setTipoAlertaId(int tipoAlertaId) {
        this.tipoAlertaId = tipoAlertaId;
    }

    public LocalDateTime getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDateTime fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public LocalDateTime getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(LocalDateTime fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    @Override
    public String toString() {
        return "AlertasInventario [alertaId=" + alertaId + ", inventarioId=" + inventarioId + ", tipoAlertaId="
                + tipoAlertaId + ", fechaGeneracion=" + fechaGeneracion + ", fechaResolucion=" + fechaResolucion
                + ", activa=" + activa + "]";
    }

}