
package ruletaedd;

public class Participante {
     
    private String Nombre;
    private String Apellido;
    private String Cedula;
    private int NumJugador;
    private Boolean [] Arma= new Boolean[5]; 

    public Participante(){
        for (int i=0; i<5;i++){
             Arma[i]=false; 
        }
    }
public String getnombre(String nom){
    Nombre=nom;
    return Nombre;
}
public void getapellido(String ape){
    Apellido=ape;
}
public void getcedula(String ced){
    Cedula=ced;
}
public void getnumeroj(int nj){
    NumJugador=nj;
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
