package com.example.model;

public class Producto {
    private String producutoId;
    private int negocioId;
    private String categoriaId;
    private String codigoProducto;
    private String nombreProducto;
    private String descripcionServicio;
    private double precioVenta;
    private int tipoItemId;
    private boolean manejaInventario;
    private boolean activo;

    public Producto(String producutoId, int negocioId, String categoriaId, String codigoProducto,
            String nombreProducto, String descripcionServicio, double precioVenta, int tipoItemId,
            boolean manejaInventario, boolean activo) {
        this.producutoId = producutoId;
        this.negocioId = negocioId;
        this.categoriaId = categoriaId;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionServicio = descripcionServicio;
        this.precioVenta = precioVenta;
        this.tipoItemId = tipoItemId;
        this.manejaInventario = manejaInventario;
        this.activo = activo;
    }

    public Producto() {
    }

    public String getProducutoId() {
        return producutoId;
    }

    public void setProducutoId(String producutoId) {
        this.producutoId = producutoId;
    }

    public int getNegocioId() {
        return negocioId;
    }

    public void setNegocioId(int negocioId) {
        this.negocioId = negocioId;
    }

    public String getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(String categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getTipoItemId() {
        return tipoItemId;
    }

    public void setTipoItemId(int tipoItemId) {
        this.tipoItemId = tipoItemId;
    }

    public boolean isManejaInventario() {
        return manejaInventario;
    }

    public void setManejaInventario(boolean manejaInventario) {
        this.manejaInventario = manejaInventario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Producto [producutoId=" + producutoId + ", negocioId=" + negocioId + ", categoriaId=" + categoriaId
                + ", codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto
                + ", descripcionServicio=" + descripcionServicio + ", precioVenta=" + precioVenta + ", tipoItemId="
                + tipoItemId + ", manejaInventario=" + manejaInventario + ", activo=" + activo + "]";
    }
}
