public class RotateArray
{
   public static int[] rotateBackwardInt(int[] arr)
   {
      int length = arr.length;
      int[] nums = new int[length];
      int bound = length - 1;

      int temp = arr[0];
                  
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
      
      for(int i = 0; i < bound; i++)
      {
         nums[i] = nums[i+1];
      }
      
      nums[bound] = temp;
       
      return nums;
   }
   
   public static double[] rotateBackwardDouble(double[] arr)
   {
      int length = arr.length;
      double[] nums = new double[length];
      int bound = length - 1;

      double temp = arr[0];
                  
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
      
      for(int i = 0; i < bound; i++)
      {
         nums[i] = nums[i+1];
      }
      
      nums[bound] = temp;
       
      return nums;
   }

   public static String[] rotateBackwardString(String[] arr)
   {
      int length = arr.length;
      String[] nums = new String[length];
      int bound = length - 1;

      String temp = arr[0];
                  
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
      
      for(int i = 0; i < bound; i++)
      {
         nums[i] = nums[i+1];
      }
      
      nums[bound] = temp;
       
      return nums;
   }
   
   public static char[] rotateBackwardChar(char[] arr)
   {
      int length = arr.length;
      char[] nums = new char[length];
      int bound = length - 1;

      char temp = arr[0];
                  
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
      
      for(int i = 0; i < bound; i++)
      {
         nums[i] = nums[i+1];
      }
      
      nums[bound] = temp;
       
      return nums;
   }
   
   public static boolean[] rotateBackwardBoolean(boolean[] arr)
   {
      int length = arr.length;
      boolean[] nums = new boolean[length];
      int bound = length - 1;

      boolean temp = arr[0];
                  
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
      
      for(int i = 0; i < bound; i++)
      {
         nums[i] = nums[i+1];
      }
      
      nums[bound] = temp;
       
      return nums;
   }

   public static int[] rotateBackwardMoreInt(int[] arr, int frequency)
   {
      int length = arr.length;
      int[] nums = new int[length];
      int bound = length - 1;        
                  
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
             
      for(int k = 0; k < frequency; k++)
      {
         int lastOne = nums[0];
                  
         for(int j = 0; j < bound; j++)
         {
            nums[j] = nums[j+1];
         }
         
         nums[bound] = lastOne;
      }
       
      return nums;
   }
   
   public static double[] rotateBackwardMoreDouble(double[] arr, int frequency)
   {
      int length = arr.length;
      double[] nums = new double[length];
      int bound = length - 1;        
                  
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
             
      for(int k = 0; k < frequency; k++)
      {
         double lastOne = nums[0];
                  
         for(int j = 0; j < bound; j++)
         {
            nums[j] = nums[j+1];
         }
         
         nums[bound] = lastOne;
      }
       
      return nums;
   }
   
   public static String[] rotateBackwardMoreString(String[] arr, int frequency)
   {
      int length = arr.length;
      String[] nums = new String[length];
      int bound = length - 1;        
                  
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
             
      for(int k = 0; k < frequency; k++)
      {
         String lastOne = nums[0];
                  
         for(int j = 0; j < bound; j++)
         {
            nums[j] = nums[j+1];
         }
         
         nums[bound] = lastOne;
      }
       
      return nums;
   }
   
   public static char[] rotateBackwardMoreChar(char[] arr, int frequency)
   {
      int length = arr.length;
      char[] nums = new char[length];
      int bound = length - 1;        
                  
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
             
      for(int k = 0; k < frequency; k++)
      {
         char lastOne = nums[0];
                  
         for(int j = 0; j < bound; j++)
         {
            nums[j] = nums[j+1];
         }
         
         nums[bound] = lastOne;
      }
       
      return nums;
   }

   public static boolean[] rotateBackwardMoreBoolean(boolean[] arr, int frequency)
   {
      int length = arr.length;
      boolean[] nums = new boolean[length];
      int bound = length - 1;        
                  
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
             
      for(int k = 0; k < frequency; k++)
      {
         boolean lastOne = nums[0];
                  
         for(int j = 0; j < bound; j++)
         {
            nums[j] = nums[j+1];
         }
         
         nums[bound] = lastOne;
      }
       
      return nums;
   }

   public static int[] rotateForwardInt(int[] arry)
   {
      int length = arry.length;
      int[] nums = new int[length];
      int bound = arry.length - 1;
      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arry[i];
      }
      
      int temp = nums[bound];
      
      for(int i = bound; i > 0; i--)
      {
         nums[i] = nums[i-1];
      }
      
      nums[0] = temp;
      
