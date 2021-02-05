public class BitwiseOperatorExample {
    public static void main(String[] args) {
        String[] binary = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
                "1011", "1100", "1101", "1110", "1111" };

        int a = 3;
        // Bitwise Unary NOT
        // 0 => 1
        // 1 => 0
        System.out.println("a = " + binary[a]);
        System.out.println("~a = " + binary[(~a & 0x0f)]);

        // Bitwise AND
        // a => 0011
        // b => 0110
        // => 0010
        int b = 6;
        System.out.println("a & b => " + binary[(a & b)]);

        // Bitwise OR
        // a => 0011
        // b => 0110
        // => 0111
        System.out.println("a | b => " + binary[(a | b)]);

        // eXclusive OR
        // a => 0011
        // b => 0110
        // => 0101
        System.out.println("a ^ b => " + binary[(a ^ b)]);

    }
}
