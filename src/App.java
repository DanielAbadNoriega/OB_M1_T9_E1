public class App {
    public static void main(String[] args) throws Exception {

        /* Ejercicio 2.2 */
        Cliente cliente = new Cliente(31, "Daniel", 600611622, 10000);

        System.out.println("Edad cliente: " + cliente.getEdad());
        System.out.println("Nombre cliente: " + cliente.getNombre());
        System.out.println("Telefono cliente: " + cliente.getTelefono());
        System.out.println("Credito cliente: " + cliente.getCredito() + " euros.");

        System.out.println("\n----------------------\n");
        /* Ejercicio 3.2 */

        Trabajador trabajador = new Trabajador(30, "Pepe", 633644655, 22000);

        System.out.println("Edad trabajador: " + trabajador.getEdad());
        System.out.println("Nombre trabajador: " + trabajador.getNombre());
        System.out.println("Telefono trabajador: " + trabajador.getTelefono());
        System.out.println("Salario trabajador: " + trabajador.getSalario() + " euros.");

    }

}

/* Ejercicio 1 */
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public Persona(int edad, String nombre, int telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

/* Ejercicio 2.1 */
class Cliente extends Persona {

    private int credito;

    public Cliente(int edad, String nombre, int telefono, int credito) {
        super(telefono, nombre, telefono);

        this.credito = credito;
    }

    public int getCredito() {
        return this.credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

/* Ejercicio 3.1 */
class Trabajador extends Persona{
    private int salario;

    public Trabajador(int edad, String nombre, int telefono, int salario){
        super(edad, nombre, telefono);

        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}