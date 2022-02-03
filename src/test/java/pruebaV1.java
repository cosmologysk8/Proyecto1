import modelos.Cliente;
import modelos.Empresa;
import utilidades.UtilidadesCliente;

public class pruebaV1 {

    public static void main(String[] args) {

        Cliente c1 = new Cliente(322,"8893542K","Juan","Garcia","Parque Sierra magina");

        System.out.println(UtilidadesCliente.esDniValido(c1));

    }



}
