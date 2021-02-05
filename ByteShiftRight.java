public class ByteShiftRight {
    public static void main(String[] args) {

        byte a = 64, b; // 0010 0000
        int num;

        // << => Right Left
        num = a >> 2; // 0010 0000 => 0000 1000
        b = (byte) (a >> 2);

        System.out.println("Value of a: " + a);
        System.out.println("Value num: " + num);
        System.out.println("Value of b: " + b);

    }
}
