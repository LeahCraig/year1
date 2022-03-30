class Main {
  public static void main(String[] args) {
    int list1[] = {1,2,3,4,5};
    int list2[] = {-6,7,8,9,0,3};

    System.out.println("List 1: " + averageArray(list1));
    System.out.println("Min: " + minValue(list2));
    System.out.println("Max: " + maxValue(list2));
    printArray(arrayMerge(list1, list2));
  }
  
  public static void printArray(int[] list){
    System.out.print("[");
    for(int i=0; i < list.length; i++){
      System.out.print(" " + list[i] + " ");
    }
    System.out.println("]");
  }
  public static double averageArray(int[] list){
    // Complete this method
          double average;
      double sum=0;
      int i;
      
      for (i = 0; i < list.length; i++){
            sum += list[i];
          
          }
      
         average = ( sum / (list.length )); 
          
    return average;//put your own return value here

  }
  public static int minValue(int [] list){
    // Complete this method
     int i;
      int minValue = list[0];

      for(i =0; i < list.length; i++){
          if (list[i]< minValue){
              minValue = list[i];
          }
      }
    
    return minValue;//put your own return value here
  }
  public static int maxValue(int [] list){
    // Complete this method
    int i;
      int maxValue = list[0];

      for (i = 0; i <list.length; i++){
          if (list[i] >maxValue){
              maxValue = list[i];
          }
      }
    return maxValue;//put your own return value here
  }
  public static int[] arrayMerge(int[] l1, int [] l2){
    // Complete this method
      int[] c = new int[l1.length + l2.length];

      for(int i = 0; i < l1.length; i++){
          c[i] = l1[i];
      }
      for(int i =l1.length; i < (l1.length+l2.length); i++){
          c[i] =l2[i-l1.length];
      }

      
      
   
    return c;//put your own return value here
  } 

}