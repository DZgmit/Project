public class Exercise5{
      public static void main(String args[]){

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
}
