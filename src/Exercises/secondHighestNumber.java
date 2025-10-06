package Exercises;

public class secondHighestNumber {
    public static void main(String[] args) {
      int[] integerArray = {12, 32, 10, 1, 100, 3, 4, 34};
      int firstHighest = Integer.MIN_VALUE;
      int secondHigh = Integer.MIN_VALUE;

      for(int i = 0;i<integerArray.length;i++){

          if(firstHighest<integerArray[i]){
              secondHigh  = firstHighest;
              firstHighest=integerArray[i];
          }else if(secondHigh<integerArray[i] && integerArray[i]!=firstHighest){
              secondHigh=integerArray[i];
          }

//          if(firstHighest<=integerArray[i]){
//              secondHigh = firstHighest;
//              firstHighest=integerArray[i];
//          }
      }


        System.out.println("first highest number: "+firstHighest);
        System.out.println("Second highest number: "+secondHigh);
    }
}
