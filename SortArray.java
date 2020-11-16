public class SortArray
{
   public static int[] toLargestInt(int[] arr)
   {
      int length = arr.length;
      
      int[] nums = new int[length];
      
      //duplicate array      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
            
      if(length%2 == 0)
      {
         int frequency = length / 2;
         int start = 0;
         int end = length;
         int first = 1;
         int last = length - 1;
         for(int j = 0; j < frequency; j++)
         { 
            int max = nums[start];
            int indexMax = start;
            int min = nums[start];
            int indexMin = start;
            
            //find max
            for(int i = first; i < end; i++)
            {
               if(nums[i] > max)
               {
                  max = nums[i];
                  indexMax = i;
               }
            }
            
            //find min
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
            
            //enter max into correct slot
            if(min == nums[last])
            {
               int min2 = nums[start];
               int indexMin2 = start;
               //find second smallest value
               for(int i = first; i < end; i++)
               {
                  if((nums[i] < min2) && (nums[i] != nums[indexMin]))
                  {
                     min2 = nums[i];
                     indexMin2 = i;
                  }
               }
               
               int tempMin = nums[last];
               nums[last] = nums[indexMin2];
               nums[indexMin2] = tempMin;
            }
                              
            int tempMax = nums[last];
            nums[last] = nums[indexMax];
            nums[indexMax] = tempMax;
            
            //find min again
            min = nums[start];
            indexMin = start;
            
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
                                        
            int tempMin = nums[start];
            nums[start] = nums[indexMin];
            nums[indexMin] = tempMin;
            
            //shrink search area
            start++;
            first++;
            end--;
            last--;
         }
      }
      else
      {
         int frequency = length / 2 + 1;
         int start = 0;
         int end = length;
         int first = 1;
         int last = length - 1;
         for(int j = 0; j < frequency; j++)
         { 
            int max = nums[start];
            int indexMax = start;
            int min = nums[start];
            int indexMin = start;
            
            //find max
            for(int i = first; i < end; i++)
            {
               if(nums[i] > max)
               {
                  max = nums[i];
                  indexMax = i;
               }
            }
            
            //find min
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
            
            //enter max into correct slot
            if(min == nums[last])
            {
               int min2 = nums[start];
               int indexMin2 = start;
               //find second smallest value
               for(int i = first; i < end; i++)
               {
                  if((nums[i] < min2) && (nums[i] != nums[indexMin]))
                  {
                     min2 = nums[i];
                     indexMin2 = i;
                  }
               }
               
               int tempMin = nums[last];
               nums[last] = nums[indexMin2];
               nums[indexMin2] = tempMin;
            }
                              
            int tempMax = nums[last];
            nums[last] = nums[indexMax];
            nums[indexMax] = tempMax;
            
            //find min again
            min = nums[start];
            indexMin = start;
            
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
                                        
            int tempMin = nums[start];
            nums[start] = nums[indexMin];
            nums[indexMin] = tempMin;
            
            //shrink search area
            start++;
            first++;
            end--;
            last--;
         }
 
      }      
      //put quality controller in to check to see if it's in ascending numerical order

      return nums;
   }
   
   public static char[] alphabeticalOrder(char[] arr)
   {
      int length = arr.length;
      
      char[] nums = new char[length];
      
      //duplicate array      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
            
      if(length%2 == 0)
      {
         int frequency = length / 2;
         int start = 0;
         int end = length;
         int first = 1;
         int last = length - 1;
         for(int j = 0; j < frequency; j++)
         { 
            char max = nums[start];
            int indexMax = start;
            char min = nums[start];
            int indexMin = start;
            
            //find max
            for(int i = first; i < end; i++)
            {
               if(nums[i] > max)
               {
                  max = nums[i];
                  indexMax = i;
               }
            }
            
            //find min
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
            
            //enter max into correct slot
            if(min == nums[last])
            {
               char min2 = nums[start];
               int indexMin2 = start;
               //find second smallest value
               for(int i = first; i < end; i++)
               {
                  if((nums[i] < min2) && (nums[i] != nums[indexMin]))
                  {
                     min2 = nums[i];
                     indexMin2 = i;
                  }
               }
               
               char tempMin = nums[last];
               nums[last] = nums[indexMin2];
               nums[indexMin2] = tempMin;
            }
                              
            char tempMax = nums[last];
            nums[last] = nums[indexMax];
            nums[indexMax] = tempMax;
            
            //find min again
            min = nums[start];
            indexMin = start;
            
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
                                        
            char tempMin = nums[start];
            nums[start] = nums[indexMin];
            nums[indexMin] = tempMin;
            
            //shrink search area
            start++;
            first++;
            end--;
            last--;
         }
      }
      else
      {
         int frequency = length / 2 + 1;
         int start = 0;
         int end = length;
         int first = 1;
         int last = length - 1;
         for(int j = 0; j < frequency; j++)
         { 
            char max = nums[start];
            int indexMax = start;
            char min = nums[start];
            int indexMin = start;
            
            //find max
            for(int i = first; i < end; i++)
            {
               if(nums[i] > max)
               {
                  max = nums[i];
                  indexMax = i;
               }
            }
            
            //find min
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
            
            //enter max into correct slot
            if(min == nums[last])
            {
               char min2 = nums[start];
               int indexMin2 = start;
               //find second smallest value
               for(int i = first; i < end; i++)
               {
                  if((nums[i] < min2) && (nums[i] != nums[indexMin]))
                  {
                     min2 = nums[i];
                     indexMin2 = i;
                  }
               }
               
               char tempMin = nums[last];
               nums[last] = nums[indexMin2];
               nums[indexMin2] = tempMin;
            }
                              
            char tempMax = nums[last];
            nums[last] = nums[indexMax];
            nums[indexMax] = tempMax;
            
            //find min again
            min = nums[start];
            indexMin = start;
            
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
                                        
            char tempMin = nums[start];
            nums[start] = nums[indexMin];
            nums[indexMin] = tempMin;
            
            //shrink search area
            start++;
            first++;
            end--;
            last--;
         }
 
      }      
      //put quality controller in to check to see if it's in ascending numerical order

      return nums;
   }

   public static double[] toLargestDouble(double[] arr)
   {
      int length = arr.length;
      
      double[] nums = new double[length];
      
      //duplicate array      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
            
      if(length%2 == 0)
      {
         int frequency = length / 2;
         int start = 0;
         int end = length;
         int first = 1;
         int last = length - 1;
         for(int j = 0; j < frequency; j++)
         { 
            double max = nums[start];
            int indexMax = start;
            double min = nums[start];
            int indexMin = start;
            
            //find max
            for(int i = first; i < end; i++)
            {
               if(nums[i] > max)
               {
                  max = nums[i];
                  indexMax = i;
               }
            }
            
            //find min
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
            
            //enter max into correct slot
            if(min == nums[last])
            {
               double min2 = nums[start];
               int indexMin2 = start;
               //find second smallest value
               for(int i = first; i < end; i++)
               {
                  if((nums[i] < min2) && (nums[i] != nums[indexMin]))
                  {
                     min2 = nums[i];
                     indexMin2 = i;
                  }
               }
               
               double tempMin = nums[last];
               nums[last] = nums[indexMin2];
               nums[indexMin2] = tempMin;
            }
                              
            double tempMax = nums[last];
            nums[last] = nums[indexMax];
            nums[indexMax] = tempMax;
            
            //find min again
            min = nums[start];
            indexMin = start;
            
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
                                        
            double tempMin = nums[start];
            nums[start] = nums[indexMin];
            nums[indexMin] = tempMin;
            
            //shrink search area
            start++;
            first++;
            end--;
            last--;
         }
      }
      else
      {
         int frequency = length / 2 + 1;
         int start = 0;
         int end = length;
         int first = 1;
         int last = length - 1;
         for(int j = 0; j < frequency; j++)
         { 
            double max = nums[start];
            int indexMax = start;
            double min = nums[start];
            int indexMin = start;
            
            //find max
            for(int i = first; i < end; i++)
            {
               if(nums[i] > max)
               {
                  max = nums[i];
                  indexMax = i;
               }
            }
            
            //find min
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
            
            //enter max into correct slot
            if(min == nums[last])
            {
               double min2 = nums[start];
               int indexMin2 = start;
               //find second smallest value
               for(int i = first; i < end; i++)
               {
                  if((nums[i] < min2) && (nums[i] != nums[indexMin]))
                  {
                     min2 = nums[i];
                     indexMin2 = i;
                  }
               }
               
               double tempMin = nums[last];
               nums[last] = nums[indexMin2];
               nums[indexMin2] = tempMin;
            }
                              
            double tempMax = nums[last];
            nums[last] = nums[indexMax];
            nums[indexMax] = tempMax;
            
            //find min again
            min = nums[start];
            indexMin = start;
            
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
                                        
            double tempMin = nums[start];
            nums[start] = nums[indexMin];
            nums[indexMin] = tempMin;
            
            //shrink search area
            start++;
            first++;
            end--;
            last--;
         }
 
      }      
      //put quality controller in to check to see if it's in ascending numerical order

      return nums;
   }

   public static int[] toSmallestInt(int[] arr)
   {
      int length = arr.length;
      
      int[] nums = new int[length];
      
      //copy array      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
            
      if(length%2 == 0)
      {
         int frequency = length / 2;
         int start = 0;
         int end = length;
         int first = 1;
         int last = length - 1;
         for(int j = 0; j < frequency; j++)
         { 
            int max = nums[start];
            int indexMax = start;
            int min = nums[start];
            int indexMin = start;
            
            //find max
            for(int i = first; i < end; i++)
            {
               if(nums[i] > max)
               {
                  max = nums[i];
                  indexMax = i;
               }
            }
            
            //find min
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
            
            //enter max into correct slot
            if(min == nums[last])
            {
               int min2 = nums[start];
               int indexMin2 = start;
               //find second smallest value
               for(int i = first; i < end; i++)
               {
                  if((nums[i] < min2) && (nums[i] != nums[indexMin]))
                  {
                     min2 = nums[i];
                     indexMin2 = i;
                  }
               }
               
               int tempMin = nums[last];
               nums[last] = nums[indexMin2];
               nums[indexMin2] = tempMin;
            }
                              
            int tempMax = nums[start];
            nums[start] = nums[indexMax];
            nums[indexMax] = tempMax;
            
            //find min again
            min = nums[start];
            indexMin = start;
            
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
                                        
            int tempMin = nums[last];
            nums[last] = nums[indexMin];
            nums[indexMin] = tempMin;
            
            //shrink search area
            start++;
            first++;
            end--;
            last--;
         }
      }
      else
      {
         int frequency = length / 2 + 1;
         int start = 0;
         int end = length;
         int first = 1;
         int last = length - 1;
         for(int j = 0; j < frequency; j++)
         { 
            int max = nums[start];
            int indexMax = start;
            int min = nums[start];
            int indexMin = start;
            
            //find max
            for(int i = first; i < end; i++)
            {
               if(nums[i] > max)
               {
                  max = nums[i];
                  indexMax = i;
               }
            }
            
            //find min
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
            
            //enter max into correct slot
            if(min == nums[last])
            {
               int min2 = nums[start];
               int indexMin2 = start;
               //find second smallest value
               for(int i = first; i < end; i++)
               {
                  if((nums[i] < min2) && (nums[i] != nums[indexMin]))
                  {
                     min2 = nums[i];
                     indexMin2 = i;
                  }
               }
               
               int tempMin = nums[last];
               nums[last] = nums[indexMin2];
               nums[indexMin2] = tempMin;
            }
                              
            int tempMax = nums[start];
            nums[start] = nums[indexMax];
            nums[indexMax] = tempMax;
            
            //find min again
            min = nums[start];
            indexMin = start;
            
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
                                        
            int tempMin = nums[last];
            nums[last] = nums[indexMin];
            nums[indexMin] = tempMin;
            
            //shrink search area
            start++;
            first++;
            end--;
            last--;
         }
 
      }      
      //put quality controller in to check to see if it's in ascending numerical order

      return nums;
   }
   
   public static double[] toSmallestDouble(double[] arr)
   {
      int length = arr.length;
      
      double[] nums = new double[length];
      
      //copy array      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
            
      if(length%2 == 0)
      {
         int frequency = length / 2;
         int start = 0;
         int end = length;
         int first = 1;
         int last = length - 1;
         for(int j = 0; j < frequency; j++)
         { 
            double max = nums[start];
            int indexMax = start;
            double min = nums[start];
            int indexMin = start;
            
            //find max
            for(int i = first; i < end; i++)
            {
               if(nums[i] > max)
               {
                  max = nums[i];
                  indexMax = i;
               }
            }
            
            //find min
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
            
            //enter max into correct slot
            if(min == nums[last])
            {
               double min2 = nums[start];
               int indexMin2 = start;
               //find second smallest value
               for(int i = first; i < end; i++)
               {
                  if((nums[i] < min2) && (nums[i] != nums[indexMin]))
                  {
                     min2 = nums[i];
                     indexMin2 = i;
                  }
               }
               
               double tempMin = nums[last];
               nums[last] = nums[indexMin2];
               nums[indexMin2] = tempMin;
            }
                              
            double tempMax = nums[start];
            nums[start] = nums[indexMax];
            nums[indexMax] = tempMax;
            
            //find min again
            min = nums[start];
            indexMin = start;
            
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
                                        
            double tempMin = nums[last];
            nums[last] = nums[indexMin];
            nums[indexMin] = tempMin;
            
            //shrink search area
            start++;
            first++;
            end--;
            last--;
         }
      }
      else
      {
         int frequency = length / 2 + 1;
         int start = 0;
         int end = length;
         int first = 1;
         int last = length - 1;
         for(int j = 0; j < frequency; j++)
         { 
            double max = nums[start];
            int indexMax = start;
            double min = nums[start];
            int indexMin = start;
            
            //find max
            for(int i = first; i < end; i++)
            {
               if(nums[i] > max)
               {
                  max = nums[i];
                  indexMax = i;
               }
            }
            
            //find min
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
            
            //enter max into correct slot
            if(min == nums[last])
            {
               double min2 = nums[start];
               int indexMin2 = start;
               //find second smallest value
               for(int i = first; i < end; i++)
               {
                  if((nums[i] < min2) && (nums[i] != nums[indexMin]))
                  {
                     min2 = nums[i];
                     indexMin2 = i;
                  }
               }
               
               double tempMin = nums[last];
               nums[last] = nums[indexMin2];
               nums[indexMin2] = tempMin;
            }
                              
            double tempMax = nums[start];
            nums[start] = nums[indexMax];
            nums[indexMax] = tempMax;
            
            //find min again
            min = nums[start];
            indexMin = start;
            
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
                                        
            double tempMin = nums[last];
            nums[last] = nums[indexMin];
            nums[indexMin] = tempMin;
            
            //shrink search area
            start++;
            first++;
            end--;
            last--;
         }
 
      }      
      //put quality controller in to check to see if it's in ascending numerical order

      return nums;
   }

   public static char[] reverseAlphabeticalOrder(char[] arr)
   {
      int length = arr.length;
      
      char[] nums = new char[length];
      
      //copy array      
      for(int i = 0; i < length; i++)
      {
         nums[i] = arr[i];
      }
            
      if(length%2 == 0)
      {
         int frequency = length / 2;
         int start = 0;
         int end = length;
         int first = 1;
         int last = length - 1;
         for(int j = 0; j < frequency; j++)
         { 
            char max = nums[start];
            int indexMax = start;
            char min = nums[start];
            int indexMin = start;
            
            //find max
            for(int i = first; i < end; i++)
            {
               if(nums[i] > max)
               {
                  max = nums[i];
                  indexMax = i;
               }
            }
            
            //find min
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
            
            //enter max into correct slot
            if(min == nums[last])
            {
               char min2 = nums[start];
               int indexMin2 = start;
               //find second smallest value
               for(int i = first; i < end; i++)
               {
                  if((nums[i] < min2) && (nums[i] != nums[indexMin]))
                  {
                     min2 = nums[i];
                     indexMin2 = i;
                  }
               }
               
               char tempMin = nums[last];
               nums[last] = nums[indexMin2];
               nums[indexMin2] = tempMin;
            }
                              
            char tempMax = nums[start];
            nums[start] = nums[indexMax];
            nums[indexMax] = tempMax;
            
            //find min again
            min = nums[start];
            indexMin = start;
            
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
                                        
            char tempMin = nums[last];
            nums[last] = nums[indexMin];
            nums[indexMin] = tempMin;
            
            //shrink search area
            start++;
            first++;
            end--;
            last--;
         }
      }
      else
      {
         int frequency = length / 2 + 1;
         int start = 0;
         int end = length;
         int first = 1;
         int last = length - 1;
         for(int j = 0; j < frequency; j++)
         { 
            char max = nums[start];
            int indexMax = start;
            char min = nums[start];
            int indexMin = start;
            
            //find max
            for(int i = first; i < end; i++)
            {
               if(nums[i] > max)
               {
                  max = nums[i];
                  indexMax = i;
               }
            }
            
            //find min
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
            
            //enter max into correct slot
            if(min == nums[last])
            {
               char min2 = nums[start];
               int indexMin2 = start;
               //find second smallest value
               for(int i = first; i < end; i++)
               {
                  if((nums[i] < min2) && (nums[i] != nums[indexMin]))
                  {
                     min2 = nums[i];
                     indexMin2 = i;
                  }
               }
               
               char tempMin = nums[last];
               nums[last] = nums[indexMin2];
               nums[indexMin2] = tempMin;
            }
                              
            char tempMax = nums[start];
            nums[start] = nums[indexMax];
            nums[indexMax] = tempMax;
            
            //find min again
            min = nums[start];
            indexMin = start;
            
            for(int i = first; i < end; i++)
            {
               if(nums[i] < min)
               {
                  min = nums[i];
                  indexMin = i;
               }
            }
                                        
            char tempMin = nums[last];
            nums[last] = nums[indexMin];
            nums[indexMin] = tempMin;
            
            //shrink search area
            start++;
            first++;
            end--;
            last--;
         }
 
      }      
      //put quality controller in to check to see if it's in ascending numerical order

      return nums;
   }

   public static void main(String[] args)
   {
      double[] num = new double[] {2, 4, 5, 3, 7, 1, 6};
      double[] number = new double[] {4, 5, 3, 2};
      double[] numbers = new double[] {8, 5, 7};
      double[] same = new double[10];
      
      double[] one = new double[] {1};
      double[] fine = new double[] {1, 2, 3, 4, 5, 6};
      
      double[] large1 = toLargestDouble(num);
      double[] large2 = toLargestDouble(number);
      double[] large3 = toLargestDouble(numbers);
      double[] large4 = toLargestDouble(same);
      double[] large5 = toLargestDouble(one);
      double[] large6 = toLargestDouble(fine);
      
      double[] small1 = toSmallestDouble(num);
      double[] small2 = toSmallestDouble(number);
      double[] small3 = toSmallestDouble(numbers);
      double[] small4 = toSmallestDouble(fine);
      
      char[] letters = new char[] {'A', 'D', 'C', 'E', 'B', 'H', 'F', 'G', 'J', 'K', 'I'};
      
      char[] sorted = alphabeticalOrder(letters);
      char[] reverse = reverseAlphabeticalOrder(letters);
      
      PrintArray.printValuesDouble(large1);
      PrintArray.printValuesDouble(large2);
      PrintArray.printValuesDouble(large3);
      PrintArray.printValuesDouble(large4);
      PrintArray.printValuesDouble(large5);
      PrintArray.printValuesDouble(large6);
      PrintArray.printValuesDouble(small1);
      PrintArray.printValuesDouble(small2);
      PrintArray.printValuesDouble(small3);
      PrintArray.printValuesDouble(small4);
      PrintArray.printValuesChar(sorted);
      PrintArray.printValuesChar(reverse);
   }
}