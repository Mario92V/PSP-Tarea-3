package mariovelez.psptarea3;

import java.util.LinkedList;

/**
 *
 * @author Mario F. Vélez R.
 */
public class Modelo
{
    /**
     * Metodo para el cálculo de la media aritmética para los valores de la lista
     * 
     * @param listaE Lista enlazada con los valores del archivo de texto
     * @param tipo   Si el valor es 0 calcula la media de los valores en X y
     *               si es 1 calcula los valores en Y
     * @return       La media aritmética de los valores en X o Y
     */
    public double calcularMedia(LinkedList<String> listaE, int tipo)
    {
        Float[] valoresX = new Float[listaE.size()];
        Float[] valoresY = new Float[listaE.size()];
        String[] partes = new String[1];
        double media=0.0;
        for(int i =0; i<listaE.size();i++)
        {
            partes=listaE.get(i).split(",");
            valoresX[i] = Float.parseFloat(partes[0]);
            valoresY[i] = Float.parseFloat(partes[1]);
            if(tipo==0)
            {
                media=media+valoresX[i];
            }
            else if(tipo==1)
            {
                media=media+valoresY[i];
            }
        }
        media=media/listaE.size();
        return media;
    }
    
    /**
     * Método que calcula el parametro de regresión lineal B0
     * 
     * @param listaE Lista enlazada con los valores del archivo de texto
     * @return       Parametro B0
     */
    public double calcularB0(LinkedList<String> listaE)
    {
        double b0 = calcularMedia(listaE, 1) - (calcularB1(listaE)*calcularMedia(listaE, 0));
        return b0;
    }
    
    /**
     * Método que calcula el parámetro de regresión lineal B1
     * 
     * @param listaE Lista enlazada con los valores del archivo de texto
     * @return       Parámetro B1
     */
    public double calcularB1(LinkedList<String> listaE)
    {
        int n = listaE.size();
        double parteArriba=0.0;
        double parteAbajo=0.0;
        Float[] valoresX = new Float[listaE.size()];
        Float[] valoresY = new Float[listaE.size()];
        String[] partes = new String[1];
        for(int i =0; i<listaE.size();i++)
        {
            partes=listaE.get(i).split(",");
            valoresX[i] = Float.parseFloat(partes[0]);
            valoresY[i] = Float.parseFloat(partes[1]);
            parteArriba += valoresX[i]*valoresY[i];
            parteAbajo += Math.pow(valoresX[i], 2);
        }
        parteArriba = parteArriba-(n*calcularMedia(listaE, 0)*calcularMedia(listaE, 1));
        parteAbajo = parteAbajo - (n*Math.pow(calcularMedia(listaE, 0), 2));
        double b1=parteArriba/parteAbajo;
        return b1;
    }
    
    /**
     * Método que calcula el valor del coeficiente de correlación r(x,y)
     * 
     * @param listaE Lista enlazada con los valores del archivo de texto
     * @return       Coeficiente de correlación r(x,y)
     */
    public double calcularRxy(LinkedList<String> listaE)
    {
        int n = listaE.size();
        double parteArriba1=0.0;
        double parteArriba2=0.0;
        double parteArriba3=0.0;
        double parteAbajo1=0.0;
        double parteAbajo2=0.0;
        Float[] valoresX = new Float[listaE.size()];
        Float[] valoresY = new Float[listaE.size()];
        String[] partes = new String[1];
        for(int i =0; i<listaE.size();i++)
        {
            partes=listaE.get(i).split(",");
            valoresX[i] = Float.parseFloat(partes[0]);
            valoresY[i] = Float.parseFloat(partes[1]);
            parteArriba1 +=  valoresX[i]*valoresY[i];
            parteArriba2 +=  valoresX[i];
            parteArriba3 +=  valoresY[i];
            parteAbajo1 += Math.pow(valoresX[i], 2);
            parteAbajo2 += Math.pow(valoresY[i], 2);
        }
        double parteArribaTotal = (n*parteArriba1)-(parteArriba2*parteArriba3);
        double parteAbajoTotal = Math.sqrt(((n*parteAbajo1)-Math.pow(parteArriba2, 2))*((n*parteAbajo2)-Math.pow(parteArriba3, 2)));
        double rXY = parteArribaTotal/parteAbajoTotal;
        return rXY;
    }
    
    /**
     * Método que calcula el coeficiente de correlación r^2
     * 
     * @return Coeficiente de correlación r^2
     */
    public double calcularR2(LinkedList<String> listaE)
    {
        double r2 = Math.pow(calcularRxy(listaE), 2);
        return r2;
    }
    
    /**
     * Método que calcula la predicción mejorada Yk
     * 
     * @param b0 Resultado obtenido del método que calcula B0
     * @param b1 Resultado obtenido del método que calcula B1
     * @param xK Dato ingresado por el usuario
     * @return   Predicción mejorada Yk
     */
    public double calcularYk(double b0, double b1, double xK)
    {
        double yK = b0 + (b1*xK);
        return yK;
    }
}