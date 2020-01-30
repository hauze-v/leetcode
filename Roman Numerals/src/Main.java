public class Main {

    public static void main(String[] args) {
        RomanToDecimal ob = new RomanToDecimal();

        // Considering inputs given are valid
        String str = "MCMIV";
        System.out.println("Integer form of Roman Numeral " + str +
                " is " + ob.romanToDecimal(str));
    }
}
