package vista;

import javax.swing.JFrame;

public class ventanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
    public panelEntradaDatos miPanelEntradaDatos;
    public panelOperaciones miPanelOperaciones;
    public panelResultador miPanelResultado;
    public Object miDialogoMoverCarro;

    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public ventanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
        
        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new panelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,420,190);
        add(miPanelEntradaDatos);
       
        
        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new panelOperaciones();
        miPanelOperaciones.setBounds(10,220,420,60);
        add(miPanelOperaciones);
        
        //Creación y adición del PanelOperaciones
        miPanelResultado = new panelResultador();
        miPanelResultado.setBounds(10,290,420,250);
        add(miPanelResultado);
        
        //Caracteristicas de la ventana
        setTitle("Empresa X");
        setSize(450,550);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public void crearDialogoMover() {
    }
}