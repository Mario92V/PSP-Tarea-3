package mariovelez.psptarea3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Mario F. Vélez R.
 */
public class Vista
{
   /**
    * Método para pedirle al usuario el valor del proxy estimado Xk
    * 
    * @return      El valor dado por el usuario para su uso
    */
    public double pedirProxyEstimado()
    {
        System.out.println("Digite el valor del proxy estimado. Si es decimal use la siguiente forma. Ej. 100,0");
        Scanner teclado = new Scanner(System.in);
        double xK = teclado.nextDouble();
        return xK;
    }
    
    /**
    * Método encargado de tomar el archivo de texto y guardar su
    * información en la lista enlazada
    * 
    * @param  nombreArchivo  El nombre del archivo del que se leen los datos
    * @return                Lista enlazada con los valores del archivo de texto
    */
    public LinkedList<String> leerArchivo(String nombreArchivo)
    {
        LinkedList<String> listaE = new LinkedList<String>();
        try
        {
            BufferedReader br =new BufferedReader(new FileReader(nombreArchivo));
            String line;
            try
            {
                line = br.readLine();
                while(line!=null)
                {
                    listaE.add(line);
                    line = br.readLine();
                }
            }
            catch (IOException ex)
            {
                System.out.println("Error en la lectura del archivo");
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado");
        }
        return listaE;
    }
    
    /**
     * Método que muestra los resultados de los cálculos realizados en pantalla
     * 
     * @param b0  Parametro calculado en la clase Modelo, metodo calcularB0
     * @param b1  Parametro calculado en la clase Modelo, metodo calcularB1
     * @param rXY Parametro calculado en la clase Modelo, metodo calcularRxy
     * @param r2  Parametro calculado en la clase Modelo, metodo calcularR2
     * @param yK  Parametro calculado en la clase Modelo, metodo calcularYk
     */
    public void mostrarResultados(double b0, double b1, double rXY, double r2, double yK)
    {
        System.out.println("Los valores obtenidos a partir de la lista de datos y el valor ingresado son:");
        System.out.println("B0 = " + b0);
        System.out.println("B1 = " + b1);
        System.out.println("r(x,y) = " + rXY);
        System.out.println("r^2 = " + r2);
        System.out.println("y(k) = " + yK);
    }
}