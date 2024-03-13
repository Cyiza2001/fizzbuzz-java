import java.util.Scanner;

/**
 * fizzbuz
 */
public class fizzbuz {
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

System.out.print("Enter the number: ");
byte myNumber = scanner.nextByte();
if (myNumber%5 == 0 && myNumber%3==0)
System.out.println("FizzBuzz");
else if(myNumber%5==0)
    System.out.println("Buzz");
else if(myNumber%3==0)
System.out.println("Fizz");

else
System.out.println(myNumber);
}
}