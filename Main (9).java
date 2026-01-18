/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	   int num = 12221;     // original number
        int oldDigit = 2; // digit to replace
        int newDigit = 6; // new digit

        int result = 0;
        int place = 1;

        while (num > 0) {
            int digit = num % 10;

            if (digit == oldDigit)
                digit = newDigit;

            result = result + digit * place;
            place = place * 10;
            num = num / 10;
        }

        System.out.println(result);
    
	}
}
