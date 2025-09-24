import java.util.Scanner;

public class AllEqual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a == b && b == c) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
