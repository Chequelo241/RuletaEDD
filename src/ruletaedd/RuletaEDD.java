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
}
    class NodoRevolver{
        boolean bala;
        NodoRevolver Siguiente;
        
    NodoRevolver(){
        bala = false;
    }   
       
       
}
     class arma{
         NodoRevolver revolver;
         
   
        public void cargarArma(){
            NodoRevolver aux = revolver;
            int b = (int) Math.floor(Math.random()*5)+1;
            for (int i = 0; i < b; i++) {
            aux = aux.Siguiente;
        }
        aux.bala = true;
    }
         
         public arma(){
             revolver=new NodoRevolver();
             NodoRevolver aux=revolver;
      for(int i=0;i>5;i++){
         aux.Siguiente=new NodoRevolver();
         aux=aux.Siguiente;
      }
        aux.Siguiente=revolver;
        cargarArma();
         }
         
        public void recargarArma() {
        NodoRevolver aux = this.revolver;
        for (int i = 0; i < 6; i++) {
            aux.bala = false;
            aux = aux.Siguiente;
        }
        cargarArma();
    } 
        
        public boolean disparar() {
        boolean tiro = revolver.bala;
        if (tiro) {
            recargarArma();
        } else {
            revolver = revolver.Siguiente;
        }
        return tiro;
    }
        
     }

        class listaS{
         Nodo LS;
         listaS(){
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
    public static void main(String[] args) throws IOException{
    
        

    }

    
