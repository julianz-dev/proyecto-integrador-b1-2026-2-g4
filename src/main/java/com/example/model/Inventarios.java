package com.example.model;

import java.time.LocalDateTime;

public class Inventarios {
    private int inventarioId;
    private String productoId;
    private int cantidadDisponible;
    private int stockMinimo;
    private LocalDateTime fechaActualizacion;

    public Inventarios(int inventarioId, String productoId, int cantidadDisponible, int stockMinimo,
            LocalDateTime fechaActualizacion) {
        this.inventarioId = inventarioId;
        this.productoId = productoId;
        this.cantidadDisponible = cantidadDisponible;
        this.stockMinimo = stockMinimo;
        this.fechaActualizacion = fechaActualizacion;
    }

    public Inventarios() {
    }

    public int getInventarioId() {
        return inventarioId;
    }

    public void setInventarioId(int inventarioId) {
        this.inventarioId = inventarioId;
    }

    public String getProductoId() {
        return productoId;
    }

    public void setProductoId(String productoId) {
        this.productoId = productoId;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    @Override
    public String toString() {
        return "Inventarios{" +
                "inventarioId=" + inventarioId +
                ", productoId='" + productoId + '\'' +
                ", cantidadDisponible=" + cantidadDisponible +
                ", stockMinimo=" + stockMinimo +
                ", fechaActualizacion=" + fechaActualizacion +
                '}';
            }
}
