public class Objeto {

    private int n1;
    private int n2;

    public Objeto(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return ""+ n1 + "" + n2;
    }
}
