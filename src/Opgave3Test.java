public class Opgave3Test {
    public static void main(String[] args) {

        int first;
        int second;

        //test 3.1
        first =20;
        second =35;
        if (Opgave3.størst(first, second).equals("second")) {
            System.out.println("pass");
        }else {System.out.println("fail");}

        //test 3.2
        first = 100;
        second = 10;

        if (Opgave3.størst(first, second).equals("first")) {
            System.out.println("pass");
        } else {System.out.println("fail");}

        //test 3.3
        first=5;
        second=10;

        if (Opgave3.størst(first, second).equals("second")) {
            System.out.println("pass");
        } else { System.out.println("fail");}





    }

}
