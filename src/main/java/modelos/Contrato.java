package modelos;

import java.util.Objects;

public class Contrato {

    private int identificador;
    private double salarioBase;
    private TipoContrato TipoContrato;

    public Contrato(int identificador, double salarioBase) {
        this.identificador = identificador;
        this.salarioBase = salarioBase;
    }

    public Contrato(Contrato cont){
        this.identificador = cont.getIdentificador();
        this.salarioBase = cont.getSalarioBase();
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

    @Override
    public String toString() {
        return "Contrato{" +
                "identificador=" + identificador +
                ", salarioBase=" + salarioBase +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contrato contrato = (Contrato) o;
        return identificador == contrato.identificador && Double.compare(contrato.salarioBase, salarioBase) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, salarioBase);
    }
}
