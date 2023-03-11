package lab4;

public class Main {

    public static void main(String[] args) {
        Equal e1 = new Equal(10, 15);
        Equal e2 = new Equal(10, 15);
        if (e1.equals(2)) {
            System.out.println("Equal: ");
        } else {
            System.out.println("Not Equal !");
        }
    }
}
