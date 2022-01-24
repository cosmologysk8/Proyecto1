package modelos;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente {

    private int identificador;
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;

    public Cliente(int identificador, String dni, String nombre, String apellidos, String direccion) {
        this.identificador = identificador;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    public Cliente(Cliente c) {
        this.identificador = c.getIdentificador();
        this.dni = c.getDni();
        this.nombre = c.getNombre();
        this.apellidos= c.getApellidos();
        this.direccion = c.getDireccion();
    }

    public Cliente() {

    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "identificador=" + identificador +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return identificador == cliente.identificador && Objects.equals(dni, cliente.dni) && Objects.equals(nombre, cliente.nombre) && Objects.equals(apellidos, cliente.apellidos) && Objects.equals(direccion, cliente.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, dni, nombre, apellidos, direccion);
    }
}
