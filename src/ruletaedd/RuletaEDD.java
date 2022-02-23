package ruletaedd;
import java.io.*;

public class RuletaEDD {

    public static void main(String[] args) throws IOException  {
      Boolean bala=false;
      Participante persona1= new Participante();
      
      leerTXT T = new leerTXT();
      
      T.Mostrar();
      persona1.cargar_arma();
       
       leerTXT nom=new leerTXT();
       persona1.Nombre=nom.Dame_nombre();
       System.out.println(bala);
      

    }
}
    
