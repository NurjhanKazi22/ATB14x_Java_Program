package NotePadPro;
import java.util.Scanner;

public class PosNeg{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if(a<0){
		System.out.printf("%d is negative",a);	
		}else{
		System.out.printf("%d is positive",a);
		}
	}
}
