package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import controlador.controlador;

public class panelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton btCalcularSalario;
    public JButton btCalcularEdad;
    public JButton btCalcularAntiguedad;
    public JButton btBorrar;
    public JButton btSalir;
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public panelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de los botones
        btCalcularSalario = new JButton("PAGAR");
        btCalcularSalario.setFont(new Font("Arial", BOLD, 10));
        btCalcularSalario.setBounds(5,15,80,40);
        add(btCalcularSalario);
        btCalcularSalario.setActionCommand("PAGAR");
        
        btCalcularEdad = new JButton("BORRAR");
        btCalcularEdad.setFont(new Font("Arial", BOLD, 10));
        btCalcularEdad.setBounds(83,15,80,40);
        add(btCalcularEdad);
        btCalcularEdad.setActionCommand("BORRAR");
        
        btCalcularAntiguedad = new JButton("SALIR");
        btCalcularAntiguedad.setFont(new Font("Arial", BOLD, 10));
        btCalcularAntiguedad.setBounds(161,15,110,40);
        add(btCalcularAntiguedad);
        btCalcularAntiguedad.setActionCommand("SALIR");
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

    public void agregarOyentesBotones(controlador controlador)
    {
        btCalcularSalario.addActionListener(controlador);
        btCalcularEdad.addActionListener(controlador);
        btCalcularAntiguedad.addActionListener(controlador);
        btBorrar.addActionListener(controlador);
        btSalir.addActionListener(controlador);
    }
    
    public void activarBotones()
    {
        btCalcularSalario.setEnabled(true);
        btCalcularEdad.setEnabled(true);
        btCalcularAntiguedad.setEnabled(true);
        btBorrar.setEnabled(true);
        btSalir.setEnabled(true);
    }
}