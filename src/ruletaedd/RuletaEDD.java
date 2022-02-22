package ruletaedd;
import java.io.*;

public class RuletaEDD {

    public static void main(String[] args) throws IOException  {
      Boolean bala=false;        
      lista l = new lista();
      leerTXT T = new leerTXT();
      Participante persona1= new Participante();
      
      T.Mostrar();
             
      
      
       bala=persona1.cargar_arma();
       
        leerTXT nom=new leerTXT();
        persona1.Nombre=nom.Dame_nombre();
        System.out.println(bala);
      
      l.VerJugadores();
      
      l.VerJugadores();

    }
}
    
