package utilidades;

import modelos.Cliente;

import static java.lang.Character.isLetter;

public class UtilidadesCliente {


    public static boolean esDniValido(Cliente cliente){

        boolean num_dni = true;
        String comprobacion = cliente.getDni();
        char[] cadena = comprobacion.toCharArray();

        for (int f= 0; f < cadena.length; f++){

            char letra = cadena[f];

            if (f < cadena.length -1 && !Character.isDigit(letra)) {
                num_dni = false;
            }
            if (f == cadena.length -1 && !Character.isLetter(letra)){
                num_dni = false;
            }
        }

        return num_dni;
    }


}
