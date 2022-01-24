package modelos;

import java.time.LocalDate;
import java.util.Objects;

public class Producto {

    private int identificador;
    private String codigo;
    private String descripcion;
    private LocalDate fechaCaducidad;
    private Almacen almacen;

    public Producto(int identificador, String codigo, String descripcion, LocalDate fechaCaducidad, Almacen almacen) {
        this.identificador = identificador;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechaCaducidad = fechaCaducidad;
        this.almacen = almacen;
    }

    public Producto (Producto p) {
        this.identificador = p.getIdentificador();
        this.codigo = p.getCodigo();
        this.descripcion = p.getDescripcion();
        this.fechaCaducidad = p.getFechaCaducidad();
        this.almacen = p.getAlmacen();
    }

    public Producto() {

    }

    public int getIdentificador() {
        return identificador;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "identificador=" + identificador +
                ", codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCaducidad=" + fechaCaducidad +
                ", almacen=" + almacen +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return identificador == producto.identificador && Objects.equals(codigo, producto.codigo) && Objects.equals(descripcion, producto.descripcion) && Objects.equals(fechaCaducidad, producto.fechaCaducidad) && Objects.equals(almacen, producto.almacen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, codigo, descripcion, fechaCaducidad, almacen);
    }
}
