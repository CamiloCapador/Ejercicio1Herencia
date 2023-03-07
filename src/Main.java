public class Main {
    public static void main(String[] args) {

        //JUAN CAMILO GARZON CAPADOR
        //ID 700935

        System.out.println("Ejercicio 1 Herencia");

        Persona per = new Persona();
        per.setNombre("Juan Perez");
        per.setDireccion("Cra 4 #3b Gachancipa");
        Estudiante est = new Estudiante("Camilo Garzon","Cra 5 #3-2","Ingenieria de sistemas",9);
        Profesor prof = new Profesor("Carlos Sanchez","Cra 10 - cll 2","Ingenieria","Sistemas");

        System.out.println(per.toString());
        System.out.println(est.toString());
        System.out.println(prof.toString());
    }
}