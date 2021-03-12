import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class escribir_fichero {
    public static void main(String[] args) throws IOException {

        try {
            FileWriter out = new FileWriter("./src/nuevoejemplo.txt", true);  // true = machacar lo que ya tenias
            BufferedWriter bw = new BufferedWriter(out);

            bw.write(97);
            bw.newLine();
            bw.write("DIOS");

            bw.flush();  // para guardar los cambios que hemos hecho anteriormente en el fichero

            } catch(IOException e){
                e.printStackTrace();
            }
    }
}
