/**
 *@author Fernando Mendoza Eslava-319097690
 *@version 1.0
 * Clase que cambia el valor de un arreglo por referencia 
  */
public class Referencia {

    //Metodo que se encarga de agregar un valor al array
    public static void main(String args[]) {
        String[] array = new String[1];
        change(array);
        System.out.println("El estado del array es: " + array[0]);
    }
    //Metodo que cambia el valor al array
    //Al pasar argumentos por referencia, el objeto en si no puede cambiarse e imprime null
    public static void change(String[] array) {
       array = new String[1];
       array[0] = "Se realizo el cambio de valor";
    }
}























