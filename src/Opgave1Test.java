import org.w3c.dom.ls.LSOutput;

public class Opgave1Test {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int z = 3;

        System.out.println("1 A");
        boolean A;
        A = x <= 5 && z != y;
        if (A == true) {
            System.out.println("pass");
        } else {
            System.out.println("Fail"); }

        System.out.println("1 B");
        boolean B;
        B = x == 5 || x == y && z == 3;
        if (B == true) {
            System.out.println("pass");
        } else {System.out.println("fail");}

        System.out.println("1 C");
        boolean C;
        C = x / y > z / x;
        if (C == true) {
            System.out.println("pass");
        } else System.out.println("fail");

        System.out.println("1 D");
        boolean D;
        D = !(x != y - z) == false;
        if (D == true) {
            System.out.println("pass");
        } else {System.out.println("fail"); }

        System.out.println("1 E");
        boolean E;
        E = 2 * x != x || x == 0;
        if (E == true) {
            System.out.println("pass");
        } else { System.out.println("fail"); }

        System.out.println("1 F");
        boolean F;
        F = !true || !false;
        if (F == true) {
            System.out.println("pass");
        } else { System.out.println("fail"); }
    }




}




