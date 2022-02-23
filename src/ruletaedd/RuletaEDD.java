package ruletaedd;
import java.io.*;
class Nodo {
    String nombre, apellido, cedula;
    Nodo siguiente = this;
    
    public Nodo(String nom,String ape,String ced){
        this.nombre=nom;
        this.apellido=ape;
        this.cedula=ced;  
    }
     class lista{
         Nodo LS;
         lista(){
             LS = null;    
         }
        public void Crear(String nom,String ape,String ced){
        if(LS == null){
          LS = new Nodo(nom,ape,ced);  
        }else{
            Nodo aux = LS;
            while (aux.siguiente != null)
                aux = aux.siguiente;
            aux.siguiente = new Nodo(nom,ape,ced);
            
        }
     }
        
    }
     class listaCircular{
         Nodo LS;
         listaCircular(){
             LS = null;    
         }
        public void Crear(String nom,String ape,String ced){
        if(LS == null){
          LS = new Nodo(nom,ape,ced);
          LS.siguiente = LS;
        }else{
            Nodo aux = LS;
            while (aux.siguiente != LS.siguiente){
               aux = aux.siguiente; }    
            aux.siguiente = new Nodo(nom,ape,ced);
            aux.siguiente.siguiente = LS;
            
        }
     }
    
        
    }
    
public class RuletaEDD 
    public static void main(String[] args) throws IOException  {
    
        

    }
  
}

    
