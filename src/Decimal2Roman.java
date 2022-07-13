public class Decimal2Roman {
    private static final String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public static String integer2Roman(int num) {

        StringBuilder roman = new StringBuilder();
        for(int i=0;i<values.length;i++) {
            while(num >= values[i]) {
                num -= values[i];
                roman.append(numerals[i]);
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        System.out.println(integer2Roman(28));
    }
}
