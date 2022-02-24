package ruletaedd;
import java.io.*;

 class leerTXT {
    
     static String leerArchivo(String ruta) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(ruta)); //leer jugadores.txt

        String linea;
        linea = br.readLine();
        String datos = linea;
        
        while ((linea = br.readLine()) != null) {
            datos += "\n" + linea;
        }
        return datos;
    }
        
    static void escribirArchivo(String ruta, String msg, String Dato) throws IOException {
        //Objeto de la Clase FileWriter que permitirÃ¡ ubicar el archivo.
        FileWriter archivo = new FileWriter(ruta, true);
        
        //Objeto de la Clase PrintWriter que permitirÃ¡ escribir Dato y msg en el archivo.
        try (PrintWriter pw = new PrintWriter(archivo)) {
            pw.println(Dato);
            pw.println(msg);
            pw.close(); //Cerrar el archivo.
        }
    }
}

