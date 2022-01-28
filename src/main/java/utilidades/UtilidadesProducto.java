package utilidades;

import modelos.Almacen;
import modelos.Producto;
import modelos.TipoProducto;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesProducto {


    public List<Producto> getPorTipo(List<Producto> productos, TipoProducto tipo) {
        List<Producto> ProductoTipo = new ArrayList<>();

        for (Producto pro : productos) {
            if (pro.equals(tipo)) {
                ProductoTipo.add(pro);
            }
        }
        return ProductoTipo;
    }
    public List<Producto> getPorAlmacen(List<Producto> productos, Almacen almacen){

            List<Producto> ProductoAlmacen = new ArrayList<>();

            for (Producto proAl : productos) {
                if (proAl.getAlmacen().equals(almacen)){
                    ProductoAlmacen.add(proAl);
                }
            }
            return ProductoAlmacen;
    }





}
