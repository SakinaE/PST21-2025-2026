/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        
        System.out.print("Enter Mark1: ");
        int M1 = obj.nextInt();
        System.out.println("Enter Mark2: ");
        int M2 = obj.nextInt();
        System.out.println("Enter Mark3: ");
        int M3 = obj.nextInt();
        
        int Total=M1+M2+M3;
        int Average= Total/3;
        
        System.out.println("Total = " + Total);
        System.out.println("Average = " + Average);
    }
}
