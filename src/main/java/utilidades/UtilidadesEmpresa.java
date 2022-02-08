package utilidades;

import modelos.Empleado;
import modelos.Empresa;
import modelos.TipoContrato;

import java.util.*;

public class UtilidadesEmpresa<Empleados2> {

    public static List<Empleado> getEmpleadosPorContrato(Empresa empresa, TipoContrato tipoContrato){

        List<Empleado> EmpleadoContrato = new ArrayList<>();


        for (Empleado emp: empresa.getEmpleados()){
            if (tipoContrato.equals(emp.getContrato())){
                EmpleadoContrato.add(emp);
            }
        }

        return EmpleadoContrato;
    }

    public List<Empleado> getMileuristasOrdenadosPorSalario(Empresa empresa){

        List<Empleado> EmpleadoSalario = new ArrayList<>();

        for (Empleado emp : empresa.getEmpleados()){
            if (emp.getContrato().getSalarioBase() >= 1000){
                EmpleadoSalario.add(emp);
            }
        }

        EmpleadoSalario.sort(Comparator.comparing(s -> s.getContrato().getSalarioBase()))
        return EmpleadoSalario;
    }

    public double fondoSalarialEmpresa(Empresa empresa){

        Double SumaTotalEmpleados = 0.0;

        for (Empleado emp: empresa.getEmpleados()){
            SumaTotalEmpleados += emp.getContrato().getSalarioBase();
        }

        return SumaTotalEmpleados;
    }

    public Empleado getMejorPagado(List<Empresa> empresas){
        Empleado MejorPagado;
        List<Empleado> EmpleadosSalario = new ArrayList<>();

        for (Empresa empr: empresas ){
            EmpleadosSalario.addAll(empr.getEmpleados());
        }

        EmpleadosSalario.sort(Comparator.comparing(c -> c.getContrato().getSalarioBase()));

        MejorPagado = EmpleadosSalario.get(0);

        return MejorPagado;

    }

    public Map<TipoContrato, List<Empleado>> getEmpleadosPorTipoContrato(Empresa empresas){
        //Que devuelve un mapa de los empleados de la empresa agrupados por su
        //tipo de contrato

        Map<TipoContrato, List<Empleado>> Empleados2 = new HashMap<>();

        for (Empleado tp: empresas.getEmpleados()){
            Empleados2.put(TipoContrato.Practicas, new ArrayList<>());
            Empleados2.put(TipoContrato.Temporal, new ArrayList<>());
            Empleados2.put(TipoContrato.Obrasyservicio, new ArrayList<>());
            Empleados2.put(TipoContrato.Indefinido, new ArrayList<>());


            switch (tp.getContrato().getTipoContrato()){
                case Temporal:
                    Empleados2.get(TipoContrato.Temporal).add(tp);
                case Practicas:
                    Empleados2.get(TipoContrato.Practicas).add(tp);
                case Indefinido:
                    Empleados2.get(TipoContrato.Indefinido).add(tp);
                case Obrasyservicio:
                    Empleados2.get(TipoContrato.Obrasyservicio).add(tp);
            }
        }
            return Empleados2;
        }

    public Map<Empresa, Map<TipoContrato, List<Empleado>>> getEmpleadosPorTipoContrato(List<Empresa> empresas){
        // Que hace lo mismo que el apartado anterior pero a partir de una lista de
        //empresas.

        Map<Empresa, Map<TipoContrato,List<Empleado>>> Empleados3 = new HashMap<>();
        
        for (Empresa emp: empresas){
            emp.put(Empresa, TipoContrato.Practicas, new ArrayList<>());
        }

    }




}

}
