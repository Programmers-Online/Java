public class ArithmeticOp {
    public static void main(String[] args) {

        int num1, num2;

        num1 = 12;
        num2 = 6;

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);

        // + => Addition (unary plus)
        int a = num1 + num2;

        System.out.println("a : " + a);

        // - => Substraction (unary minus)

        int b = num1 - num2;

        System.out.println("b : " + b);

        // * => Multiplication

        int c = num1 * num2;

        System.out.println("c : " + c);

        // / => Division
        int d = num1 / num2;

        System.out.println("d : " + d);

        // % => Modulus

        int e = num1 % num2;

        System.out.println("e : " + e);

        // ++ => Increment
        num1++;
        System.out.println("value of num1 after increment operator : " + num1);

        // -- => Decrement
        num1--;
        System.out.println("value of num1 after decrement operator : " + num1);

        // += => Addition Assignment
        num1 += 5;
        System.out.println("value of num1 after using Addition assignment operator : " + num1);

        // -= => Substraction Assignment
        num1 -= 7;
        System.out.println("value of num1 after using Substraction assignment operator : " + num1);

        // *= => Multiplication Assignment
        num1 *= 2;
        System.out.println("value of num1 after using Multiplication assignment operator : " + num1);

        // /= => Division Assignment
        num1 /= 2;
        System.out.println("value of num1 after using Division assignment operator : " + num1);

        // %= => Modulus Assignment
        num1 %= 3;
        System.out.println("value of num1 after using Modulus assignment operator : " + num1);

    }
}
