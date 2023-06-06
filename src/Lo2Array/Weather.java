package Lo2Array;
import java.util.*;
public class Weather {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("How many days'temperatures?");
	int days=sc.nextInt();
	int[]temps=new int[days];
	int sum=0;
	for(int i=0; i < days; i++) {
		System.out.print("Day"+(i+1)+" 's high temp:");
		temps[i]=sc.nextInt();
		sum+=temps[i];
	}
	double average =(double)sum/days;
	int count=0;
	for(int i = 0; i < days; i++) {
		if(temps[i]>average)
		{count++;}
	}
	System.out.println("Average temp= "+average);
	System.out.println(count+ "days above average");
	}
}
