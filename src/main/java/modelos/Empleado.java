package modelos;

import java.util.Objects;

public class Empleado extends Persona{

    private String numTelefono;
    private Empresa empresa;
    private Contrato contrato;

    public Empleado(String numTelefono, Empresa empresa, Contrato contrato) {
        this.numTelefono = numTelefono;
        this.empresa = empresa;
        this.contrato = contrato;
    }

    public Empleado (Empleado e) {
        this.empresa = e.getEmpresa();
        this.contrato = e.getContrato();
        this.numTelefono = e.getNumTelefono();
    }

    public Empleado() {

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
                "numTelefono='" + numTelefono + '\'' +
                ", empresa=" + empresa +
                ", contrato=" + contrato +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(numTelefono, empleado.numTelefono) && Objects.equals(empresa, empleado.empresa) && Objects.equals(contrato, empleado.contrato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numTelefono, empresa, contrato);
    }
}
