package mariovelez.psptarea3;

import java.util.LinkedList;

/**
 *
 * @author Mario F. Vélez R.
 */
public class Controlador
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Vista controladorVista = new Vista();
        Modelo controladorModelo = new Modelo();
        LinkedList<String> listaE = controladorVista.leerArchivo("datos.txt");
        double xK = controladorVista.pedirProxyEstimado();
        double b0 = controladorModelo.calcularB0(listaE);
        double b1 = controladorModelo.calcularB1(listaE);
        double rXY = controladorModelo.calcularRxy(listaE);
        double r2 = controladorModelo.calcularR2(listaE);
        double yK = controladorModelo.calcularYk(b0, b1, xK);
        controladorVista.mostrarResultados(b0, b1, rXY, r2, yK);
    }
}