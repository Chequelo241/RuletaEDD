package ruletaedd;

    public class lista {
     Nodo Ultimo;
    public lista(){
        Ultimo=null;
    }
    
    //Insertar Nuevo Participante
    public lista Insertar(Participante participante){
   Nodo Nuevo=new Nodo(participante);
   if (Ultimo!=null){
        Nuevo.siguiente=Ultimo.siguiente;
        Ultimo.siguiente=Nuevo;
    }
    Ultimo=Nuevo;
    return this;
  }
 

} 