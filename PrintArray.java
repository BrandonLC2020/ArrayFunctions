/* 
You can always import the array class and then call the toString method 

import java.util.Arrays;

System.out.println(Arrays.toString(INSERT_ARRAY_NAME_HERE));
*/

public class PrintArray
{
   public static String storeValuesInt(int[] array)
   {
      String values = "[";
      
      int size = array.length;
      int bound = size - 2;
      int last = size - 1;
      
      for(int i = 0; i < bound; i++)
      {
         values += array[i] + ", ";
      }
      
      values += array[last] + "]";
      
      return values;
   }
   
   public static String storeValuesDouble(double[] array)
   {
      String values = "[";
      
      int size = array.length;
      int bound = size - 2;
      int last = size - 1;
      
      for(int i = 0; i < bound; i++)
      {
         values += array[i] + ", ";
      }
      
      values += array[last] + "]";
      
      return values;
   }

   public static String storeValuesString(String[] array)
   {
      String values = "[";
      
      int size = array.length;
      int bound = size - 2;
      int last = size - 1;
      
      for(int i = 0; i < bound; i++)
      {
         values += array[i] + ", ";
      }
      
      values += array[last] + "]";
      
      return values;
   }
   
   public static String storeValuesChar(char[] array)
   {
      String values = "[";
      
      int size = array.length;
      int bound = size - 2;
      int last = size - 1;
      
      for(int i = 0; i < bound; i++)
      {
         values += array[i] + ", ";
      }
      
      values += array[last] + "]";
      
      return values;
   }

   public static String storeValuesBoolean(boolean[] array)
   {
      String values = "[";
      
      int size = array.length;
      int bound = size - 2;
      int last = size - 1;
      
      for(int i = 0; i < bound; i++)
      {
         values += array[i] + ", ";
      }
      
      values += array[last] + "]";
      
      return values;
   }
   
   public static String storeValuesInt2(int[][] array)
   {
      String values = "";
      
      int row = array.length;
      int col = array[0].length;
      int bound = col - 2;
      int last = col - 1;
      
      for(int r = 0; r < row; r++)
      {
         values += "|";
         
         for(int c = 0; c < last; c++)
         {
            values += array[r][c] + ", ";
         }
         
         values += array[r][last] + "|" + "\n";
      }
      
      return values;
   }
   
   public static String storeValuesDouble2(double[][] array)
   {
      String values = "";
      
      int row = array.length;
      int col = array[0].length;
      int bound = col - 2;
      int last = col - 1;
      
      for(int r = 0; r < row; r++)
      {
         values += "|";
         
         for(int c = 0; c < last; c++)
         {
            values += array[r][c] + ", ";
         }
         
         values += array[r][last] + "|" + "\n";
      }
      
      return values;
   }

   public static String storeValuesString2(String[][] array)
   {
      String values = "";
      
      int row = array.length;
      int col = array[0].length;
      int bound = col - 2;
      int last = col - 1;
      
      for(int r = 0; r < row; r++)
      {
         values += "|";
         
         for(int c = 0; c < last; c++)
         {
            values += array[r][c] + ", ";
         }
         
         values += array[r][last] + "|" + "\n";
      }
      
      return values;
   }

   public static String storeValuesChar2(char[][] array)
   {
      String values = "";
      
      int row = array.length;
      int col = array[0].length;
      int bound = col - 2;
      int last = col - 1;
      
      for(int r = 0; r < row; r++)
      {
         values += "|";
         
         for(int c = 0; c < last; c++)
         {
            values += array[r][c] + ", ";
         }
         
         values += array[r][last] + "|" + "\n";
      }
      
      return values;
   }
   
   public static String storeValuesBoolean2(boolean[][] array)
   {
      String values = "";
      
      int row = array.length;
      int col = array[0].length;
      int bound = col - 2;
      int last = col - 1;
      
      for(int r = 0; r < row; r++)
      {
         values += "|";
         
         for(int c = 0; c < last; c++)
         {
            values += array[r][c] + ", ";
         }
         
         values += array[r][last] + "|" + "\n";
      }
      
      return values;
   }

