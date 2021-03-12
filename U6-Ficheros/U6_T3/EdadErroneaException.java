package U6_T3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EdadErroneaException extends Exception{
    public EdadErroneaException(String message) {
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
