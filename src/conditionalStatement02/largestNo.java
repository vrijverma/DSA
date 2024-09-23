package conditionalStatement02;

import java.util.Scanner;

public class largestNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a,b and c");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>=b && a>=c)
        {
            System.out.println("grater no. "+a);
        }
        else if(b>=c)
        {
            System.out.println("grater no."+b);
        }
        else {
            System.out.println("grater no. "+c);
        }
    }
}
