package utilidades;

import modelos.*;

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

        EmpleadoSalario.sort(Comparator.comparing(s -> s.getContrato().getSalarioBase()));
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

        for (Empresa empr: empresas){
            EmpleadosSalario.addAll(empr.getEmpleados());
        }

        EmpleadosSalario.sort(Comparator.comparing(c -> c.getContrato().getSalarioBase()));

        MejorPagado = EmpleadosSalario.get(0);

        return MejorPagado;

    }

    public Map<TipoContrato, List<Empleado>> getEmpleadosPorTipoContrato(Empresa empresa){
        //Que devuelve un mapa de los empleados de la empresa agrupados por su
        //tipo de contrato

        Map<TipoContrato, List<Empleado>> Empleados2 = new HashMap<>();

        for (Empleado tp: empresa.getEmpleados()){
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
            Empleados3.put(emp, getEmpleadosPorTipoContrato(emp));
        }
        return Empleados3;
    }

    public List<Empleado> getEmpleadosPymePracticas(List<Empresa> empresas){

        List<Empleado> Empleadostipo2 = new ArrayList<>();

        for(Empresa emp : empresas){
            if (emp.getEmpleados().equals(TipoContrato.Practicas) && emp.equals(TipoEmpresa.Pyme)) {
                Empleadostipo2.add((Empleado) emp.getEmpleados());
            }
        }

        return Empleadostipo2;
    }

    public Map<Empresa,Empleado> getLosMejorPagadosPorEmpresa(List<Empresa> empresas){
        Map<Empresa, Empleado> mejorPagado = new HashMap<>();

        for (Empresa emp : empresas){
            List<Empresa> empresas1 = new ArrayList<>();
            empresas1.add(emp);
            mejorPagado.put(emp, getMejorPagado(empresas1));
        }
        return mejorPagado;
    }


}
