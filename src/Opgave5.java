public class Opgave5 {
    public static String interval(int x) {
        System.out.println("for høj værdi, mellem 0 og 99");
        String result = "for høj værdi, mellem 0 og 99";


                if (x <= 9) {
                    System.out.println("[0..9]");
                    return result = "[0..9]";
                }
                if (x >= 10 && x < 19) {
                    System.out.println("[10..19]");
                    return result = "[10..19";
                }
                if (x >=20 && x < 29) {
                    System.out.println("[20..29]");
                    return result = "[20..29";
                }
                if (x >=30 && x <39) {
                    System.out.println("[30..39]");
                    return result = "[30..39]";
                }
                if (x >=40 && x <49) {
                    System.out.println("[40..49]");
                    return result = "[40..49]";
                }
                if (x >=50 && x < 59) {
                    System.out.println("[50..59");
                    return result = "[50..59]";
                }
                if (x >=60 && x <69) {
                    System.out.println("[60..69");
                    return result =  "[60..69]";
                }
                if (x >=70 && x <79) {
                    System.out.println("[70..79]");
                    return result =  "[70..79]";
                }
                if (x >=80 && x <89) {
                    System.out.println("[80..89");
                    return result =  "[80..89";
                }
                if (x >=90 && x < 99) {
                    System.out.println("[90..99]");
                    return result = "[90..99]";
        }
                return result;

    }
}
