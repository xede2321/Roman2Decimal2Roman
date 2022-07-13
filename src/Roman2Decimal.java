public class Roman2Decimal {
    private static final String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static int roman2Decimal(String roman) {
        int result = 0;
        for (int i = 0; i < numerals.length; i++) {
            while (roman.startsWith(numerals[i])) {
                result += values[i];
                roman = roman.substring(numerals[i].length());
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(roman2Decimal("XVI"));
    }
}
