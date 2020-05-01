import java.util.Scanner;

public class Exercise4{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number;
        int counter = 0;

        System.out.print("Please enter a number from 1 to 10: ");
        number = input.nextInt();

        if(number >= 1 && number <= 10){
            System.out.println("Your number is: "+number);
            
        }else {
            System.out.println("Number is invalid");
            System.exit(0);
        }

        while(counter < number){
            counter++;
            System.out.println(counter+". Dawid");
        }



}
	}
