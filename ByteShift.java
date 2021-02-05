public class ByteShift {
    public static void main(String[] args) {
        byte a = 32, b; // 0010 0000
        int num;

        // << => Shift Left
        num = a << 2; // 0010 0000 => 1000 0000
        b = (byte) (a << 2);

        System.out.println("Value of a: " + a);
        System.out.println("Value num: " + num);
        System.out.println("Value of b: " + b);
    }
}
