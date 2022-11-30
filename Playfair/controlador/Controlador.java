package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.event.PrintEvent;
import javax.swing.JOptionPane;
import modelo.Playfair;
import javax.swing.text.PlainDocument;

import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //Atributos
    private VentanaPrincipal venPrin;
    private Playfair model;
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Playfair pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);        
    }

    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();
        
        if(comando.equals("cifrar"))
        {
            model.Cifrado(comando, comando);
            venPrin.miPanelResultado.mostrarResultado(model.cifrado);
        }

        if(comando.equals("descifrar"))
        {
            model.Descifrado(comando, comando);
            venPrin.miPanelResultado.mostrarResultado(model.descifrado);
        }

        if(comando.equals("borrar"))
        {
            this.venPrin.miPanelEntradaDatos.borrar();
            this.venPrin.miPanelResultado.borrar();
        }
        
    }

}
