public class NumberConversion {
    public static void main(String[] args) {

        // binary number
        String binary = "01011011";

        // binary to decimal
        int decimal = Integer.parseInt(binary, 2);
        System.out.println(binary + "(2) = " + decimal + "(10)");

        // decimal to binary
        binary = Integer.toBinaryString(decimal);
        System.out.println(decimal + "(10) = " + binary + "(2)");

        // decimal to hex
        String hex = Integer.toHexString(decimal);
        System.out.println(decimal + "(10) = " + hex + "(16)");

        System.out.println(binary + "(2) = " + convertBinaryToDecimal(binary) + "(10)");

        System.out.println(decimal + "(10) = " + convertDecimalToBinary(decimal) + "(2)");

    }

    // ========= Custom methods for conversion =========
    public static int convertBinaryToDecimal(String binary) {

        int decimal = 0;
        int j = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int number = binary.charAt(i) - 48;
            decimal += number * Math.pow(2, j);
            j++;
        }

        return decimal;
    }

    public static long convertDecimalToBinary(int n) {

        long binaryNumber = 0;
        int remainder, i = 1, step = 1;

        while (n != 0) {
            remainder = n % 2;
            System.out.println("Step " + step++ + ": " + n + "/2");

            System.out.println("Quotient = " + n / 2 + ", Remainder = " + remainder);
            n /= 2;

            binaryNumber += remainder * i;
            i *= 10;
        }

        return binaryNumber;
    }

}
