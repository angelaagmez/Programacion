package coronavirus;

import java.io.*;
import java.util.*;

public class Coronavirus implements Serializable {
    private Map<String, LinkedList<Pacientes>> lista_pacientes;
    private String nombre;
    private String localidadOrigen;

    public Coronavirus() {
        this.lista_pacientes = new HashMap<>();
        this.nombre = "COVID-19";
        this.localidadOrigen = "Wuhan";
    }

    public Map<String, LinkedList<Pacientes>> getLista_pacientes() {
        return lista_pacientes;
    }

    public void setLista_pacientes(Map<String, LinkedList<Pacientes>> lista_pacientes) {
        this.lista_pacientes = lista_pacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidadOrigen() {
        return localidadOrigen;
    }

    public void setLocalidadOrigen(String localidadOrigen) {
        this.localidadOrigen = localidadOrigen;
    }

    public void addPaciente(String cepa,Pacientes paciente){
        if (paciente.getCepa().equalsIgnoreCase(cepa)){
            if (!lista_pacientes.containsKey(cepa)){
                lista_pacientes.put(cepa,new LinkedList<>());
            }
            lista_pacientes.get(cepa).add(paciente);
        } else {
            System.out.println("La cepa no coincide con la del paciente");
        }
    }

    public void darDeAltaPaciente(Pacientes paciente){
        if (lista_pacientes.get(paciente.getCepa()).contains(paciente)){
            lista_pacientes.get(paciente.getCepa()).remove(paciente);
        } else {
            System.out.println("No se ha encontrado el paciente");
        }
    }

    public int pacientesDeUnDoctor(int numColeg){
        Medicos med = new Medicos("","",numColeg,"");
        Collection<LinkedList<Pacientes>> aux = lista_pacientes.values();
        int cantPacientes=0;

        Iterator it = aux.iterator();
        while (it.hasNext()){
            ArrayList<Pacientes> pacient = new ArrayList<>((ArrayList<Pacientes>) it.next());
            for (Pacientes p : pacient) {
                if (p.getMedico().equals(med)){
                    cantPacientes++;
                    System.out.println(p);
                }
            }
        }
        if (cantPacientes==0){
            System.out.println("Este medico no lleva ningun paciente");
        }
        return cantPacientes;
    }

    public void pacientesPorPeso(String cepa){
        if (lista_pacientes.containsKey(cepa)){
            List<Pacientes> aux = new ArrayList<>(lista_pacientes.get(cepa));
            aux.sort(new Comparator<Pacientes>() {
                @Override
                public int compare(Pacientes o1, Pacientes o2) {
                    return (int)(o2.getPeso()-o1.getPeso());
                }
            });
            System.out.println(aux);
        } else {
            System.out.println("No se reconoce la cepa");
        }
    }

    public void pacientesPorEdad(String cepa){
        if (lista_pacientes.containsKey(cepa)){
            ArrayList<Pacientes> aux = new ArrayList<>(lista_pacientes.get(cepa));
            aux.sort(new Comparator<Pacientes>() {
                @Override
                public int compare(Pacientes o1, Pacientes o2) {
                    return o2.getEdad()-o1.getEdad();
                }
            });
            System.out.println(aux);
        } else {
            System.out.println("No se reconoce la cepa");
        }
    }

    public void cargarPacientes() {
        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream("./src/coronavirus/pacientes.data"));
            while (true){
                Pacientes p = (Pacientes) leer.readObject();
                addPaciente(p.getCepa(),p);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void guardarPacientes(){
        try{
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("./src/coronavirus/pacientes.data"));
            Collection<LinkedList<Pacientes>> aux = lista_pacientes.values();
            Iterator it = aux.iterator();
            while (it.hasNext()){
                LinkedList<Pacientes> aux2 = new LinkedList<>((LinkedList<Pacientes>) it.next());
                for (Pacientes p: aux2) {
                    escribir.writeObject(p);
                }
            }
            escribir.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Coronavirus{" +
                "lista_pacientes=" + lista_pacientes +
                ", nombre='" + nombre + '\'' +
                ", localidadOrigen='" + localidadOrigen + '\'' +
                '}';
    }


}
