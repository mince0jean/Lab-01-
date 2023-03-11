
package Class;
import java.util.Scanner;
public class Main 
{
    public static void main(String[]args)
    {
        Divisa metodos = new Divisa();
        //CREAMOS EL OBJETO SCANNER
        //Scanner leer = new Scanner(System.in);
        
        //MENU
        while(true){
            System.out.println("Conversor");
            System.out.println("""
                               1- Pesos chilenos a dolares
                               2- Pesos chilenos a euros
                               3- Pesos chilenos a pesos argentinos
                               4- salir
                               """);
            System.out.print("Ingrese una opcion:");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);
            
     
             switch(opcion){
                case'1' -> metodos.convertir();
                
}
        }
    }
}
            
            
                               
            
        
        

        
        
        


        



