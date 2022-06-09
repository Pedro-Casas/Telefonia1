//generar un programa para gestionar un plan de telefonia celular, el plan tiene un numeor de celular, un operador, cantidad de minutos y costo por minuto, calcular el total a pagar teniendo en cuenta que si e operador Movilujo tiene un 50% de descuento. USar minimo 3 constructores

public class Telefonia
{
    //--------------
    //Atributos
    //--------------
    private long numeroCelular;
    private int cantidadMinutos;
    private double costoXMinutos;
    private String operador;

    //--------------
    //Metodos
    //--------------

    //Constructor por defecto
    public Telefonia()
    {
        numeroCelular=0;
        cantidadMinutos=0;
        costoXMinutos=0;
        operador= "";
    }

    //Contructor Común u Ordinario 
    public Telefonia( int num, int min, int precio, String opera)
    {
        this.numeroCelular = num;
        this.cantidadMinutos = min;
        this.costoXMinutos= precio;
        this.operador= opera;
    }

    //Constructor de copia
    public Telefonia(Telefonia f)
    {
        numeroCelular = f.numeroCelular;
        cantidadMinutos = f.cantidadMinutos;
        costoXMinutos = f.costoXMinutos;
        operador = f.operador;
    }

    // Metodos de acceso
    public long getNumeroCelular()
    {
        return numeroCelular;
    }
    public void setNumeroCelular(int numeroCelular)
    {
        this.numeroCelular= numeroCelular;
    }
    public int getCantidadMinutos()
    {
        return cantidadMinutos;
    }
    public void setCantidadMinutos(int cantidadMinutos)
    {
        this.cantidadMinutos= cantidadMinutos;
    }
    public double getCostoMinutos()
    {
        return costoXMinutos;
    }
    public void setCostoMinuto(int costoMinutos)
    {
        this.costoXMinutos= costoMinutos;
    }
    public String getOperador()
    {
        return operador;
    }
    public void setOperador(String operador)
    {
        this.operador= operador;
    }
    public String toString()
    {
        return numeroCelular +" total a pagar:" +  calcularPlan(); 
    }

    //saber el costo del plan
    public Double calcularPlan()
    {
        
        double x= costoXMinutos*cantidadMinutos;
        if (operador.equals("movilujo"))
        {
          x = x - x*0.5;
        }
        return x;

    }

    // metodo ejecutable 

    public static void main (String[] args)
    {
        Telefonia f1 = new Telefonia(315238657, 0, 50, "Mosvil");
        System.out.println("telefono 1: " + f1);
        Telefonia f2 = new Telefonia(315238657, 300, 50, "movilujo");
        System.out.println("telefono 2: " + f2);
    }

}

