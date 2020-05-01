import java.util.Scanner;

public class Exercise3{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number = 0;

        System.out.print("Enter number: ");
        number = input.nextInt();

        if(number == 19){
        System.out.println("Number matches my age.");

        } else if(number > 19){
        System.out.println("Number is greater then my age");

        } else {
        System.out.println("Number is less then my age");
        }

}
	}
