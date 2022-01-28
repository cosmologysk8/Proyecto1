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

        List<LineaFactura> LineaF = factura.getLineaFactura();

        double sumaImporteBase = 0.0;

        List<Double> listaFinal = new ArrayList<>();

        for(LineaFactura f: LineaF){
            sumaImporteBase += f.getProducto().getPrecio() * f.getCantidad();
        }

        return sumaImporteBase;
    }

    public static double calcularTotalAPagar(Factura factura){

        double totalAPagar = (factura.getImporteBase() - factura.getDescuento())*factura.getIva();

        return totalAPagar;

    }



}
