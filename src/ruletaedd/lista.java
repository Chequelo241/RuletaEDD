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
    
    public void InsertarJugadores () {
        Nodo nuevo = new Nodo ();
        System.out.print( " Ingrese numero del jugador ");
        nuevo.dato = Teclado.next();
        
        if(Cabeza == null){
            Cabeza = nuevo;
            Ultimo = nuevo;
            Cabeza.siguiente = Cabeza;
        }   else {
            Ultimo.siguiente = nuevo;
            nuevo.siguiente = Cabeza;
            Ultimo = nuevo;   
        }
        System.out.println(" Jugador ingresado con exito");
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
        
        public void BuscarJugadores(){
        Nodo Actual = new Nodo();
        Actual = Cabeza;
        boolean Encontrado = false;
        
        System.out.print(" Ingrese el dato del Nodo a busar: ");
        String nodoBuscado = Teclado.next();
            if(Cabeza != null){
                do {
                    if(Actual.dato.equals(nodoBuscado)){
                        System.out.println(" Jugador con el dato(" + nodoBuscado + ") fue encontrado");
                         Encontrado = true;    
                    }
                    Actual = Actual.siguiente;
                } while (Actual != Cabeza && Encontrado != true); 
                
                if(!Encontrado){
                    System.out.println("Jugador no encontrado");
                }
            } else{
        System.out.println(" Lista vacia ");  
            }    
            
        }
        
        public void ModificarJugadores(){
         Nodo Actual = new Nodo();
        Actual = Cabeza;
        boolean Encontrado = false;
        
        System.out.print(" Ingrese el dato del Nodo a busar para modificar: ");
        String nodoBuscado = Teclado.next();
            if(Cabeza != null){
                do {
                    if(Actual.dato.equals(nodoBuscado)){
                        System.out.println(" Jugador con el dato(" + nodoBuscado + ") fue encontrado");
                        System.out.println("Ingresa un dato para modificarlo");
                        Actual.dato = Teclado.next();
                        System.out.println("Dato modificado con exito");
                        
                         Encontrado = true;    
                    }
                    Actual = Actual.siguiente;
                } while (Actual != Cabeza && Encontrado != true); 
                
                if(!Encontrado){
                    System.out.println("Jugador no encontrado");
                }
            } else{
        System.out.println(" Lista vacia ");  
            }       
        }
        
        public void ElimnarJugadores(){
        Nodo Actual = new Nodo();
        Actual = Cabeza;
        Nodo Anterior = new Nodo();
        Anterior = null;
        boolean Encontrado = false;
        
        System.out.print(" Ingrese el dato del Nodo a busar para eliminar : ");
        String nodoBuscado = Teclado.next();
            if(Cabeza != null){
                do {
                    if(Actual.dato.equals(nodoBuscado)){
                        System.out.println(" Jugador con el dato(" + nodoBuscado + ") fue encontrado");
                        
                        if(Actual == Cabeza){
                            Cabeza = Cabeza.siguiente;
                            Ultimo.siguiente = Cabeza;  
                        } else if(Actual == Ultimo){
                           Anterior.siguiente = Cabeza;
                           Ultimo = Anterior;   
                        } else {
                            Anterior.siguiente = Actual.siguiente;
                        }
                        System.out.println(" Jugador eliminado ");
                         Encontrado = true;    
                    }
                    Anterior = Actual;
                    Actual = Actual.siguiente;
                } while (Actual != Cabeza && Encontrado != true); 
                
                if(!Encontrado){
                    System.out.println("Jugador no encontrado");
                }
            } else{
        System.out.println(" Lista vacia ");  
            }        
        }
        
       
    }