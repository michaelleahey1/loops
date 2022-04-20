import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // while loops
        for (int i = 5; i > 0; i--)
            System.out.println("Hello World" + i);
        int i = 0;
        while (i > 0) {
            System.out.println("Hello World" + 1);
            i--;
            // for loops are best if you know how many times you will repeat
            // while loops are best if we don't know how many times you will repeat it

        }
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals ("quit")) {
            System.out.println("input");
            input = scanner.next().toLowerCase();
            System.out.println(input);


            // do while loop
        do {
            System.out.println("input");
            input = scanner.next( ).toLowerCase( );
            System.out.println(input);
            while (!input.equals("quit")) ;
            // do while loops always get executed at least once
        }


        }
    }
}
