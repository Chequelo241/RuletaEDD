
package ruletaedd;

public class Participante {
     
    String Nombre;
    Boolean [] Arma= new Boolean[5];
    Boolean Vida; 

    public Participante(){
        
      Arma[0]=false; 
      Arma[1]=false;
      Arma[2]=false;
      Arma[3]=false;
      Arma[4]=false;
      Arma[5]=false;
      
      Vida=true; 
    }
            

public Boolean cargar_arma(int ronda){
     
      int puesto=(int) Math.round(Math.random()*5);
     
      Arma[puesto]= true;
      
      return Arma[ronda];

}
}
