public class CopyArray
{
   public static int[] copyInt(int[] arr)
   {
      int length = arr.length;
      int[] nums = new int[length];
      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
      
      return nums;
   }
   
   public static double[] copyDouble(double[] arr)
   {
      int length = arr.length;
      double[] nums = new double[length];
      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
      
      return nums;
   }
   
   public static String[] copyString(String[] arr)
   {
      int length = arr.length;
      String[] nums = new String[length];
      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
      
      return nums;
   }
   
   public static char[] copyChar(char[] arr)
   {
      int length = arr.length;
      char[] nums = new char[length];
      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
      
      return nums;
   }

   public static boolean[] copyBoolean(boolean[] arr)
   {
      int length = arr.length;
      boolean[] nums = new boolean[length];
      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
      
      return nums;
   }
}