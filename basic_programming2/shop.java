import java.util.*;
public class shop{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int cost =sc.nextInt();
		int sell =sc.nextInt();
		int profit = sell-cost;
		double avg = (profit/cost)*100;
		System.out.println("profit percentage:"+avg);
	}
}
		