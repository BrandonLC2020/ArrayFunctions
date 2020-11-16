public class MoveArray
{
   public static int[] moveValuesInt(int[] arr, int loc1, int loc2)
   {
      int length = arr.length;
      int[] nums = new int[length];
      
      for(int i = 0; i < length; i ++)
      {
         nums[i] = arr[i];
      }
      
      if((loc1 < length) && (loc2 < length))
      {
         int temp = nums[loc1];
         nums[loc1] = nums[loc2];
         nums[loc2] = temp;
      }
      
      return nums;
   }
   
   public static double[] moveValuesDouble(double[] arr, int loc1, int loc2)
   {
      int length = arr.length;
      double[] nums = new double[length];
      
      for(int i = 0; i < length; i ++)
      {
         nums[i] = arr[i];
      }
      
      if((loc1 < length) && (loc2 < length))
      {
         double temp = nums[loc1];
         nums[loc1] = nums[loc2];
         nums[loc2] = temp;
      }
      
      return nums;
   }

   public static char[] moveValuesChar(char[] arr, int loc1, int loc2)
   {
      int length = arr.length;
      char[] nums = new char[length];
      
      for(int i = 0; i < length; i ++)
      {
         nums[i] = arr[i];
      }
      
      if((loc1 < length) && (loc2 < length))
      {
         char temp = nums[loc1];
         nums[loc1] = nums[loc2];
         nums[loc2] = temp;
      }
      
      return nums;
   }
   
   public static String[] moveValuesString(String[] arr, int loc1, int loc2)
   {
      int length = arr.length;
      String[] nums = new String[length];
      
      for(int i = 0; i < length; i ++)
      {
         nums[i] = arr[i];
      }
      
      if((loc1 < length) && (loc2 < length))
      {
         String temp = nums[loc1];
         nums[loc1] = nums[loc2];
         nums[loc2] = temp;
      }
      
      return nums;
   }
   
   public static boolean[] moveValuesBoolean(boolean[] arr, int loc1, int loc2)
   {
      int length = arr.length;
      boolean[] nums = new boolean[length];
      
      for(int i = 0; i < length; i ++)
      {
         nums[i] = arr[i];
      }
      
      if((loc1 < length) && (loc2 < length))
      {
         boolean temp = nums[loc1];
         nums[loc1] = nums[loc2];
         nums[loc2] = temp;
      }
      
      return nums;
   }

   public static void main(String[] args)
   {
      int[] test = new int[]{1, 2, 3, 4};
      
      int[] test1 = moveValuesInt(test, 0, 2);
      
      PrintArray.printValuesInt(test1);
   }
}

