package Exercises;

public class MaxThreeUsingternaryOp {
    public static void main(String[] args) {
        //Interview - Zeta → (AT) Ter nested → Max between 3 numbers →
        int n1 = 2; int n2 = 9;  int n3 = -11;
        int max = (n1>n2 && n1>n3) ? n1:(n2>n1 && n2>n3)?n2:n3;
        System.out.println(max);



    }
}
