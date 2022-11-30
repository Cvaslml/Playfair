package ejecutable;

import controlador.Controlador;
import vista.VentanaPrincipal;
import modelo.Playfair;

public class Test {
    public static void main(String[] args)
    {
        Playfair miModelo = new Playfair();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Controlador miControlador = new Controlador(miVentana, miModelo);
    }    
}
