public class Opgave4 {
    public static String størst1(int first, int second, int third) {
        String result ="third";
                if (first > second && first > third) {
                    result = "first";
                } else if (second > first && second > third) {
                    result = "second";
                }
                    return result;
    }
}
