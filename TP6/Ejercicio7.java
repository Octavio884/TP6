import java.util.Scanner;

class Cuenta {
    private String cliente;
    private String numeroDeCuenta;
    private double interes;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String cliente, String numeroDeCuenta, double interes, double saldo) {
        this.cliente = cliente;
        this.numeroDeCuenta = numeroDeCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public Cuenta(Cuenta c) {
        this.cliente = c.cliente;
        this.numeroDeCuenta = c.numeroDeCuenta;
        this.interes = c.interes;
        this.saldo = c.saldo;
    }

    public boolean ingreso(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            return true;
        }
        return false;
    }

    public boolean egreso(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente.");
            return false;
        }
        saldo -= cantidad;
        return true;
    }

    public boolean transferencia(Cuenta destino, double cantidad) {
        if (cantidad > saldo) {
            System.out.println("No hay saldo suficiente para transferir.");
            return false;
        }
        saldo -= cantidad;
        destino.saldo += cantidad;
        return true;
    }

    public String getCliente() {
        return cliente;
    }

    public String getCuenta() {
        return numeroDeCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre, numero;
        double tipo, importe;

        Cuenta cuenta1 = new Cuenta();

        System.out.print("Nombre: ");
        nombre = sc.nextLine();

        System.out.print("Número de cuenta: ");
        numero = sc.nextLine();

        System.out.print("Tipo de interés: ");
        tipo = sc.nextDouble();

        System.out.print("Saldo: ");
        importe = sc.nextDouble();

        cuenta1.setCliente(nombre);
        cuenta1.setCuenta(numero);
        cuenta1.setInteres(tipo);
        cuenta1.setSaldo(importe);

        Cuenta cuenta2 = new Cuenta("Juan Fernández Rubio", "501558", 1.75, 300);
        Cuenta cuenta3 = new Cuenta(cuenta1);

        System.out.println("\nDatos de la cuenta 1");
        System.out.println("Nombre del titular: " + cuenta1.getCliente());
        System.out.println("Número de cuenta: " + cuenta1.getCuenta());
        System.out.println("Tipo de interés: " + cuenta1.getInteres());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println();

        cuenta1.ingreso(4000);

        System.out.println("Saldo de la cuenta 1 después del ingreso");
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println();

        System.out.println("Datos de la cuenta 2");
        System.out.println("Nombre del titular: " + cuenta2.getCliente());
        System.out.println("Número de cuenta: " + cuenta2.getCuenta());
        System.out.println("Tipo de interés: " + cuenta2.getInteres());
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        System.out.println("Datos de la cuenta 3");
        System.out.println("Nombre del titular: " + cuenta3.getCliente());
        System.out.println("Número de cuenta: " + cuenta3.getCuenta());
        System.out.println("Tipo de interés: " + cuenta3.getInteres());
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();

        if (cuenta3.transferencia(cuenta2, 10)) {
            System.out.println("Transferencia realizada");
        } else {
            System.out.println("No se ha podido realizar la transferencia");
        }

        System.out.println("\nSaldo de la cuenta 2");
        System.out.println("Saldo: " + cuenta2.getSaldo());

        System.out.println("\nSaldo de la cuenta 3");
        System.out.println("Saldo: " + cuenta3.getSaldo());

        sc.close();
    }
}