   public static void printValuesInt(int[] array)
   {
      String values = "[";
      
      int size = array.length;
      int last = size - 1;
      
      for(int i = 0; i < last; i++)
      {
         values += array[i] + ", ";
      }
      
      values += array[last] + "]";
      
      System.out.println(values);
   }

   public static void printValuesDouble(double[] array) 
   {
      String values = "[";
      
      int size = array.length;
      int last = size - 1;
      
      for(int i = 0; i < last; i++)
      {
         values += array[i] + ", ";
      }
      
      values += array[last] + "]";
      
      System.out.println(values);
   }
   
   public static void printValuesString(String[] array) 
   {
      String values = "[";
      
      int size = array.length;
      int last = size - 1;
      
      for(int i = 0; i < last; i++)
      {
         values += array[i] + ", ";
      }
      
      values += array[last] + "]";
      
      System.out.println(values);
   }
   
   public static void printValuesChar(char[] array) 
   {
      String values = "[";
      
      int size = array.length;
      int last = size - 1;
      
      for(int i = 0; i < last; i++)
      {
         values += array[i] + ", ";
      }
      
      values += array[last] + "]";
      
      System.out.println(values);
   }
   
   public static void printValuesBoolean(boolean[] array) 
   {
      String values = "[";
      
      int size = array.length;
      int last = size - 1;
      
      for(int i = 0; i < last; i++)
      {
         values += array[i] + ", ";
      }
      
      values += array[last] + "]";
      
      System.out.println(values);
   }
   
   public static void printValuesInt2(int[][] array)
   {
      String values = "";
      
      int row = array.length;
      int col = array[0].length;
      int bound = col - 2;
      int last = col - 1;
      
      for(int r = 0; r < row; r++)
      {
         values += "|";
         
         for(int c = 0; c < last; c++)
         {
            values += array[r][c] + ", ";
         }
         
         values += array[r][last] + "|" + "\n";
      }
      
      System.out.println(values);
   }
   
   public static void printValuesDouble2(double[][] array)
   {
      String values = "";
      
      int row = array.length;
      int col = array[0].length;
      int bound = col - 2;
      int last = col - 1;
      
      for(int r = 0; r < row; r++)
      {
         values += "|";
         
         for(int c = 0; c < last; c++)
         {
            values += array[r][c] + ", ";
         }
         
         values += array[r][last] + "|" + "\n";
      }
      
      System.out.println(values);
   }

   public static void printValuesChar2(char[][] array)
   {
      String values = "";
      
      int row = array.length;
      int col = array[0].length;
      int bound = col - 2;
      int last = col - 1;
      
      for(int r = 0; r < row; r++)
      {
         values += "|";
         
         for(int c = 0; c < last; c++)
         {
            values += array[r][c] + ", ";
         }
         
         values += array[r][last] + "|" + "\n";
      }
      
      System.out.println(values);
   }

   public static void printValuesString2(String[][] array)
   {
      String values = "";
      
      int row = array.length;
      int col = array[0].length;
      int bound = col - 2;
      int last = col - 1;
      
      for(int r = 0; r < row; r++)
      {
         values += "|";
         
         for(int c = 0; c < last; c++)
         {
            values += array[r][c] + ", ";
         }
         
         values += array[r][last] + "|" + "\n";
      }
      
      System.out.println(values);
   }
   
   public static void printValuesBoolean2(boolean[][] array)
   {
      String values = "";
      
      int row = array.length;
      int col = array[0].length;
      int bound = col - 2;
      int last = col - 1;
      
      for(int r = 0; r < row; r++)
      {
         values += "|";
         
         for(int c = 0; c < last; c++)
         {
            values += array[r][c] + ", ";
         }
         
         values += array[r][last] + "|" + "\n";
      }
      
      System.out.println(values);
   }


   public static void main(String[] args)
   {
      int[] numbers = new int[10];
      
      printValuesInt(numbers);
      
      int[][] test = new int[5][5];
      
      printValuesInt2(test);
   }

}