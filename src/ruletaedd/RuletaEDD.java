package ruletaedd;
import java.io.*;
class Nodo {
    Participante participante;
    Nodo siguiente = this;
    
    public Nodo(Participante participante){
        this.participante = participante;     
    }
     class lista{
         Nodo LC;
         lista(){
             LC = null;    
         }
        public void Crear(Participante part){
        if(LC == null){
          LC = new Nodo(part);  
        }else{
            Nodo aux = LC;
            while (aux.siguiente != null)
                aux = aux.siguiente;
            aux.siguiente = new Nodo(part);
            
        }
     }
    
        
    }
    
public class RuletaEDD 
    public static void main(String[] args) throws IOException  {
    
        

    }
  
}

    
