import java.util.Arrays;

public class FunctionTester
{
   public static void main(String[] args)
   {   
      int[] num = new int[5];
      
      int[] newNum = FillArray.numberNormalInt(num);
      
      int[] newNewNum = RotateArray.rotateBackwardInt(newNum);
      
      int[] newNewNewNum = RotateArray.rotateBackwardMoreInt(newNum, 2);
      
      
      int[] test1 = new int[]{0, 1, 3, 3, 4, 5};
      int[] test2 = SearchArray.indexOf(test1, 3);
      int[] test3 = CopyArray.copyInt(test1);

      PrintArray.printValuesInt(test3); 
      int min1 = SearchArray.findMinInt(test1);
      int max1 = SearchArray.findMaxInt(test1);
      
      System.out.println(min1 + "  " + max1);       
   }
}