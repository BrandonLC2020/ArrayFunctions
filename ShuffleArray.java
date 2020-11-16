public class ShuffleArray
{
   public static int[] shuffleInt(int[] arr)
   {
      int length = arr.length;
      int[] a = new int[length];
      
      for(int k = 0; k < length; k++)
      {
         a[k] = arr[k];
      }
      
      int counter = length;
      while(counter > 0)
      {
         int index = (int)(Math.floor(Math.random() * counter));
         
         counter--;
         
         int temp = a[counter];
         a[counter] = a[index];
         a[index] = temp;
      }
            
      return a;
   }
   
   public static double[] shuffleDouble(double[] arr)
   {
      int length = arr.length;
      double[] a = new double[length];
      
      for(int k = 0; k < length; k++)
      {
         a[k] = arr[k];
      }
      
      int counter = length;
      while(counter > 0)
      {
         int index = (int)(Math.floor(Math.random() * counter));
         
         counter--;
         
         double temp = a[counter];
         a[counter] = a[index];
         a[index] = temp;
      }
            
      return a;
   }

   public static String[] shuffleString(String[] arr)
   {
      int length = arr.length;
      String[] a = new String[length];
      
      for(int k = 0; k < length; k++)
      {
         a[k] = arr[k];
      }
      
      int counter = length;
      while(counter > 0)
      {
         int index = (int)(Math.floor(Math.random() * counter));
         
         counter--;
         
         String temp = a[counter];
         a[counter] = a[index];
         a[index] = temp;
      }
            
      return a;
   }

   public static char[] shuffleChar(char[] arr)
   {
      int length = arr.length;
      char[] a = new char[length];
      
      for(int k = 0; k < length; k++)
      {
         a[k] = arr[k];
      }
      
      int counter = length;
      while(counter > 0)
      {
         int index = (int)(Math.floor(Math.random() * counter));
         
         counter--;
         
         char temp = a[counter];
         a[counter] = a[index];
         a[index] = temp;
      }
            
      return a;
   }

   public static boolean[] shuffleBoolean(boolean[] arr)
   {
      int length = arr.length;
      boolean[] a = new boolean[length];
      
      for(int k = 0; k < length; k++)
      {
         a[k] = arr[k];
      }
      
      int counter = length;
      while(counter > 0)
      {
         int index = (int)(Math.floor(Math.random() * counter));
         
         counter--;
         
         boolean temp = a[counter];
         a[counter] = a[index];
         a[index] = temp;
      }
            
      return a;
   }

   public static void main(String[] args)
   {
      int[] one = new int[] {0, 3, 3};
      int[] two = new int[] {9, 3, 6, 0, 6};
      int[] three = new int[] {3, 3, 6, 0, 6, 3, 4, 5, 6, 7, 8};
      int[] sub = new int[20];
      int[] four = FillArray.numberNormalInt(sub);
      
      int[] shuffleOne = shuffleInt(one);
      int[] shuffleTwo = shuffleInt(two);
      int[] shuffleThree = shuffleInt(three);
      int[] shuffleFour = shuffleInt(four);
      
      PrintArray.printValuesInt(shuffleOne);
      PrintArray.printValuesInt(shuffleTwo);
      PrintArray.printValuesInt(shuffleThree);
      PrintArray.printValuesInt(shuffleFour);
   }
}