package U6_T3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MenorEdadException extends Exception{
    public MenorEdadException(String message) {
        super(message);
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter("./src/U6_T3/actividad2.log",true));
            out.write(this.getMessage());
            out.newLine();
            out.flush();
            out.close();
        } catch (IOException ei){
            ei.printStackTrace();
        }
    }
}
