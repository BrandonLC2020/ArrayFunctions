/* 
You can always import the array class and then call the toString method 

import java.util.Arrays;

System.out.println(Arrays.toString(INSERT_ARRAY_NAME_HERE));
*/

public class PrintArray
{
   public static String storeValues(int[] array)
   {
      String values = "{";
      
      int size = array.length;
      int bound = size - 2;
      int last = size - 1;
      
      for(int i = 0; i < bound; i++)
      {
         values += array[i] + ", ";
      }
      
      values += array[last] + "}";
      
      return values;
   }
   
   public static void printValuesInt(int[] array)
   {
      String values = "{";
      
      int size = array.length;
      int last = size - 1;
      
      for(int i = 0; i < last; i++)
      {
         values += array[i] + ", ";
      }
      
      values += array[last] + "}";
      
      System.out.println(values);
   }

   public static void printValuesDouble(double[] array) 
   {
      String values = "{";
      
      int size = array.length;
      int last = size - 1;
      
      for(int i = 0; i < last; i++)
      {
         values += array[i] + ", ";
      }
      
      values += array[last] + "}";
      
      System.out.println(values);
   }
   
   public static void printValuesString(String[] array) 
   {
      String values = "{";
      
      int size = array.length;
      int last = size - 1;
      
      for(int i = 0; i < last; i++)
      {
         values += array[i] + ", ";
      }
      
      values += array[last] + "}";
      
      System.out.println(values);
   }
   
   public static void printValuesChar(char[] array) 
   {
      String values = "{";
      
      int size = array.length;
      int last = size - 1;
      
      for(int i = 0; i < last; i++)
      {
         values += array[i] + ", ";
      }
      
      values += array[last] + "}";
      
      System.out.println(values);
   }
   
   public static void printValuesBoolean(boolean[] array) 
   {
      String values = "{";
      
      int size = array.length;
      int last = size - 1;
      
      for(int i = 0; i < last; i++)
      {
         values += array[i] + ", ";
      }
      
      values += array[last] + "}";
      
      System.out.println(values);
   }
      
   public static void main(String[] args)
   {
      int[] numbers = new int[10];
      
      printValuesInt(numbers);
   }

}