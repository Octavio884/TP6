class Mascota {
    private String nombre;
    private String raza;
    private int edad;
    private double peso;
    private String codigo;
    public Mascota() {}
    public Mascota(String nombre, String raza, int edad, double peso, String codigo) {        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.codigo = codigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return this.raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void ImprimirDatos() {
        System.out.println("--- Datos de la Mascota ---");
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Raza: " + this.raza);
        System.out.println("Edad: " + this.edad + " años");
        System.out.println("Peso: "+ peso + " kg");
    }
}
public class Ejercicio3 {
    public static void main(String[] args) {
    
}
}