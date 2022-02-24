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
     
     public void disparaMulti() {
        Nodo aux = this.primero;
        String[] bDatoboo = this.checkBala.split(" ");
        boolean controlB = true;
        
        for (String bDato : bDatoboo) {
            
         if (this.jugadoresNum> 0) {
           if (bDato.equals("V")) {
           aux.siguiente = aux.siguiente.siguiente;
           this.jugadoresNum--;
           controlB = false;
          } else {
            aux = aux.siguiente;
            controlB = true;
                }
            } else {
                this.primero = null;
                this.jugadoresNum--;
            }
        }
      
        if (controlB) {
            this.primero = aux;
        } else {
            this.primero = aux.siguiente;
        }
        this.checkBala = "";
    }
     
     public void registroBalas(boolean IED) {
        Nodo aux = this.primero;
        String str;
        str = aux.revolver.verificacionBala();
        if (IED) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("");
                System.out.println(":: Error Interno...");
            }
        }
        System.out.println("");
        if (str.equals("V")) {//Si str (aux.revolver.verificacionBala())es verdadero, entonces:
            this.jugadoresElim += aux.siguiente.participante.nombre+" "+ aux.siguiente.participante.apellido+" "+ aux.siguiente.participante.cedula + "\n";
            System.out.println(": "+aux.participante.nombre+" mató a "+aux.siguiente.participante.nombre);
        } else {
            System.out.println(": "+aux.participante.nombre + " falló ");
        }
        this.checkBala += str;
       
        while (aux.siguiente != this.primero) {
            aux = aux.siguiente;
            str = aux.revolver.verificacionBala();
            if (IED) {
                try {
              Thread.sleep(2000);
              } catch (InterruptedException e) {
              System.out.println("");
              System.out.println("Error...");
                }
            }
            if (str.equals("V")) {//Se repite la comprobación de si str (aux.revolver.verificacionBala())es verdadero, pero para los participantes diferentes a inicio.
                this.jugadoresElim += aux.siguiente.participante.nombre + " "+aux.siguiente.participante.apellido+" "+aux.siguiente.participante.cedula + "\n";
                System.out.println(": " + aux.participante.nombre+" mató a "+ aux.siguiente.participante.nombre);
            } else {
                System.out.println(": " + aux.participante.nombre + " falló ");
            }this.checkBala += " " + str;
        }
    }
     
     public void ComprovaciónTiro() {
        System.out.println(" ");
        System.out.println(" El jugador "+ this.primero.participante.nombre+" "+ this.primero.participante.apellido + " Le dipsaró a el jugador " + this.primero.siguiente.participante.nombre
                + " " + this.primero.siguiente.participante.apellido + ".");
        if (this.primero.revolver.disparar()) { 
            this.jugadoresElim +=this.primero.siguiente.participante.nombre+" "+ this.primero.siguiente.participante.apellido + " "+this.primero.siguiente.participante.cedula + "\n";
            System.out.println(": " + this.primero.participante.nombre+" Mató a " + this.primero.siguiente.participante.nombre+".");
            System.out.println(": El jugador " + this.primero.participante.nombre+" recargó el arma.");
            this.primero.siguiente = this.primero.siguiente.siguiente;
            this.jugadoresNum--;
        } else {
            System.out.println(":: " + this.primero.participante.nombre + " falló.");
        }
        this.primero = this.primero.siguiente;

    }
         public void verLista() {
        Nodo aux = this.primero;
        if (this.jugadoresNum==0) {
                System.out.println("  ");
                System.out.println("Todos los participantes murieron");
                this.ganador = ": Todos los participantes murieron\n";
        }else if(jugadoresNum==1){
                System.out.println("  ");
                System.out.println(" El jugador " + aux.participante.nombre + " " + aux.participante.apellido + " " +aux.participante.cedula+ " ganó");
                this.ganador = aux.participante.nombre + " " + aux.participante.apellido + " " + aux.participante.cedula + "\n";
        }else{
                System.out.println(aux.participante.nombre + " " + aux.participante.apellido);
                while (aux.siguiente != this.primero) {
                    aux = aux.siguiente;
                    System.out.println(aux.participante.nombre + " " + aux.participante.apellido );
                }
        }
        }
    }

public class RuletaEDD {
        
        static Scanner entrada = new Scanner(System.in);
        
    public static void main(String[] args) throws IOException{
            String conf = "";
            System.out.println(" Ruleta Rusa:");
            System.out.println("Presione 1 para empezar la ruleta:");
            conf = entrada.nextLine();
            
            switch (conf) {
                case "1":
                   
                    Play();
                    break;

                case "00":
                    break;
                default:
                    System.out.println("");
                    System.out.println(":: La Opción Seleccionada es Inválida.");
                    break;
            }
    }
    
        private static void Play() throws IOException {
            int NJ = 0;
            System.out.println("");
            jugadoresLista L;
            L = new jugadoresLista(leerTXT.leerArchivo("jugadores.txt"));

            System.out.println("");
            System.out.println(" Los Jugadores son los siguientes: ");
            mostrar();
            L.verLista();

                System.out.println("");
                System.out.println(" Pulse la tecla Enter para continuar ");
                entrada.nextLine();
                while (L.jugadoresNum > 1) {
                    NJ++;
                    System.out.println(" Empieza la ronda numero " + NJ + ") ");
                    L.registroBalas(true);
                    L.disparaMulti();
                    if (L.jugadoresNum > 1) {
                        System.out.println("  ");
                        System.out.println(" Participantes Vivos: ");
                        L.verLista();
                    }
                    System.out.println(" Pulse la tecla Enter para salir ");
                    entrada.nextLine();
                }
            L.verLista();
 
            leerTXT.escribirArchivo("Derrotados.out", L.jugadoresElim, "Los derrotadosson:");
            leerTXT.escribirArchivo("ganador.out", L.ganador, "El Ganador de la partid " + NJ +" es:");
        }
        private static void mostrar() throws IOException {
        String participantes;
        participantes = leerTXT.leerArchivo("jugadores.txt");
        
        System.out.println("");
        String[] listaParticipante = participantes.split(" ");
        System.out.println(listaParticipante[0]); 
        
        for (int i = 1; i < listaParticipante.length; i++) {
           
            System.out.println(listaParticipante[i]);

        }
        
    }

  
       

}


