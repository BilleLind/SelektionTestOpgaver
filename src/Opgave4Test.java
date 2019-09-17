public class Opgave4Test {
    public static void main(String[] args) {
        int first;
        int second;
        int third;

        //4.1
        first= 10;
        second=10;
        third=11;
        if (Opgave4.størst1(first, second, third).equals("third")) {
            System.out.println("pass");
        } else {System.out.println("fail");}

        //4.2
        first=12;
        second=15;
        third=1;
        if (Opgave4.størst1(first, second, third).equals("second")) {
            System.out.println("pass");
        } else {System.out.println("fail");}

        //4.3
        first=1000;
        second=2501;
        third=999;
        if (Opgave4.størst1(first, second, third).equals("second")) {
            System.out.println("pass");
        } else {System.out.println("fail");}

    }
}
