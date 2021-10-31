public class NumberConversion {
    public static void main(String[] args) {

        String input = "1010";
        int intermediate = Integer.parseInt(input, 2);
        System.out.println(Integer.toHexString(intermediate));

        // binary number
        String binary = "01011011";

        // binary to decimal
        int decimal = Integer.parseInt(binary, 2);
        System.out.println(binary + "(2) = " + decimal + "(10)");

        // decimal to binary
        binary = Integer.toBinaryString(decimal);
        System.out.println(decimal + "(10) = " + binary + "(2)");

        String hex = Integer.toHexString(decimal);
        System.out.println(decimal + "(10) = " + hex + "(16)");

    }

    // ========= Custom methods for conversion =========

    public static int convertBinaryToDecimal(long num) {
        int decimalNumber = 0, i = 0;
        long remainder;

        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }

        return decimalNumber;
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

    private static final int sizeOfIntInHalfBytes = 8;
    private static final int numberOfBitsInAHalfByte = 4;
    private static final int halfByte = 0x0F;
    private static final char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E',
            'F' };

    public static String decToHex(int dec) {
        StringBuilder hexBuilder = new StringBuilder(sizeOfIntInHalfBytes);
        hexBuilder.setLength(sizeOfIntInHalfBytes);
        for (int i = sizeOfIntInHalfBytes - 1; i >= 0; --i) {
            int j = dec & halfByte;
            hexBuilder.setCharAt(i, hexDigits[j]);
            dec >>= numberOfBitsInAHalfByte;
        }
        return hexBuilder.toString();
    }
}
