package ruletaedd;

    public class lista {
     Nodo Primero;
     Nodo Ultimo;
    public lista(){
        Primero=null;
        Ultimo=null;
    }
    
    //Insertar Nuevo Participante

  
 //Recorer y elminar participante
    public void Eliminar(){
        Nodo Puntero=new Nodo(Primero.participante);
        Nodo Anterior=new Nodo(Ultimo.participante);
        do{
            if(Puntero.participante.cargar_arma()){
                if(Puntero==Primero){
                    Primero=Primero.siguiente;
                    Ultimo.siguiente=Primero;
                    }else if(Puntero==Ultimo){
                    Anterior.siguiente=Ultimo.siguiente;
                    Ultimo=Anterior;
                }else {
                    Anterior.siguiente=Puntero.siguiente;
                }
            }
            Anterior=Puntero;
            Puntero=Puntero.siguiente;
        }while(Puntero!=Primero);
       
        
    }
    
    

} 