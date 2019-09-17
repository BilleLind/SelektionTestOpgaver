public class Opgave2Test {
    public static void main(String[] args) {


        int x;
        int y;

        //test 2.1
        x = 41;
        y = 67;
        if (Opgave2.evaluer(x, y).equals("summen er større end 100") ) {
            System.out.println("pass");
        } else { System.out.println("fail");}


        // test 2.2
        x = 20;
        y = 100;
        if (Opgave2.evaluer(x, y).equals("summen er større end 10") ){
            System.out.println("pass");
        }else {System.out.println("fail");}

        //test 2.3
        x = 60;
        y = 40;
        if (Opgave2.evaluer(x, y).equals("")) {
            System.out.println("pass");
        }else {System.out.println("fail");}

        //test 2.4
        x =30;
        y =30;
        if (Opgave2.evaluer(x, y).equals("")) {
            System.out.println("pass");
        }else {System.out.println("fail");}

    }
}