      return nums;
   }
   
   public static double[] rotateForwardDouble(double[] arry)
   {
      int length = arry.length;
      double[] nums = new double[length];
      int bound = arry.length - 1;
      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arry[i];
      }
      
      double temp = nums[bound];
      
      for(int i = bound; i > 0; i--)
      {
         nums[i] = nums[i-1];
      }
      
      nums[0] = temp;
      
      return nums;
   }
   
   public static String[] rotateForwardString(String[] arry)
   {
      int length = arry.length;
      String[] nums = new String[length];
      int bound = arry.length - 1;
      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arry[i];
      }
      
      String temp = nums[bound];
      
      for(int i = bound; i > 0; i--)
      {
         nums[i] = nums[i-1];
      }
      
      nums[0] = temp;
      
      return nums;
   }
   
   public static char[] rotateForwardChar(char[] arry)
   {
      int length = arry.length;
      char[] nums = new char[length];
      int bound = arry.length - 1;
      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arry[i];
      }
      
      char temp = nums[bound];
      
      for(int i = bound; i > 0; i--)
      {
         nums[i] = nums[i-1];
      }
      
      nums[0] = temp;
      
      return nums;
   }
   
   public static boolean[] rotateForwardBoolean(boolean[] arry)
   {
      int length = arry.length;
      boolean[] nums = new boolean[length];
      int bound = arry.length - 1;
      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arry[i];
      }
      
      boolean temp = nums[bound];
      
      for(int i = bound; i > 0; i--)
      {
         nums[i] = nums[i-1];
      }
      
      nums[0] = temp;
      
      return nums;
   }

   public static int[] rotateForwardMoreInt(int[] arr, int frequency)
   {
      int length = arr.length;
      int[] nums = new int[length];
      int bound = length - 1;        
                  
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
            
      
      for(int k = 0; k < frequency; k++)
      {
         int lastOne = nums[bound];
                  
         for(int j = bound; j > 0; j--)
         {
            nums[j] = nums[j-1];
         }
         
         nums[0] = lastOne;
      }
       
      return nums;
   }
   
   public static double[] rotateForwardMoreDouble(double[] arr, int frequency)
   {
      int length = arr.length;
      double[] nums = new double[length];
      int bound = length - 1;        
                  
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
            
      
      for(int k = 0; k < frequency; k++)
      {
         double lastOne = nums[bound];
                  
         for(int j = bound; j > 0; j--)
         {
            nums[j] = nums[j-1];
         }
         
         nums[0] = lastOne;
      }
       
      return nums;
   }
   
   public static String[] rotateForwardMoreString(String[] arr, int frequency)
   {
      int length = arr.length;
      String[] nums = new String[length];
      int bound = length - 1;        
                  
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
            
      
      for(int k = 0; k < frequency; k++)
      {
         String lastOne = nums[bound];
                  
         for(int j = bound; j > 0; j--)
         {
            nums[j] = nums[j-1];
         }
         
         nums[0] = lastOne;
      }
       
      return nums;
   }

   public static char[] rotateForwardMoreChar(char[] arr, int frequency)
   {
      int length = arr.length;
      char[] nums = new char[length];
      int bound = length - 1;        
                  
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
            
      
      for(int k = 0; k < frequency; k++)
      {
         char lastOne = nums[bound];
                  
         for(int j = bound; j > 0; j--)
         {
            nums[j] = nums[j-1];
         }
         
         nums[0] = lastOne;
      }
       
      return nums;
   }
   
   public static boolean[] rotateForwardMoreBoolean(boolean[] arr, int frequency)
   {
      int length = arr.length;
      boolean[] nums = new boolean[length];
      int bound = length - 1;        
                  
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
            
      
      for(int k = 0; k < frequency; k++)
      {
         boolean lastOne = nums[bound];
                  
         for(int j = bound; j > 0; j--)
         {
            nums[j] = nums[j-1];
         }
         
         nums[0] = lastOne;
      }
       
      return nums;
   }

   public static void main(String[] args)
   {
      int[] num = new int[] {1, 2, 3, 4, 5};
      
      //int[] newNums = rotateBackwardInt(num);
      //int[] newNewNums = rotateForwardInt(num);
      int[] newNewNewNums = rotateBackwardMoreInt(num, 2);
      int[] newNewNewNewNums = rotateForwardMoreInt(num, 2);
      
      PrintArray.printValuesInt(num);
      //PrintArray.printValuesInt(newNums);  
      PrintArray.printValuesInt(newNewNewNums); 
      PrintArray.printValuesInt(newNewNewNewNums);     
   }
}