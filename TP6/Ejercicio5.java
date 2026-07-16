class Contador {

    private int cont;

    public Contador() {
        this.cont = 0;
    }

    public Contador(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    public Contador(Contador otro) {
        this.cont = otro.cont;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    public void Incrementar() {
        this.cont++;
    }

    public void Decrementar() {
        this.cont--;
        if (this.cont < 0) {
            this.cont = 0;
        }
    }

    public static void main(String[] args) {

        System.out.println("--- PRUEBA CLASE CONTADOR ---");

        Contador c1 = new Contador(-5);
        System.out.println("Valor inicial c1: " + c1.getCont());

        Contador c2 = new Contador(3);
        System.out.println("Valor inicial c2: " + c2.getCont());

        c2.Incrementar();
        System.out.println("c2 incrementado: " + c2.getCont());

        c2.Decrementar();
        c2.Decrementar();
        c2.Decrementar();
        c2.Decrementar();

        System.out.println("c2 decrementado 4 veces: " + c2.getCont());

        c2.Decrementar();
        System.out.println("c2 decrementado una vez más: " + c2.getCont());

        Contador c3 = new Contador(c2);
        System.out.println("Valor c3: " + c3.getCont());
    }
}