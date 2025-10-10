package NotePadPro;
import java.util.Scanner;

public class AreYouEligibleToVote{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you age");
		int a = sc.nextInt();
		if(a<18){
		System.out.println("You are not eligibale to vote");	
		}else{
		System.out.println("You are eligibale to vote ");
		}
	}
}