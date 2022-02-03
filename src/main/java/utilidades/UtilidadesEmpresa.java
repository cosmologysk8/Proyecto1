package utilidades;

import modelos.Contrato;
import modelos.Empleado;
import modelos.Empresa;
import modelos.TipoContrato;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UtilidadesEmpresa {

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

        List<Empleado> MejorPagado = new ArrayList<>();

        for (Empresa empr: empresas ){
            MejorPagado.addAll(empr.getEmpleados());
        }

        for (Empresa emp: empresas){

        }


    }

}
