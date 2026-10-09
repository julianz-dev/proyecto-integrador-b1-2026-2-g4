package com.example;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Gestión CRUD - 2 Entidades")
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        setSizeFull();
        setPadding(true);
        setSpacing(true);

        H2 titulo = new H2("Proyecto Integrador Grupo 4");

        TabSheet tabSheet = new TabSheet();
        tabSheet.setWidthFull();

        // Cristian
        tabSheet.add("Categoría Productos", crearSeccionCategoriaProductos());
        tabSheet.add("Productos", crearSeccionProductos());
        tabSheet.add("Tipos Items", crearSeccionTiposItems());
        tabSheet.add("Inventarios", crearSeccionInventarios());

        // Julian
        tabSheet.add("Movimientos Inventario", crearSeccionMovimientosInventario());
        tabSheet.add("Tipos Movimientos", crearSeccionTiposMovimientos());
        tabSheet.add("Alertas Inventario", crearSeccionAlertasInventario());
        tabSheet.add("Tipos Alerta", crearSeccionTiposAlerta());

        add(titulo, tabSheet);
    }

    // Método privado para gestionar la entidad CategoriaProductos
    private Component crearSeccionCategoriaProductos() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("ID");
        TextField nombreField = new TextField("Nombre");
        TextField descripcionField = new TextField("Descripción");

        FormLayout form = new FormLayout(idField, nombreField, descripcionField);

        Button btnCrear = new Button("Crear", e -> Notification.show("Entidad 1 - Crear: " + nombreField.getValue()));
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar",
                e -> Notification.show("Entidad 1 - Consultar ID: " + idField.getValue()));

        Button btnActualizar = new Button("Actualizar",
                e -> Notification.show("Entidad 1 - Actualizar ID: " + idField.getValue()));

        Button btnEliminar = new Button("Eliminar",
                e -> Notification.show("Entidad 1 - Eliminar ID: " + idField.getValue()));
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            nombreField.clear();
            descripcionField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
                btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar);
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Nombre").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Descripción").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    // Método privado para gestionar la entidad Productos
    private Component crearSeccionProductos() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("ID");
        TextField nombreField = new TextField("Nombre");
        TextField descripcionField = new TextField("Descripción");

        FormLayout form = new FormLayout(idField, nombreField, descripcionField);

        Button btnCrear = new Button("Crear", e -> Notification.show("Entidad 1 - Crear: " + nombreField.getValue()));
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar",
                e -> Notification.show("Entidad 1 - Consultar ID: " + idField.getValue()));

        Button btnActualizar = new Button("Actualizar",
                e -> Notification.show("Entidad 1 - Actualizar ID: " + idField.getValue()));

        Button btnEliminar = new Button("Eliminar",
                e -> Notification.show("Entidad 1 - Eliminar ID: " + idField.getValue()));
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            nombreField.clear();
            descripcionField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
                btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar);
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Nombre").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Descripción").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    // Método privado para gestionar la entidad TiposItems
    private Component crearSeccionTiposItems() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("ID");
        TextField nombreField = new TextField("Nombre");
        TextField descripcionField = new TextField("Descripción");

        FormLayout form = new FormLayout(idField, nombreField, descripcionField);

        Button btnCrear = new Button("Crear", e -> Notification.show("Entidad 1 - Crear: " + nombreField.getValue()));
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar",
                e -> Notification.show("Entidad 1 - Consultar ID: " + idField.getValue()));

        Button btnActualizar = new Button("Actualizar",
                e -> Notification.show("Entidad 1 - Actualizar ID: " + idField.getValue()));

        Button btnEliminar = new Button("Eliminar",
                e -> Notification.show("Entidad 1 - Eliminar ID: " + idField.getValue()));
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            nombreField.clear();
            descripcionField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
                btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar);
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Nombre").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Descripción").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    // Método privado para gestionar la entidad Inventarios
    private Component crearSeccionInventarios() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("ID");
        TextField nombreField = new TextField("Nombre");
        TextField descripcionField = new TextField("Descripción");

        FormLayout form = new FormLayout(idField, nombreField, descripcionField);

        Button btnCrear = new Button("Crear", e -> Notification.show("Entidad 1 - Crear: " + nombreField.getValue()));
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar",
                e -> Notification.show("Entidad 1 - Consultar ID: " + idField.getValue()));

        Button btnActualizar = new Button("Actualizar",
                e -> Notification.show("Entidad 1 - Actualizar ID: " + idField.getValue()));

        Button btnEliminar = new Button("Eliminar",
                e -> Notification.show("Entidad 1 - Eliminar ID: " + idField.getValue()));
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            nombreField.clear();
            descripcionField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
                btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar);
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Nombre").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Descripción").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    // Método privado para gestionar la entidad MovimientosInventario
    private Component crearSeccionMovimientosInventario() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField movimientoIdField = new TextField("ID Movimiento");
        TextField inventarioIdField = new TextField("ID Inventario");
        TextField tipoMovimientoIdField = new TextField("ID Tipo Movimiento");
        TextField cantidadField = new TextField("Cantidad");
        TextField fechaMovimientoFied = new TextField("Fecha Movimiento");
        TextField usuarioIdField = new TextField("ID Usuario");
        TextField motivoField = new TextField("Motivo Movimiento");
        TextField ventaIdField = new TextField("ID Venta");
        TextField compraIdField = new TextField("ID Compra");
        TextField devolucionIdField = new TextField("ID Devolución");

        FormLayout form = new FormLayout(
                movimientoIdField,
                inventarioIdField,
                tipoMovimientoIdField,
                cantidadField,
                fechaMovimientoFied,
                usuarioIdField,
                motivoField,
                ventaIdField,
                compraIdField,
                devolucionIdField);

        Button btnCrear = new Button("Crear",
                e -> Notification.show("Movimientos Inventario - Crear: " + inventarioIdField.getValue()));
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar",
                e -> Notification.show("Movimientos Inventario - Consultar ID: " + movimientoIdField.getValue()));

        Button btnActualizar = new Button("Actualizar",
                e -> Notification.show("Movimientos Inventario - Actualizar ID: " + movimientoIdField.getValue()));

        Button btnEliminar = new Button("Eliminar",
                e -> Notification.show("Movimientos Inventario - Eliminar ID: " + movimientoIdField.getValue()));
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            movimientoIdField.clear();
            inventarioIdField.clear();
            tipoMovimientoIdField.clear();
            cantidadField.clear();
            fechaMovimientoFied.clear();
            usuarioIdField.clear();
            motivoField.clear();
            ventaIdField.clear();
            compraIdField.clear();
            devolucionIdField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
                btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar);
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("ID Movimiento").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("ID Inventario").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("ID Tipo Movimiento").setAutoWidth(true);
        grid.addColumn(row -> row[3]).setHeader("Cantidad").setAutoWidth(true);
        grid.addColumn(row -> row[4]).setHeader("Fecha Movimiento").setAutoWidth(true);
        grid.addColumn(row -> row[5]).setHeader("ID Usuario").setAutoWidth(true);
        grid.addColumn(row -> row[6]).setHeader("Motivo Movimiento").setAutoWidth(true);
        grid.addColumn(row -> row[7]).setHeader("ID Venta").setAutoWidth(true);
        grid.addColumn(row -> row[8]).setHeader("ID Compra").setAutoWidth(true);
        grid.addColumn(row -> row[9]).setHeader("ID Devolución").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    // Método privado para gestionar la entidad TiposMovimientos
    private Component crearSeccionTiposMovimientos() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField tipoMovimientoIdField = new TextField("Tipo Movimiento ID");
        TextField nombreTipoField = new TextField("Nombre Tipo");
        TextField efectoMovimientoField = new TextField("Efecto Movimiento");

        FormLayout form = new FormLayout(
                tipoMovimientoIdField,
                nombreTipoField,
                efectoMovimientoField);

        Button btnCrear = new Button("Crear",
                e -> Notification.show("Tipo Movimiento - Crear: " + nombreTipoField.getValue()));
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar",
                e -> Notification.show("Tipo Movimiento - Consultar ID: " + tipoMovimientoIdField.getValue()));

        Button btnActualizar = new Button("Actualizar",
                e -> Notification.show("Tipo Movimiento - Actualizar ID: " + tipoMovimientoIdField.getValue()));

        Button btnEliminar = new Button("Eliminar",
                e -> Notification.show("Tipo Movimiento - Eliminar ID: " + tipoMovimientoIdField.getValue()));
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            tipoMovimientoIdField.clear();
            nombreTipoField.clear();
            efectoMovimientoField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
                btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar);
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("Tipo Movimiento ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Nombre Tipo").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Efecto Movimiento").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    // Método privado para gestionar la entidad AlertasInventario
    private Component crearSeccionAlertasInventario() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("ID");
        TextField nombreField = new TextField("Nombre");
        TextField descripcionField = new TextField("Descripción");

        FormLayout form = new FormLayout(idField, nombreField, descripcionField);

        Button btnCrear = new Button("Crear", e -> Notification.show("Entidad 1 - Crear: " + nombreField.getValue()));
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar",
                e -> Notification.show("Entidad 1 - Consultar ID: " + idField.getValue()));

        Button btnActualizar = new Button("Actualizar",
                e -> Notification.show("Entidad 1 - Actualizar ID: " + idField.getValue()));

        Button btnEliminar = new Button("Eliminar",
                e -> Notification.show("Entidad 1 - Eliminar ID: " + idField.getValue()));
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            nombreField.clear();
            descripcionField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
                btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar);
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Nombre").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Descripción").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    // Método privado para gestionar entidad TiposAlerta
    private Component crearSeccionTiposAlerta() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("Código / ID");
        TextField tituloField = new TextField("Título");
        TextField categoriaField = new TextField("Categoría");

        FormLayout form = new FormLayout(idField, tituloField, categoriaField);

        Button btnCrear = new Button("Crear", e -> Notification.show("Entidad 2 - Crear: " + tituloField.getValue()));
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar",
                e -> Notification.show("Entidad 2 - Consultar Código: " + idField.getValue()));

        Button btnActualizar = new Button("Actualizar",
                e -> Notification.show("Entidad 2 - Actualizar Código: " + idField.getValue()));

        Button btnEliminar = new Button("Eliminar",
                e -> Notification.show("Entidad 2 - Eliminar Código: " + idField.getValue()));
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            tituloField.clear();
            categoriaField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
                btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar);
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("Código / ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Título").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Categoría").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }
}
