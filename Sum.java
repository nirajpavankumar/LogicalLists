import java.util.ArrayList;

public class Sum{
  // prepare a function to add and return all elements in ArrayList
    public static Integer total (ArrayList<Integer>list){
      int sum = 0;
      for (Integer i : list) {
        sum= sum + i;
      }
      return sum;
    }
  public static void main(String[]args){
  // Create ArrayList Object
  ArrayList<Integer> arrayList= new ArrayList<Integer>();
    // Add Elements to it using For Loop
    for (int i = 1; i <= 5; i++) {
      arrayList.add(i);
    }
     System.out.println("Sum of ArrayList elements: " + total(arrayList));
  // total is your function name it should return total value
  }}
