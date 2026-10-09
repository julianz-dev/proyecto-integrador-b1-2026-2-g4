package com.example.model;

public class TiposMovimientos {

    private int tipoMovimientoId;
    private String nombreTipo;
    private String efectoMovimiento;

    public TiposMovimientos(int tipoMovimientoId, String nombreTipo, String efectoMovimiento) {
        this.tipoMovimientoId = tipoMovimientoId;
        this.nombreTipo = nombreTipo;
        this.efectoMovimiento = efectoMovimiento;
    }

    public TiposMovimientos() {
    }

    public int getTipoMovimientoId() {
        return tipoMovimientoId;
    }

    public void setTipoMovimientoId(int tipoMovimientoId) {
        this.tipoMovimientoId = tipoMovimientoId;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public String getEfectoMovimiento() {
        return efectoMovimiento;
    }

    public void setEfectoMovimiento(String efectoMovimiento) {
        this.efectoMovimiento = efectoMovimiento;
    }

    @Override
    public String toString() {
        return "TiposMovimientos [tipoMovimientoId=" + tipoMovimientoId + ", nombreTipo=" + nombreTipo
                + ", efectoMovimiento=" + efectoMovimiento + "]";
    }

}
