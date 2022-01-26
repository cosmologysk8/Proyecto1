package utilidades;

import modelos.Factura;
import modelos.LineaFactura;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UtilidadesFactura {

    public static boolean esFactura(Factura factura){
        LocalDate fechaV = factura.getFechaVencimiento();
        boolean res = fechaV.isAfter(LocalDate.now());

        return res;
    }

    public static double calcularBaseFactura(Factura factura){
        double importeB = factura.getImporteBase();
        List<LineaFactura> LineaF = factura.getLineaFactura();
        double suma = 0.0;
        List<Double> listaFinal = new ArrayList<>();

        for(LineaFactura f: LineaF){
            suma += f.getProducto().getPrecio();
        }

    }



}
