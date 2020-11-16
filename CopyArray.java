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
   
   public static int[][] copyInt2(int[][] arry)
   {
      int rows = arry.length;
      int cols = arry[0].length;
      int[][] nums = new int[rows][cols];
      
      for(int r = 0; r < rows; r++)
      {
         for(int c = 0; c < cols; c++)
         {
            nums[r][c] = arry[r][c];
         }  
      }
      
      return nums;
   }
   
   public static double[][] copyDouble2(double[][] arry)
   {
      int rows = arry.length;
      int cols = arry[0].length;
      double[][] nums = new double[rows][cols];
      
      for(int r = 0; r < rows; r++)
      {
         for(int c = 0; c < cols; c++)
         {
            nums[r][c] = arry[r][c];
         }  
      }
      
      return nums;
   }
   
   public static String[][] copyString2(String[][] arry)
   {
      int rows = arry.length;
      int cols = arry[0].length;
      String[][] nums = new String[rows][cols];
      
      for(int r = 0; r < rows; r++)
      {
         for(int c = 0; c < cols; c++)
         {
            nums[r][c] = arry[r][c];
         }  
      }
      
      return nums;
   }

   public static char[][] copyChar2(char[][] arry)
   {
      int rows = arry.length;
      int cols = arry[0].length;
      char[][] nums = new char[rows][cols];
      
      for(int r = 0; r < rows; r++)
      {
         for(int c = 0; c < cols; c++)
         {
            nums[r][c] = arry[r][c];
         }  
      }
      
      return nums;
   }
   
   public static boolean[][] copyBoolean2(boolean[][] arry)
   {
      int rows = arry.length;
      int cols = arry[0].length;
      boolean[][] nums = new boolean[rows][cols];
      
      for(int r = 0; r < rows; r++)
      {
         for(int c = 0; c < cols; c++)
         {
            nums[r][c] = arry[r][c];
         }  
      }
      
      return nums;
   }

}