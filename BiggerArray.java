public class BiggerArray
{
   public static int[] expandInt(int[] arr, int increase)
   {
      int length = arr.length;
      int bigLength = length + increase;
      int[] nums = new int[bigLength];
      
      for(int i = 0; i < length; i ++)
      {
         nums[i] = arr[i];
      }
      
      return nums;
   }
   
   public static double[] expandDouble(double[] arr, int increase)
   {
      int length = arr.length;
      int bigLength = length + increase;
      double[] nums = new double[bigLength];
      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
      
      return nums;
   }
   
   public static String[] expandString(String[] arr, int increase)
   {
      int length = arr.length;
      int bigLength = length + increase;
      String[] nums = new String[bigLength];
      
      for(int i = 0; i < length; i ++)
      {
         nums[i] = arr[i];
      }
      
      return nums;
   }
   
   public static char[] expandChar(char[] arr, int increase)
   {
      int length = arr.length;
      int bigLength = length + increase;
      char[] nums = new char[bigLength];
      
      for(int i = 0; i < length; i ++)
      {
         nums[i] = arr[i];
      }
      
      return nums;
   }
   
   public static boolean[] expandBoolean(boolean[] arr, int increase)
   {
      int length = arr.length;
      int bigLength = length + increase;
      boolean[] nums = new boolean[bigLength];
      
      for(int i = 0; i < length; i ++)
      {
         nums[i] = arr[i];
      }
      
      return nums;
   }
   
   public static int[][] expandInt2(int[][] arr, int rowIncrease, int colIncrease)
   {
      int row = arr.length;
      int col = arr[0].length;
      int bigRow = row + rowIncrease;
      int bigCol = col + colIncrease;
      int[][] nums = new int[bigRow][bigCol];
      
      for(int r = 0; r < row; r++)
      {
         for(int c = 0; c < col; c++)
         {
            nums[r][c] = arr[r][c];
         }
      }
      
      return nums;
   }
   
   public static double[][] expandDouble2(double[][] arr, int rowIncrease, int colIncrease)
   {
      int row = arr.length;
      int col = arr[0].length;
      int bigRow = row + rowIncrease;
      int bigCol = col + colIncrease;
      double[][] nums = new double[bigRow][bigCol];
      
      for(int r = 0; r < row; r++)
      {
         for(int c = 0; c < col; c++)
         {
            nums[r][c] = arr[r][c];
         }
      }
      
      return nums;
   }

   public static String[][] expandString2(String[][] arr, int rowIncrease, int colIncrease)
   {
      int row = arr.length;
      int col = arr[0].length;
      int bigRow = row + rowIncrease;
      int bigCol = col + colIncrease;
      String[][] nums = new String[bigRow][bigCol];
      
      for(int r = 0; r < row; r++)
      {
         for(int c = 0; c < col; c++)
         {
            nums[r][c] = arr[r][c];
         }
      }
      
      return nums;
   }
   
   public static char[][] expandChar2(char[][] arr, int rowIncrease, int colIncrease)
   {
      int row = arr.length;
      int col = arr[0].length;
      int bigRow = row + rowIncrease;
      int bigCol = col + colIncrease;
      char[][] nums = new char[bigRow][bigCol];
      
      for(int r = 0; r < row; r++)
      {
         for(int c = 0; c < col; c++)
         {
            nums[r][c] = arr[r][c];
         }
      }
      
      return nums;
   }
   
   public static boolean[][] expandBoolean2(boolean[][] arr, int rowIncrease, int colIncrease)
   {
      int row = arr.length;
      int col = arr[0].length;
      int bigRow = row + rowIncrease;
      int bigCol = col + colIncrease;
      boolean[][] nums = new boolean[bigRow][bigCol];
      
      for(int r = 0; r < row; r++)
      {
         for(int c = 0; c < col; c++)
         {
            nums[r][c] = arr[r][c];
         }
      }
      
      return nums;
   }

   public static void main(String[] args)
   {
      int[] arry = new int[]{1, 2, 3, 4, 5};
      
      int[] big = expandInt(arry, 2);
      int[] orderedBig = FillArray.numberNormalInt(big);
      
      PrintArray.printValuesInt(big);
      PrintArray.printValuesInt(orderedBig);
   }
   
}  