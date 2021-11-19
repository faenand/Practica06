/**
 *@author Fernando Mendoza Eslava-319097690
 *@version 1.0
 * Clase que cambia el valor de un arreglo por referencia 
  */
    //Metodo que se encarga de agregar un valor al array
public class Valor {
    public static void main(String args[]) {
      String[] array = new String[1];
      
      change(array);
      System.out.println("El estado del array es: " + array[0]);
    }
    //Metodo que cambia el valor al array
    //Al pasar argumentos por valor, los elementos del arreglo pueden cambiarse y en este caso se imprime el mensaje
    public static void change(String[] array) {
       array[0] = "Se realizo el cambio de valor";
    }
}


