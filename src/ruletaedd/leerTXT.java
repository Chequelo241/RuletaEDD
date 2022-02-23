package ruletaedd;
import java.io.*;

public class leerTXT {
    
    class Nodo{
        private String nombre;
        private String apellido;
        private String cedula;
        Nodo siguiente;
        
        Nodo(String nombre, String apellido, String CI){
            
            this.nombre = nombre;
            this.apellido = apellido;
            this.cedula = CI;
            
            this.siguiente = null;
        }
    }
    
    Nodo inicio;
    
    leerTXT() throws FileNotFoundException, IOException{

         BufferedReader obj = new BufferedReader(new FileReader("jugadores.txt"));
         String str;
         String[] array = new String[3];
        int count=0;
        this.inicio = new Nodo("", " ","");
        Nodo aux = this.inicio;
        
        while ((str = obj.readLine())!= null) {
            
            array = str.split(" ");
            aux.siguiente = new Nodo(array[0], array[1], array[2]);
            
            aux = aux.siguiente;
            count++;
        }
        
        aux.siguiente = new Nodo(array[0], array[1], array[2]);
        
        aux.siguiente.siguiente = this.inicio;
              

    }
    public String getnombre(int i){
        for( i=0;i<=6;i++){
          inicio.nombre=inicio.siguiente.nombre;
          return inicio.nombre;
        }         
    }
    public String getapellido(){
        return inicio.siguiente.apellido;
    }
    public String getcedula(){
        return inicio.siguiente.cedula;
    }
    
   /* public String Mostrar(){
    
        if(inicio!=null){

            Nodo aux= inicio;
            while(aux.siguiente!=inicio){
                
                return aux.nombre;
                return aux.apellido;
                return aux.cedula;
                
                aux=aux.siguiente;
            }

        }*/
    }

