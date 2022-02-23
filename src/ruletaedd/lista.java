package ruletaedd;

    public class lista {
     Nodo Primero;
     Nodo Ultimo;
    public lista(){
        Primero=null;
        Ultimo=null;
    }
    
    //Insertar Nuevo Participante
    public void Insertar(Participante participante){
   Nodo Nuevo=new Nodo(participante);
   if (Primero!=null){
        Ultimo.siguiente=Nuevo;
        Nuevo.siguiente=Primero;
        Ultimo=Nuevo;
    }else{
        Nuevo=Primero;
        Ultimo=Primero;
        Primero.siguiente= Ultimo;
   }
  }
 //Eliminar Participante
    

} 