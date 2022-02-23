package ruletaedd;
import java.io.*;
class Nodo {
    Participante participante;
    Nodo siguiente = this;
    
    public Nodo(Participante participante){
        this.participante = participante;     
    }
     class lista{
         Nodo LS;
         lista(){
             LS = null;    
         }
        public void Crear(Participante part){
        if(LS == null){
          LS = new Nodo(part);  
        }else{
            Nodo aux = LS;
            while (aux.siguiente != null)
                aux = aux.siguiente;
            aux.siguiente = new Nodo(part);
            
        }
     }
    
        
    }
     class listaCircular{
         Nodo LS;
         listaCircular(){
             LS = null;    
         }
        public void Crear(Participante part){
        if(LS == null){
          LS = new Nodo(part);
          LS.siguiente = LS;
        }else{
            Nodo aux = LS;
            while (aux.siguiente != LS.siguiente){
               aux = aux.siguiente; }    
            aux.siguiente = new Nodo(part);
            aux.siguiente.siguiente = LS;
            
        }
     }
    
        
    }
    
public class RuletaEDD 
    public static void main(String[] args) throws IOException  {
    
        

    }
  
}

    
