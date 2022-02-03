package modelos;

import java.util.Objects;

public class Empleado {

    private int identificador;
    private String dni;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String numTelefono;
    private Empresa empresa;
    private Contrato contrato;

    public Empleado(int identificador, String dni, String nombres, String apellidos, String direccion, String numTelefono, Empresa empresa, Contrato contrato) {
        this.identificador = identificador;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
        this.empresa = empresa;
        this.contrato = contrato;
    }

    public Empleado (Empleado e) {
        this.identificador = e.getIdentificador();
        this.dni = e.getDni();
        this.nombres = e.getNombres();
        this.apellidos = e.getApellidos();
        this.direccion = e.getDireccion();
        this.numTelefono= e.getNumTelefono();
        this.empresa = getEmpresa();
        this.contrato = e.getContrato();
    }

    public Empleado() {

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

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
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

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "identificador=" + identificador +
                ", dni='" + dni + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numTelefono='" + numTelefono + '\'' +
                ", empresa=" + empresa +
                ", contrato=" + contrato +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return identificador == empleado.identificador && Objects.equals(dni, empleado.dni) && Objects.equals(nombres, empleado.nombres) && Objects.equals(apellidos, empleado.apellidos) && Objects.equals(direccion, empleado.direccion) && Objects.equals(numTelefono, empleado.numTelefono) && Objects.equals(empresa, empleado.empresa) && Objects.equals(contrato, empleado.contrato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, dni, nombres, apellidos, direccion, numTelefono, empresa, contrato);
    }
}
