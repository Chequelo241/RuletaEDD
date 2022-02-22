package ruletaedd;
import java.io.*;

public class RuletaEDD {

    public static void main(String[] args) throws IOException  {
      Boolean bala=false;        
      lista l = new lista();
      leerTXT T = new leerTXT();
      Participante persona1= new Participante();
      
      T.Mostrar();
             
      
      
      for(int i=0;i<5;i++){
        if(persona1.cargar_arma()==true){
            bala=true;    
        } 
      }
        leerTXT nom=new leerTXT();
        persona1.Nombre=nom.Dame_nombre();
        System.out.println(persona1.Nombre+" "+bala);
      
      
      l.VerJugadores();
      
      l.VerJugadores();

    }
}
    
