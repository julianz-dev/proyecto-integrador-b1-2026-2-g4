package com.example.model;

import java.time.LocalDateTime;

public class MovimientosInventario {

    private int movimientoId;
    private int inventarioId;
    private int tipoMovimientoId;
    private int cantidad;
    private LocalDateTime fechaMovimiento;
    private String usuarioId;
    private String motivo;
    private Integer ventaId;
    private Integer compraId;
    private Integer devolucionId;

    public MovimientosInventario(int movimientoId, int inventarioId, int tipoMovimientoId, int cantidad,
            LocalDateTime fechaMovimiento, String usuarioId, String motivo, Integer ventaId, Integer compraId,
            Integer devolucionId) {
        this.movimientoId = movimientoId;
        this.inventarioId = inventarioId;
        this.tipoMovimientoId = tipoMovimientoId;
        this.cantidad = cantidad;
        this.fechaMovimiento = fechaMovimiento;
        this.usuarioId = usuarioId;
        this.motivo = motivo;
        this.ventaId = ventaId;
        this.compraId = compraId;
        this.devolucionId = devolucionId;
    }

    public MovimientosInventario() {
    }

    public int getMovimientoId() {
        return movimientoId;
    }

    public void setMovimientoId(int movimientoId) {
        this.movimientoId = movimientoId;
    }

    public int getInventarioId() {
        return inventarioId;
    }

    public void setInventarioId(int inventarioId) {
        this.inventarioId = inventarioId;
    }

    public int getTipoMovimientoId() {
        return tipoMovimientoId;
    }

    public void setTipoMovimientoId(int tipoMovimientoId) {
        this.tipoMovimientoId = tipoMovimientoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDateTime getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(LocalDateTime fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Integer getVentaId() {
        return ventaId;
    }

    public void setVentaId(Integer ventaId) {
        this.ventaId = ventaId;
    }

    public Integer getCompraId() {
        return compraId;
    }

    public void setCompraId(Integer compraId) {
        this.compraId = compraId;
    }

    public Integer getDevolucionId() {
        return devolucionId;
    }

    public void setDevolucionId(Integer devolucionId) {
        this.devolucionId = devolucionId;
    }

    @Override
    public String toString() {
        return "MovimientosInventario [movimientoId=" + movimientoId + ", inventarioId=" + inventarioId
                + ", tipoMovimientoId=" + tipoMovimientoId + ", cantidad=" + cantidad + ", fechaMovimiento="
                + fechaMovimiento + ", usuarioId=" + usuarioId + ", motivo=" + motivo + ", ventaId=" + ventaId
                + ", compraId=" + compraId + ", devolucionId=" + devolucionId + "]";
    }

}