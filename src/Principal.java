public class Principal {

    public static void main(String[] args) {


        Objeto[] array = new Objeto[3];
        array[0] = new Objeto(10, 20);
        array[1] = new Objeto(30, 40);
        array[2] = new Objeto(40, 50);

        for (Objeto elemento : array) {

            System.out.println(elemento);
        }
    }
}
