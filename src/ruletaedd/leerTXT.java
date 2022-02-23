package ruletaedd;
import java.io.*;

public class leerTXT {
    
    class Nodo{
        String Nombre;
        String Apellido;
        String Cedula;
        
        Nodo siguiente;
        
        Nodo(String Nom, String Ape, String CI){
            
            this.Nombre = Nom;
            this.Apellido = Ape;
            this.Cedula = CI;
            
            this.siguiente = null;
        }
    }
    
    Nodo inicio;
    
    FileReader lectura;
    leerTXT() throws FileNotFoundException, IOException{
        
         lectura =new FileReader("jugadores.txt");
         BufferedReader obj = new BufferedReader(lectura);
         String str;
         String[] array = new String[3];
        
        this.inicio = new Nodo(" ", " "," "); //no por que se imprime
        Nodo aux = this.inicio;
        
        while ((str = obj.readLine())!= null) {
            
            array = str.split(" ");
            aux.siguiente = new Nodo(array[0], array[1], array[2]);
            
            aux = aux.siguiente;
        }
        
        aux.siguiente = new Nodo(array[0], array[1], array[2]);
        
        aux.siguiente.siguiente = this.inicio;
    }
   void llenar (){
       
       
}
    void Mostrar(){
    
        if(inicio!=null){
  
            Nodo aux= inicio;
            while(aux.siguiente!=inicio){
                
                System.out.println("Nombre: "+aux.Nombre);
                System.out.println("Apellido: "+aux.Apellido);
                System.out.println("Cedula: "+aux.Cedula);
                System.out.println();
                
                aux=aux.siguiente;
            }
            
        }
    }
     public String Dame_nombre(){
     
         return "aux.nombre";
     }
     
}

