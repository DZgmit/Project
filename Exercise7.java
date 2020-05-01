import java.util.ArrayList;
public class Exercise7{
   public static void main(String[] args){
     
      ArrayList<String> list = new ArrayList<String>();
      list.add("10");
      list.add("20");
      list.add("30");
      list.add("40");
      list.add("50");
      list.add("60");
      list.add("70");
      list.add("80");
      list.add("90");
      list.add("100");
     
      System.out.println("First element of the array list: "+list.get(0));
      System.out.println("Last element of the array list: "+list.get(list.size()-1));
      
}
   }
