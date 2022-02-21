package ruletaedd;
import java.io.*;

public class leerTXT {
    
    class Nodo{
        String nombre;
        String apellido;
        String genero;
        
        Nodo siguiente;
        Nodo anterior;
        
        Nodo(String nombre, String apellido, String genero){
            
            this.nombre = nombre;
            this.apellido = apellido;
            this.genero = genero;
            
            this.siguiente = null;
            this.anterior = null;
        }
    }
    
    Nodo inicio;
    
    leerTXT() throws FileNotFoundException, IOException{

         BufferedReader obj = new BufferedReader(new FileReader("src/ruletaedd/jugadores.txt"));
         String str;
         String[] array = new String[3];
        
        this.inicio = new Nodo("AAAAAAAAA", "BBBBBBBBBB","33333333");
        Nodo aux = this.inicio;
        
        while ((str = obj.readLine())!= null) {
            
            array = str.split(" ");
            aux.siguiente = new Nodo(array[0], array[1], array[2]);
            aux.siguiente.anterior = aux;
            aux = aux.siguiente;
        }
        
        aux.siguiente = new Nodo(array[0], array[1], array[2]);
        aux.siguiente.anterior = aux;
        this.inicio.anterior = aux.siguiente;
        aux.siguiente.siguiente = this.inicio;
    }
    void Mostrar(){
    
        if(inicio!=null){
        
            Nodo aux= inicio;
            
            while(aux.siguiente!=inicio){
                
                System.out.println(aux.nombre);
                System.out.println();
                System.out.println(aux.apellido);
                System.out.println();
                System.out.println(aux.genero);
                System.out.println();
                aux=aux.siguiente;
            }
            
        }
    }
}
