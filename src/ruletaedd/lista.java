package ruletaedd;

import java.util.Scanner;
    public class lista {
 
    Scanner Teclado = new Scanner(System.in);
    Nodo Cabeza;
    Nodo Ultimo;
    
    public lista (){
        Cabeza = null;
        Ultimo = null;    
    }
    
        public void VerJugadores(){
            Nodo Actual = new Nodo();
            Actual = Cabeza;
            if(Cabeza != null){
                do {
                    System.out.println(Actual.dato);
                    Actual = Actual.siguiente;
                } while (Actual != Cabeza);  
            } else{
        System.out.println(" Lista de Jugadores vacia ");  
            }
        }
    }