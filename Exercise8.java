import java.util.Scanner;
public class Exercise8{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int ex = 0;
        
        System.out.print("Pick a exercise from 1 to 6");
        ex = input.nextInt();
        
        if(ex == 1){
        String name = "Marry";
        int age = 20;
        double weight = 65.48;
        String colour = "red";
          
        System.out.println(name+ " is " +age+ " years old");
        System.out.println("She weights " +weight+ " kilograms");
        System.out.println("Her favourite colour is " +colour+"");
        }
      
        else if(ex == 2){
        int number1 = 0;
        int number2 = 0;
        int result = 0;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();
        System.out.print("Enter second number: ");
        number2 = input.nextInt();
          
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " +result);
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " +result);
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " +result);
        }
      
        else if(ex == 3){
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
      
        else if(ex == 4){
        int number = 0;
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
          
        }else if(ex == 5){
        int[] x = {20, 30, 40, 50};
        int sum = 0;
        int pro = 1;
          
        for(int i=0; i < x.length ; i++)
        sum = sum + x[i];
        System.out.println("Sum of array elements is: " +sum);
          
        double average = sum / x.length;
        System.out.println("Average value of the array elements is: " +average);
          
        for (int i=0; i <x.length ; i++)
        pro = pro * x[i];
        System.out.println("The product value of the array elements is: "+pro);
        }
          
        else if(ex == 6){
        String symbol = "";  
        int row = 0;
        int col = 0;
        int counter = 0;
        int inner_counter = 0;
        

        System.out.print("Enter a symbol: ");
        symbol = input.next();
        System.out.print("Enter number of rows: ");
        row = input.nextInt();
        System.out.print("Enter number of columns: ");
        col = input.nextInt();
        System.out.println("");

        while (counter < row){
	    inner_counter = 0;
	    while(inner_counter < col){
	    System.out.print(symbol+" ");
        inner_counter = inner_counter + 1;
	    }
          
	    System.out.print("\n");
	    counter = counter + 1;
	    }

	    System.out.println();
        }
          
}
    }
	  
