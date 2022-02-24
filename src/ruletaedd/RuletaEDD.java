package ruletaedd;
import java.io.*;
import java.util.Scanner;


class jugadoresLista {
    Nodo primero;
    String jugadoresElim;
    String ganador;
    String checkBala;
    int jugadoresNum;
    
        jugadoresLista(String dato) {
        this.jugadoresElim = "";
        this.ganador = "";
        this.checkBala = "";
        this.jugadoresNum= 0;
        String[] jugadores = dato.split("\n");
        String[] jData;
        for (String participante : jugadores) {
           jData = participante.split(" ");
           Crear(new Nodo(new Participante(jData[0], jData[1], jData[2])));
           this.jugadoresNum++;
        }
    }
    class Nodo {
        Participante participante;
        arma revolver;
        Nodo siguiente;
    
    public Nodo(Participante participante){
        this.participante= participante;
        this.siguiente=null;
        this.revolver = new arma();
       }
}
    class Participante {
        String nombre;
        String apellido;
        String cedula;
        
        Participante(String nombre, String apellido, String cedula) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.cedula = cedula;
        }
    }
    public void Crear(Nodo part){
        if(this.primero == null){
          this.primero = part;
          this.primero.siguiente = part;
        }else{
            Nodo aux = this.primero;
            while (aux.siguiente != this.primero){
               aux = aux.siguiente; }    
            aux.siguiente = part;
            part.siguiente = this.primero;
            
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
        public String verificacionBala() {
        if (disparar()) {
            return "V";
        } else {
            return "F";
        }
    }
     }   
     public void ComprovacionTiro() {
        System.out.println(" ");
        System.out.println( this.primero.participante.nombre+" "+ this.primero.participante.apellido + " Le dipsaró a: " + this.primero.siguiente.participante.nombre
                + " " + this.primero.siguiente.participante.apellido + ".");
        if (this.primero.revolver.disparar()) { 
            this.jugadoresElim +=this.primero.siguiente.participante.nombre+" "+ this.primero.siguiente.participante.apellido + " "+this.primero.siguiente.participante.cedula + "\n";
            System.out.println(": " + this.primero.participante.nombre+" Mató a " + this.primero.siguiente.participante.nombre+".");
            System.out.println(": " + this.primero.participante.nombre+" recarga su arma.");
            this.primero.siguiente = this.primero.siguiente.siguiente;
            this.jugadoresNum--;
        } else {
            System.out.println(":: " + this.primero.participante.nombre + " falló.");
        }
        this.primero = this.primero.siguiente;

    }
     
   
  
 public class RuletaEDD {
        
    public static void main(String[] args) throws IOException{
     
        
    }       
}

