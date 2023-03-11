
package Class;

import java.util.Scanner;


public class Divisa 
{
    //ATRIBUTOS
     private int monto;
     private int dolar;
     private int euro;
     private int arg;
    
    //METODO CONTRUCTOR

    public Divisa(int monto, int euro, int arg) {
        this.monto = monto;
        this.euro = euro;
        this.arg = arg;
    }


    //GETTERS
    public int getMonto() 
    {
        return monto;
    }

    public int getDolar() {
        return dolar;
    }

    public int getEuro() {
        return euro;
    }

    public int getArg() {
        return arg;
    }
    
    //SETTERS

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setDolar(int dolar) {
        this.dolar = dolar;
    }

    public void setEuro(int euro) {
        this.euro = euro;
    }

    public void setArg(int arg) {
        this.arg = arg;
    }
    
    
    //METODO PARA CONVERTIR
    
    static void convertir(int dolares, String pais){
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad %s", pais);
        int monto = leer.nextInt();
        
        int dolar = monto/dolar;
        int euro = monto/euro;
        int arg = monto/arg; 
        
        System.out.println("Tienes $"+dolar);
        System.out.println("Tienes $"+euro);
        System.out.println("Tienes $"+arg);
                
       
    }
   
    
    
}
 