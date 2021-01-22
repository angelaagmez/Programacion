package Bonilla_Gomez_U4_T1_Entrega;

import static Bonilla_Gomez_U4_T1_Entrega.Departamento.getContDepartamento;
import static Bonilla_Gomez_U4_T1_Entrega.Empleado.getContEmpleado;

public class Main {
    public static void main(String[] args) {

        Empleado e1 = new Empleado("Pepe Perez","123-123-XX", "6746539879",Tipo.ADMINISTRATIVO);
        Empleado e2 = new Empleado("Manuel Moron","145-232-YY", "983457487");
        Empleado e3 = new Empleado("Angela Burgos","987-763-ZZ", "982374929",Tipo.DIRECTIVA);
        Empleado e4 = new Empleado("Eduardo Iglesias","092-568-WW", "6768392731");
        Empleado e5 = new Empleado("Natalia Rodriguez","345-766-TT", "6928773828",Tipo.TECNICO);
        Empleado e6 = new Empleado("Agustin Martinez","469-171-VV", "790187384",Tipo.ADMINISTRATIVO);
        Empleado e7 = new Empleado("Ana Garcia","579-171-II", "938478239",Tipo.TECNICO);
        Empleado e8 = new Empleado("Gonzalo Waack","435-102-QQ", "790187384",Tipo.DIRECTIVA);

        Departamento d1 = new Departamento("Programacion","789654234");
        Departamento d2 = new Departamento("Diseño","Brenes","986587665");
        Departamento d3 = new Departamento("Pruebas","Alcala","608654468");

        Empresa emp = new Empresa("Alixar");


        System.out.println("Numero de departamentos: "+getContDepartamento());
        System.out.println("Numero de empleados: "+getContEmpleado());
        System.out.println("");

        d1.addEmpleado(e1);
        d1.addEmpleado(e2);
        d2.addEmpleado(e3);
        d2.addEmpleado(e4);
        d3.addEmpleado(e5);
        d3.addEmpleado(e6);

        d2.addEmpleado(e7);
        d3.addEmpleado(e8);

        emp.addDepartamento(d1);
        emp.addDepartamento(d2);
        emp.addDepartamento(d3);

        System.out.println("INFO. DEPARTAMENTOS: ");
        emp.mostrarInfoDepartamentos();

        System.out.println("DEPARTAMENTO 2: ");
        d2.mostrarInfoEmpleados();
        System.out.println("DEPARTAMENTO 3: ");
        d3.mostrarInfoEmpleados();

        System.out.println("");
        d3.deleteEmpleado("345-766-TT");
        d3.mostrarInfoEmpleados();


    }
}
