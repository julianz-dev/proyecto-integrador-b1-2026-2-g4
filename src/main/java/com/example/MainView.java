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

        TextField categoriaIdField = new TextField("nombreCategoria");
        TextField negocioIdField = new TextField("negocioId");
        TextField nombreCategoriaField = new TextField("nombreCategoria");

        FormLayout form = new FormLayout(categoriaIdField, negocioIdField, nombreCategoriaField);

        Button btnCrear = new Button("Crear", e -> Notification.show("Entidad 1 - Crear: " + negocioIdField.getValue()));
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar",
                e -> Notification.show("Entidad 1 - Consultar ID: " + categoriaIdField.getValue()));

        Button btnActualizar = new Button("Actualizar",
                e -> Notification.show("Entidad 1 - Actualizar ID: " + categoriaIdField.getValue()));

        Button btnEliminar = new Button("Eliminar",
                e -> Notification.show("Entidad 1 - Eliminar ID: " + categoriaIdField.getValue()));
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            categoriaIdField.clear();
            negocioIdField.clear();
            nombreCategoriaField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
                btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar);
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("nombreCategoria").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("negocioId").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("nombreCategoria").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    // Método privado para gestionar la entidad Productos
    private Component crearSeccionProductos() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField producutoIdField = new TextField("producutoId");
        TextField negocioIdField = new TextField("negocioId");
        TextField categoriaIdField = new TextField("categoriaId");
        TextField codigoProductoField = new TextField("codigoProducto");
        TextField nombreProductoField = new TextField("nombreProducto");
        TextField descripcionServicioField = new TextField("descripcionServicio");
        TextField precioVentaField = new TextField("precioVenta");
        TextField tipoItemIdField = new TextField("tipoItemId");
        TextField manejaInventarioField = new TextField("manejaInventario");
        TextField activoField = new TextField("activo");

        FormLayout form = new FormLayout(producutoIdField, negocioIdField, categoriaIdField, codigoProductoField, nombreProductoField, descripcionServicioField,
            precioVentaField, tipoItemIdField, manejaInventarioField, activoField);

        Button btnCrear = new Button("Crear", e -> Notification.show("Entidad 1 - Crear: " + negocioIdField.getValue()));
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar",
                e -> Notification.show("Entidad 1 - Consultar ID: " + producutoIdField.getValue()));

        Button btnActualizar = new Button("Actualizar",
                e -> Notification.show("Entidad 1 - Actualizar ID: " + producutoIdField.getValue()));

        Button btnEliminar = new Button("Eliminar",
                e -> Notification.show("Entidad 1 - Eliminar ID: " + producutoIdField.getValue()));
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            producutoIdField.clear();
            negocioIdField.clear();
            categoriaIdField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
                btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar);
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("producutoIdField").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("negocioId").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("categoriaId").setAutoWidth(true);
        grid.addColumn(row -> row[3]).setHeader("codigoProducto").setAutoWidth(true);
        grid.addColumn(row -> row[4]).setHeader("nombreProducto").setAutoWidth(true);
        grid.addColumn(row -> row[5]).setHeader("descripcionServicio").setAutoWidth(true);
        grid.addColumn(row -> row[6]).setHeader("precioVenta").setAutoWidth(true);
        grid.addColumn(row -> row[7]).setHeader("tipoItemId").setAutoWidth(true);
        grid.addColumn(row -> row[8]).setHeader("manejaInventario").setAutoWidth(true);
        grid.addColumn(row -> row[9]).setHeader("activo").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    // Método privado para gestionar la entidad TiposItems
    private Component crearSeccionTiposItems() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField tipoItemIdField = new TextField("tipoItemId");
        TextField nombreItemField = new TextField("nombreItem");
        TextField descripcionTipoItemField = new TextField("Descripción");
        TextField activoField = new TextField("Descripción");

        FormLayout form = new FormLayout(tipoItemIdField, nombreItemField, descripcionTipoItemField, activoField);

        Button btnCrear = new Button("Crear", e -> Notification.show("Entidad 1 - Crear: " + nombreItemField.getValue()));
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar",
                e -> Notification.show("Entidad 1 - Consultar ID: " + tipoItemIdField.getValue()));

        Button btnActualizar = new Button("Actualizar",
                e -> Notification.show("Entidad 1 - Actualizar ID: " + tipoItemIdField.getValue()));

        Button btnEliminar = new Button("Eliminar",
                e -> Notification.show("Entidad 1 - Eliminar ID: " + tipoItemIdField.getValue()));
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            tipoItemIdField.clear();
            nombreItemField.clear();
            descripcionTipoItemField.clear();
            activoField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
                btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar);
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("tipoItemId").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("nombreItem").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("descripcionTipoItem").setAutoWidth(true);
        grid.addColumn(row -> row[3]).setHeader("activo").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    // Método privado para gestionar la entidad Inventarios
    private Component crearSeccionInventarios() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField inventarioIdField = new TextField("inventarioId");
        TextField productoIdField = new TextField("productoId");
        TextField cantidadDisponibleField = new TextField("cantidadDisponible");
        TextField stockMinimoField = new TextField("stockMinimo");
        TextField fechaActualizacionField = new TextField("fechaActualizacion");

        FormLayout form = new FormLayout(inventarioIdField, productoIdField, cantidadDisponibleField, stockMinimoField, fechaActualizacionField);

        Button btnCrear = new Button("Crear", e -> Notification.show("Entidad 1 - Crear: " + productoIdField.getValue()));
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar",
                e -> Notification.show("Entidad 1 - Consultar ID: " + inventarioIdField.getValue()));

        Button btnActualizar = new Button("Actualizar",
                e -> Notification.show("Entidad 1 - Actualizar ID: " + inventarioIdField.getValue()));

        Button btnEliminar = new Button("Eliminar",
                e -> Notification.show("Entidad 1 - Eliminar ID: " + inventarioIdField.getValue()));
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            inventarioIdField.clear();
            productoIdField.clear();
            cantidadDisponibleField.clear();
            stockMinimoField.clear();
            fechaActualizacionField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
                btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar);
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("inventarioId").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("productoId").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("cantidadDisponible").setAutoWidth(true);
        grid.addColumn(row -> row[3]).setHeader("Stock Mínimo").setAutoWidth(true);
        grid.addColumn(row -> row[4]).setHeader("Fecha de Actualización").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    // Método privado para gestionar la entidad MovimientosInventario
    private Component crearSeccionMovimientosInventario() {
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

    // Método privado para gestionar la entidad TiposMovimientos
    private Component crearSeccionTiposMovimientos() {
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
