package com.example.model;

public class CategoriaProductos {
    private String categoriaId;
    private String negocioId;
    private String nombreCategoria;

    public CategoriaProductos(String categoriaId, String negocioId, String nombreCategoria) {
        this.categoriaId = categoriaId;
        this.negocioId = negocioId;
        this.nombreCategoria = nombreCategoria;
    }

    public CategoriaProductos() {
    }

    public String getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(String categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getNegocioId() {
        return negocioId;
    }

    public void setNegocioId(String negocioId) {
        this.negocioId = negocioId;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public String toString() {
        return "CategoriaProductos{" +
                "categoriaId='" + categoriaId + '\'' +
                ", negocioId='" + negocioId + '\'' +
                ", nombreCategoria='" + nombreCategoria + '\'' +
                '}';
    }
}