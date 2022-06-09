package controlador;

import vista.ventanaPrincipal;
import modelo.Telefonia;

public class controlador 
{
    //----------------------------
    //Atributos
    //----------------------------
    private ventanaPrincipal venPrin;
    private Telefonia model;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public controlador(ventanaPrincipal pVenPrin, Telefonia pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
        if(comando.equals("PAGAR"))
        {   
            //Validar datos entrada
            try
            {
                String nombre = venPrin.miPanelEntradaDatos.getNombre();
                int horasTrabajadas = Integer.parseInt(venPrin.miPanelEntradaDatos.getHorasTrabajadas());
                int fechaNacimiento = Integer.parseInt(venPrin.miPanelEntradaDatos.calcularEdad());
                int fechaIngreso = Integer.parseInt(venPrin.miPanelEntradaDatos.calcularAntiguedad());
                int salario = Integer.parseInt(venPrin.miPanelEntradaDatos.calcularSalario());
            
                //Creación del objeto tipo Empleados
                model = new Telefonia(operador);
                
                venPrin.miPanelResultado.mostrarResultado("El nombre del empleado es: " + model.getOperador());
                
                //Activar botones
                venPrin.miPanelOperaciones.activarBotones();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }
    } 
}
