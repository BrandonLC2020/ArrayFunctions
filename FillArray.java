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
   
   public static char[] fillChar(char[] arr, char value)
   {
      int length = arr.length;
      char[] arry = new char[length];
      
      for(int i = 0; i < length; i++)
      {
         arry[i] = value;
      }
      
      return arry;
   }

   public static String[] fillString(String[] arr, String value)
   {
      int length = arr.length;
      String[] arry = new String[length];
      
      for(int i = 0; i < length; i++)
      {
         arry[i] = value;
      }
      
      return arry;
   }

   public static boolean[] fillBoolean(boolean[] arr, boolean value)
   {
      int length = arr.length;
      boolean[] arry = new boolean[length];
      
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
   
   public static int[][] fillInt2(int[][] arr, int value)
   {
      int row = arr.length;
      int col = arr[0].length;
      int[][] arry = new int[row][col];
      
      for(int r = 0; r < row; r++)
      {
         for(int c = 0; c < col; c++)
         {
            arry[r][c] = value;
         }
      }
      
      return arry;
   }

   public static double[][] fillDouble2(double[][] arr, double value)
   {
      int row = arr.length;
      int col = arr[0].length;
      double[][] arry = new double[row][col];
      
      for(int r = 0; r < row; r++)
      {
         for(int c = 0; c < col; c++)
         {
            arry[r][c] = value;
         }
      }
      
      return arry;
   }

   public static String[][] fillString2(String[][] arr, String value)
   {
      int row = arr.length;
      int col = arr[0].length;
      String[][] arry = new String[row][col];
      
      for(int r = 0; r < row; r++)
      {
         for(int c = 0; c < col; c++)
         {
            arry[r][c] = value;
         }
      }
      
      return arry;
   }

   public static char[][] fillChar2(char[][] arr, char value)
   {
      int row = arr.length;
      int col = arr[0].length;
      char[][] arry = new char[row][col];
      
      for(int r = 0; r < row; r++)
      {
         for(int c = 0; c < col; c++)
         {
            arry[r][c] = value;
         }
      }
      
      return arry;
   }

   public static boolean[][] fillBoolean2(boolean[][] arr, boolean value)
   {
      int row = arr.length;
      int col = arr[0].length;
      boolean[][] arry = new boolean[row][col];
      
      for(int r = 0; r < row; r++)
      {
         for(int c = 0; c < col; c++)
         {
            arry[r][c] = value;
         }
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