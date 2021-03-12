package U6_T3;

public class Actividad1 {

    public static void main(String[] args) {

        try {
            Cliente c = new Cliente("Angela Bonilla","12345678Q",17);
        } catch (EdadErroneaException e){
            e.printStackTrace();
        } catch (MenorEdadException em){
            em.printStackTrace();
        }

        try {
            Cliente c1 = new Cliente("Gonzalo Waack","37384728E",22);
        } catch (EdadErroneaException e){
            e.printStackTrace();
        } catch (MenorEdadException em){
            em.printStackTrace();
        }

        try {
            Cliente c2 = new Cliente("Ana Ortega","293890283R",110);
        } catch (EdadErroneaException e){
            e.printStackTrace();
        } catch (MenorEdadException em){
            em.printStackTrace();
        }

        try {
            Cliente c2 = new Cliente("Manuel Velazquez","03944772V",-4);
        } catch (EdadErroneaException e){
            e.printStackTrace();
        } catch (MenorEdadException em){
            em.printStackTrace();
        }


    }
}
