package modelos;

import java.util.Objects;

public class Contrato {

    private int identificador;
    private double salarioBase;
    private TipoContrato TipoContrato;

    public Contrato(Contrato con) {
        this.identificador = con.getIdentificador();
        this.salarioBase = con.getSalarioBase();
        this.TipoContrato = con.TipoContrato;
    }

    public Contrato(int identificador, double salarioBase, modelos.TipoContrato tipoContrato) {
        this.identificador = identificador;
        this.salarioBase = salarioBase;
        TipoContrato = tipoContrato;
    }

    public Contrato() {
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public modelos.TipoContrato getTipoContrato() {
        return TipoContrato;
    }

    public void setTipoContrato(modelos.TipoContrato tipoContrato) {
        TipoContrato = tipoContrato;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "identificador=" + identificador +
                ", salarioBase=" + salarioBase +
                ", TipoContrato=" + TipoContrato +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contrato contrato = (Contrato) o;
        return identificador == contrato.identificador && Double.compare(contrato.salarioBase, salarioBase) == 0 && TipoContrato == contrato.TipoContrato;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, salarioBase, TipoContrato);
    }
}
