package modelos;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente extends Persona {

    private TipoCliente tipoCliente;

    public Cliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Cliente(Cliente c) {
        this.tipoCliente = c.tipoCliente;
    }

    public Cliente() {
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "tipoCliente=" + tipoCliente +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return tipoCliente == cliente.tipoCliente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoCliente);
    }
}
