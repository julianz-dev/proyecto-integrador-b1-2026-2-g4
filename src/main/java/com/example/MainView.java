package com.example;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextArea;

@PageTitle("Proyecto Integrador Grupo 4")
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

        Button btnCrear = new Button("Crear",
                e -> Notification.show("Entidad 1 - Crear: " + negocioIdField.getValue()));
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

        FormLayout form = new FormLayout(producutoIdField, negocioIdField, categoriaIdField,
                codigoProductoField, nombreProductoField, descripcionServicioField,
                precioVentaField, tipoItemIdField, manejaInventarioField, activoField);

        Button btnCrear = new Button("Crear",
                e -> Notification.show("Entidad 1 - Crear: " + negocioIdField.getValue()));
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

        FormLayout form = new FormLayout(tipoItemIdField, nombreItemField, descripcionTipoItemField,
                activoField);

        Button btnCrear = new Button("Crear",
                e -> Notification.show("Entidad 1 - Crear: " + nombreItemField.getValue()));
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

        FormLayout form = new FormLayout(inventarioIdField, productoIdField, cantidadDisponibleField,
                stockMinimoField, fechaActualizacionField);

        Button btnCrear = new Button("Crear",
                e -> Notification.show("Entidad 1 - Crear: " + productoIdField.getValue()));
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

        TextField movimientoIdField = new TextField("ID Movimiento");
        TextField inventarioIdField = new TextField("ID Inventario");
        TextField tipoMovimientoIdField = new TextField("ID Tipo Movimiento");
        NumberField cantidadField = new NumberField("Cantidad");
        DatePicker fechaMovimientoFied = new DatePicker("Fecha Movimiento");
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
                e -> Notification.show(
                        "Movimientos Inventario - Crear: " + inventarioIdField.getValue()));
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar",
                e -> Notification.show("Movimientos Inventario - Consultar ID: "
                        + movimientoIdField.getValue()));

        Button btnActualizar = new Button("Actualizar",
                e -> Notification.show("Movimientos Inventario - Actualizar ID: "
                        + movimientoIdField.getValue()));

        Button btnEliminar = new Button("Eliminar",
                e -> Notification.show("Movimientos Inventario - Eliminar ID: "
                        + movimientoIdField.getValue()));
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
                e -> Notification.show(
                        "Tipo Movimiento - Consultar ID: " + tipoMovimientoIdField.getValue()));

        Button btnActualizar = new Button("Actualizar",
                e -> Notification.show("Tipo Movimiento - Actualizar ID: "
                        + tipoMovimientoIdField.getValue()));

        Button btnEliminar = new Button("Eliminar",
                e -> Notification.show(
                        "Tipo Movimiento - Eliminar ID: " + tipoMovimientoIdField.getValue()));
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

        TextField alertaIdField = new TextField("ID Alerta");
        TextField inventarioIdField = new TextField("ID Inventario");
        TextField tipoAlertaIdField = new TextField("Tipo Alerta");
        DatePicker fechaGeneracionField = new DatePicker("Fecha Generacion");
        DatePicker fechaResolucionField = new DatePicker("Fecha Resolucion");
        Select<Boolean> activaField = new Select<>();
        activaField.setLabel("Alerta Activa");
        activaField.setItems(true, false);
        activaField.setItemLabelGenerator(activo -> activo ? "Sí" : "No");

        FormLayout form = new FormLayout(
                alertaIdField,
                inventarioIdField,
                tipoAlertaIdField,
                fechaGeneracionField,
                fechaResolucionField,
                activaField);

        Button btnCrear = new Button("Crear",
                e -> Notification.show("Alerta Inventario - Crear: " + alertaIdField.getValue()));
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar",
                e -> Notification
                        .show("Alerta Inventario - Consultar ID: " + alertaIdField.getValue()));

        Button btnActualizar = new Button("Actualizar",
                e -> Notification.show(
                        "Alerta Inventario - Actualizar ID: " + alertaIdField.getValue()));

        Button btnEliminar = new Button("Eliminar",
                e -> Notification.show("Alerta Inventario - Eliminar ID: " + alertaIdField.getValue()));
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            alertaIdField.clear();
            inventarioIdField.clear();
            tipoAlertaIdField.clear();
            fechaGeneracionField.clear();
            fechaResolucionField.clear();
            activaField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
                btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar);
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("ID Alerta").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("ID Inventario").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Tipo Alerta").setAutoWidth(true);
        grid.addColumn(row -> row[3]).setHeader("Fecha Generacion").setAutoWidth(true);
        grid.addColumn(row -> row[4]).setHeader("Fecha Resolucion").setAutoWidth(true);
        grid.addColumn(row -> row[5]).setHeader("Estado Activo").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    // Método privado para gestionar entidad TiposAlerta
    private Component crearSeccionTiposAlerta() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        NumberField tipoAlertaIdField = new NumberField("Tipo Alerta ID");
        TextField nombreTipoField = new TextField("Nombre Tipo");
        TextArea descripcionAlertaField = new TextArea("Descripcion Alerta");
        TextField prioridadField = new TextField("Prioridad");
        Select<Boolean> activoField = new Select<>();
        activoField.setLabel("Estado activo");
        activoField.setItems(true, false);
        activoField.setItemLabelGenerator(activo -> activo ? "Sí" : "No");

        FormLayout form = new FormLayout(
                tipoAlertaIdField,
                nombreTipoField,
                descripcionAlertaField,
                prioridadField,
                activoField);

        Button btnCrear = new Button("Crear",
                e -> Notification.show("Entidad 2 - Crear: " + nombreTipoField.getValue()));
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar",
                e -> Notification
                        .show("Entidad 2 - Consultar Código: " + tipoAlertaIdField.getValue()));

        Button btnActualizar = new Button("Actualizar",
                e -> Notification.show(
                        "Entidad 2 - Actualizar Código: " + tipoAlertaIdField.getValue()));

        Button btnEliminar = new Button("Eliminar",
                e -> Notification.show("Entidad 2 - Eliminar Código: " + tipoAlertaIdField.getValue()));
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            tipoAlertaIdField.clear();
            nombreTipoField.clear();
            descripcionAlertaField.clear();
            prioridadField.clear();
            activoField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
                btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar);
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("Tipo Alerta ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Nombre Tipo").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Descripcion Alerta").setAutoWidth(true);
        grid.addColumn(row -> row[3]).setHeader("Prioridad").setAutoWidth(true);
        grid.addColumn(row -> row[4]).setHeader("Estado activo").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }
}
