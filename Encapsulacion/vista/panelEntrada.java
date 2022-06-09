package vista;

public class panelEntrada 
{
    //------------------------
    //Atributos
    //------------------------
    
    //Identificacion, Nombre, Horastrabajadas.
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JLabel lbNombre;
    private JLabel lbHorasTrabajadas;
    private JLabel lbFechaNacimiento;
    private JLabel lbFechaIngreso;
    private JTextField tfNombre;
    private JTextField tfHorasTrabajadas;
    private JTextField tfFechaNacimiento;
    private JTextField tfFechaIngreso;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public panelEntrada()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adición de etiquetas nombre, horas trabajadas, fecha de nacimiento y fecha de ingreso
        lbNombre = new JLabel("Nombre y apellidos ");
        lbNombre.setBounds(185,20,150,20);
        add(lbNombre);
        
        lbHorasTrabajadas = new JLabel("Horas trabajo ");
        lbHorasTrabajadas.setBounds(215,50,150,20);
        add(lbHorasTrabajadas);
        
        lbFechaNacimiento = new JLabel("Fecha nacimiento ");
        lbFechaNacimiento.setBounds(190,80,150,20);
        add(lbFechaNacimiento);

        lbFechaIngreso = new JLabel("Fecha ingreso ");
        lbFechaIngreso.setBounds(210,110,150,20);
        add(lbFechaIngreso);
        
        
        //Creación y adición de campos de texto
        tfNombre = new JTextField();
        tfNombre.setBounds(300, 20, 100, 20);
        add(tfNombre);
        
        tfHorasTrabajadas = new JTextField();
        tfHorasTrabajadas.setBounds(300, 50, 100, 20);
        add(tfHorasTrabajadas);
        
        tfFechaNacimiento = new JTextField();
        tfFechaNacimiento.setBounds(300, 80, 100, 20);
        add(tfFechaNacimiento);

        tfFechaIngreso = new JTextField();
        tfFechaIngreso.setBounds(300, 110, 100, 20);
        add(tfFechaIngreso);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getNombre()
    {
        return tfNombre.getText();
    }
    
    public String getHorasTrabajadas()
    {
        return tfHorasTrabajadas.getText();
    }
    
    public String getFechaNacimiento()
    {
        return tfFechaNacimiento.getText();
    }

    public String getFechaIngreso()
    {
        return tfFechaIngreso.getText();
    }
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfNombre.setText("");
        tfHorasTrabajadas.setText("");
        tfFechaNacimiento.setText("");
        tfFechaIngreso.setText("");
    }

    public String calcularEdad() {
        return null;
    }

    public String calcularAntiguedad() {
        return null;
    }

    public String calcularSalario() {
        return null;
    }
}
