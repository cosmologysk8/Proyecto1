import modelos.Factura;

import static utilidades.UtilidadesFactura.esFactura;


public class pruebaV1 {

    public static void main(String[] args) {
        System.out.println(esFactura(new Factura()));
    }
}
