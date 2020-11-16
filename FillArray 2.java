import java.util.Arrays;

public class FillArray
{
   public static int[] fillInt(int[] arr, int value)
   {
      int length = arr.length;
      int[] arry = new int[length];
      
      for(int i = 0; i < length; i++)
      {
         arry[i] = value;
      }
      
      return arry;
   }
   
   public static int[] numberNormalInt(int[] arr)
   {
      int length = arr.length;
      int[] arry = new int[length];
      
      for(int i = 0; i < length; i++)
      {
         arry[i] = i + 1;
      }
      
      return arry;
   }
   
   public static int[] numberSlotsInt(int[] arr)
   {
      int length = arr.length;
      int[] arry = new int[length]; 
      
      for(int i = 0; i < length; i++)
      {
         arry[i] = i;
      }
      
      return arry;
   }
   
   public static double[] fillDouble(double[] arr, double value)
   {
      int length = arr.length;
      double[] arry = new double[length];
      
      for(int i = 0; i < length; i++)
      {
         arry[i] = value;
      }
      
      return arry;
   }
   
   public static double[] numberNormalDouble(double[] arr)
   {
      int length = arr.length;
      double[] arry = new double[length];
      
      for(int i = 0; i < length; i++)
      {
         arry[i] = i + 1;
      }
      
      return arry;
   }
   
   public static double[] numberSlotsDouble(double[] arr)
   {
      int length = arr.length;
      double[] arry = new double[length]; 
      
      for(int i = 0; i < length; i++)
      {
         arry[i] = i;
      }
      
      return arry;
   }

   public static void main(String[] args)
   {
      double[] nums = new double[10];
      
      double[] numbers = fillDouble(nums, 3);
      
      double[] other = numberNormalDouble(nums);
      
      double[] another = numberSlotsDouble(nums);
      
      PrintArray.printValuesDouble(nums);
      System.out.println(Arrays.toString(numbers));
      System.out.println(Arrays.toString(other));
      System.out.println(Arrays.toString(another));
   }
}