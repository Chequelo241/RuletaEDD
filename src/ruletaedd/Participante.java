
package ruletaedd;

public class Participante {
     
    String Nombre;
    String Apellido;
    String Genero;
    Boolean [] Arma= new Boolean[5]; 

    public Participante(){
        for (int i=0; i<5;i++){
             Arma[i]=false; 
        }
    }
         

public Boolean cargar_arma(){
    
        int Rn=(int) Math.round(Math.random()*5);
        for (int i=0; i<=Rn ;i++){  
          if (i==Rn){
            Arma[i]=true;   
        }
        
     }       
        
    return Arma[0];
}

}
