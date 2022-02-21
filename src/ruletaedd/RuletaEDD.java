package ruletaedd;
import java.io.*;

public class RuletaEDD {

    public static void main(String[] args) throws IOException  {
               
      lista l = new lista();
      leerTXT T = new leerTXT();
      
      T.Mostrar();
              
      l.VerJugadores();
      
      l.InsertarJugadores();
      l.InsertarJugadores();
      l.InsertarJugadores();
      l.InsertarJugadores();
      
      //l.BuscarJugadores();
      
      //l.VerJugadores();
      
      //l.ModificarJugadores();
      
      //l.VerJugadores();
      
      l.ElimnarJugadores();
      
      l.VerJugadores();

    }
}
    
