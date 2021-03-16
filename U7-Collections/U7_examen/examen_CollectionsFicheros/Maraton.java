import javax.accessibility.AccessibleText;
import java.io.*;
import java.util.*;

public class Maraton {
    private int dorsal;
    private Map<Integer,Atleta> lista_atletas;

    public Maraton() {
        this.dorsal=0;
        this.lista_atletas = new LinkedHashMap<Integer,Atleta>();
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Map<Integer, Atleta> getLista_atletas() {
        return lista_atletas;
    }

    public void setLista_atletas(Map<Integer, Atleta> lista_atletas) {
        this.lista_atletas = lista_atletas;
    }

    public void inscribirAtleta(){
        Scanner sc = new Scanner(System.in);

        this.dorsal++;

        System.out.println("Introduce el nombre del atleta");
        String nombre = sc.nextLine();
        System.out.println("Introduce el pais del atleta");
        String pais = sc.nextLine();
        System.out.println("Introduce la categoria del atleta");
        String categoria = sc.nextLine();


        System.out.println("¿Ha terminado el atleta el maraton?");
        String respuesta = sc.nextLine();

        Atleta a;

        if (respuesta.equalsIgnoreCase("si")){
            sc.nextLine();
            System.out.println("Introduce la marca");
            int marca = sc.nextInt();

            a = new Atleta(nombre,pais,marca,categoria);
            lista_atletas.put(dorsal,a);
        } else {
           a = new Atleta(nombre,pais,categoria);
            lista_atletas.put(dorsal,a);
        }
    }

    public void cargarAtletas(){
        try{
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream("./src/maraton.dat"));

            while (true){
                Atleta a1 = (Atleta) leer.readObject();
                inscribirAtleta();
            }

        } catch (IOException | ClassNotFoundException e){
            System.out.println("Atletas cargados");
        }
    }

    public void guardarAtletas(){
        try{
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("./src/maraton.dat"));
            Collection<Atleta> aux = lista_atletas.values();

            Iterator it = aux.iterator();
            while (it.hasNext()){
                Collection<Atleta> aux2 = (Collection<Atleta>) it.next();
                escribir.writeObject(aux2);
            }

            escribir.close();

        } catch (IOException e){
            System.out.println("Atletas guardados");
        }
    }

    public void guardarTiempo(int dorsal,int tiempo){
        List<Atleta> aux = new ArrayList<Atleta>(lista_atletas.values());
        Atleta a = new Atleta("","","");

        if (lista_atletas.containsKey(dorsal)){
            for (int i = 0; i < aux.size(); i++) {
                lista_atletas.get(aux.get(i).getMarca());
            }
            a.setMarca(tiempo);
            a.setFinisher(true);
        }

    }


    public void borrarAtleta(int dorsal){
        if (lista_atletas.containsKey(dorsal)){
            lista_atletas.remove(dorsal);
        }
    }


    public void mostrarListaFinishers(){
        List<Atleta> aux = new ArrayList<Atleta>(lista_atletas.values());

        for (int i = 0; i < aux.size(); i++) {
            if (aux.get(i).isFinisher()){
                aux.sort((o1, o2) -> o1.getMarca()-o2.getMarca());
            }
        }
        System.out.println(aux);
    }

    public void mostrarListaCategoria(String categoria){
        List<Atleta> aux = new ArrayList<Atleta>(lista_atletas.values());
        for (int i = 0; i < aux.size(); i++) {
            if (aux.get(i).getCategoria().equalsIgnoreCase(categoria)){
                aux.sort((o1, o2) -> o1.getMarca()-o2.getMarca());
            }
        }
        System.out.println(aux);
    }

    public void participantesPorPais(String pais){
        List<Atleta> aux = new ArrayList<Atleta>(lista_atletas.values());
        Atleta a = new Atleta("","","");
        for (int i = 0; i < aux.size(); i++) {
            if (aux.get(i).getPais().equalsIgnoreCase(pais)){
                lista_atletas.get(a.getPais()).getPais().length();
                aux.get(lista_atletas.get(i).getPais().length());
            }
        }
        System.out.println(aux);

    }



    @Override
    public String toString() {
        return "Maraton{" +
                "dorsal='" + dorsal + '\'' +
                ", lista_atletas=" + lista_atletas +
                '}';
    }
}
