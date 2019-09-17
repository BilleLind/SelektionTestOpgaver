public class Opgave5Test {
    public static void main(String[] args) {

        int x;

        //5.1
        System.out.println("5.1");
        x =52;
        if (Opgave5.interval(x).equals("[50..59]")) {
            System.out.println("pass");
        }else {System.out.println("fail");}

        //5.2
        System.out.println("5.2");
        x =30;
        if (Opgave5.interval(x).equals("[30..39]")) {
            System.out.println("pass");
        } else {System.out.println("fail");}

        //5.3
        System.out.println("5.3");
        x=98;
        if (Opgave5.interval(x).equals("[90..99]")) {
            System.out.println("pass");
        }else {System.out.println("fail");}

        //5.4
        System.out.println("5.4");
        x=101;
        if (Opgave5.interval(x).equals("for høj værdi, mellem 0 og 99")) {
            System.out.println("pass");
        }else {System.out.println("fail");}

    }
}
