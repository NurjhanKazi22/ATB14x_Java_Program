package Exercises;

public class patternProgramLogic {
    public static void main(String[] args) {
        // Right triangle
        for(int i=0;i<=2;i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Inverted right triangle
        for(int i=2;i>=0;i--){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //mirror of right angle triangle
        int n=3;
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++){
                System.out.print("-");
            }
            for (int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
