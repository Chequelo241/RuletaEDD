package ruletaedd;
import java.io.*;

 class leerTXT {
    
     static String leerArchivo(String ruta) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(ruta)); //leer jugadores.txt

        String linea;
        linea = br.readLine();
        String datos = linea;
        
        while ((linea = br.readLine()) != null) {
            datos += " " + linea;
        }
        return datos;
    }
        
    static void escribirArchivo(String Direcc, String msg, String Dato) throws IOException {
        //Objeto para ubicar el archivo.
        FileWriter archivo = new FileWriter(Direcc, true);
        
        try (PrintWriter pw = new PrintWriter(archivo)) {
            pw.println(Dato);
            pw.println(msg);
            pw.close(); //Cerrar el archivo.
        }
    }
}

