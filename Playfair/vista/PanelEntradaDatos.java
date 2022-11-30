package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel {
    // Atributos
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lMensaje;
    private JLabel lClave;
    private JTextField tfMensaje;
    private JTextField tfClave;

    // Métodos

    /* Método Constructor */

    public PanelEntradaDatos() {
        // Definicion del contenedor del panel
        setLayout(null);
        setBackground(Color.pink);

        // Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/playfair.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 20, 170, 158);
        this.add(lbImagen);

        // Crear y agregar etiquetas, campos de texto
        lMensaje = new JLabel("Mensaje =");
        lMensaje.setBounds(200, 40, 150, 20);
        this.add(lMensaje);

        tfMensaje = new JTextField();
        tfMensaje.setBounds(270, 40, 100, 20);
        this.add(tfMensaje);

        lClave = new JLabel("Clave =");
        lClave.setBounds(200, 70, 150, 20);
        this.add(lClave);

        tfClave = new JTextField();
        tfClave.setBounds(250, 70, 100, 20);
        this.add(tfClave);

        // Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
        borde.setTitleColor(Color.gray);
        setBorder(borde);
    }

    // Metodos de acceso a la información de las cajas de texto
    public String getMensaje(){
        return tfMensaje.getText();
    }

    public String getClave() {
        return tfClave.getText();
    }

    // Metodo para borrar cajas de texto
    public void borrar() {
        tfMensaje.setText("");
        tfClave.setText("");
    }
    
}
