package com.example.model;

public class TiposItems {
    private int tipoItemId;
    private String nombreItem;
    private String descripcionTipoItem;
    private boolean activo;

    public TiposItems(int tipoItemId, String nombreItem, String descripcionTipoItem, boolean activo) {
        this.tipoItemId = tipoItemId;
        this.nombreItem = nombreItem;
        this.descripcionTipoItem = descripcionTipoItem;
        this.activo = activo;
    }

    public TiposItems() {
    }

    public int getTipoItemId() {
        return tipoItemId;
    }

    public void setTipoItemId(int tipoItemId) {
        this.tipoItemId = tipoItemId;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public String getDescripcionTipoItem() {
        return descripcionTipoItem;
    }

    public void setDescripcionTipoItem(String descripcionTipoItem) {
        this.descripcionTipoItem = descripcionTipoItem;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "TiposItems{" +
                "tipoItemId=" + tipoItemId +
                ", nombreItem='" + nombreItem + '\'' +
                ", descripcionTipoItem='" + descripcionTipoItem + '\'' +
                ", activo=" + activo +
                '}';
    }
}
