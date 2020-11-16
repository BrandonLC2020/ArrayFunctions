public class SearchArray
{
   public static int findMinInt(int[] arr)
   {
      int length = arr.length;
      int[] nums = new int[length];
      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }

      if(length > 1)
      {
         int start = 0;
         int first = 1;
         int min = nums[start];
         
         for(int i = first; i < length; i++)
         {
            if(nums[i] < min)
            {
               min = nums[i];
            }
         } 
         
         return min; 
      }
      else
      {
          int min = nums[0];
          return min;
      }
   }
   
   public static double findMinDouble(double[] arr)
   {
      int length = arr.length;
      double[] nums = new double[length];
      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }

      if(length > 1)
      {
         int start = 0;
         int first = 1;
         double min = nums[start];
         
         for(int i = first; i < length; i++)
         {
            if(nums[i] < min)
            {
               min = nums[i];
            }
         } 
         
         return min; 
      }
      else
      {
          double min = nums[0];
          return min;
      }
   }

   public static int findMaxInt(int[] arr)
   {
      int length = arr.length;
      int[] nums = new int[length];

      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
      
      if(length > 1)
      {
         int start = 0;
         int first = 1;
         int max = nums[start];
         
         for(int i = first; i < length; i++)
         {
            if(nums[i] > max)
            {
               max = nums[i];
            }
         } 
         
         return max; 
      }
      else
      {
          int max = nums[0];
          return max;
      }
   }
   
   public static double findMaxDouble(double[] arr)
   {
      int length = arr.length;
      double[] nums = new double[length];

      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
      
      if(length > 1)
      {
         int start = 0;
         int first = 1;
         double max = nums[start];
         
         for(int i = first; i < length; i++)
         {
            if(nums[i] > max)
            {
               max = nums[i];
            }
         } 
         
         return max; 
      }
      else
      {
          double max = nums[0];
          return max;
      }
   }

   public static int[] indexOf(int[] nums, int value)
   {
      int length = nums.length;
      int[] values = new int[length];
      int last = length - 1;
      int j = 0;
            
      for(int i = 0; i < length; i++)
      {
         if(nums[i] == value)
         {
            values[j] = i;
            j++;
         }
      }
      
      int ending = 0;
      
      for(int i = 0; i < length; i++)
      {
         if(values[i] == 0)
         {
            ending = i;
            break;
         }
      }
      
            
      int[] valueSet = new int[ending];
      int width = valueSet.length;
      
      for(int i = 0; i < width; i++)
      {
         valueSet[i] = values[i];
      }
      
      return valueSet;
   }
}