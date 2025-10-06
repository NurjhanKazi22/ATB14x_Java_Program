package Exercises;

public class secondHighestNumber {
    public static void main(String[] args) {
      int[] integerArray = {-5,-10,-2};
      int firstHighest = Integer.MIN_VALUE;
      int secondHigh = Integer.MIN_VALUE;

      for(int i = 0;i<integerArray.length;i++){
          int temp =0;
          if(firstHighest<=integerArray[i]){
              temp = firstHighest;
              firstHighest=integerArray[i];
              secondHigh = temp;
          }
      }
        //System.out.println("first highest number"+firstHighest);
        System.out.println("Second highest number: "+secondHigh);
    }
}
