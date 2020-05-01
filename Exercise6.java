import java.util.Scanner;

public class Exercise6{
        public static void main(String[] args){
            
            Scanner input = new Scanner(System.in);

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
