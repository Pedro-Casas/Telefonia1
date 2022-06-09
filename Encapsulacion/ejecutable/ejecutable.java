package ejecutable;

import javax.xml.transform.Templates;

import controlador.controlador;
import modelo.Telefonia;
import vista.ventanaPrincipal;

public class ejecutable
{
    public static void main(String[] args)
    {
        ventanaPrincipal miVentana = new ventanaPrincipal();
        Telefonia miEmpleados = null;
        controlador miControlador = new Controlador(miVentana, miEmpleados);
    }
    
}
