import java.util.*;
class Task2{
	public static void main(String args[]){
		int tel,hin,eng,math,sci,soc;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Telugu Marks : ");
		tel = sc.nextInt();
		System.out.print("Enter Hindi Marks : ");
		hin = sc.nextInt();
		System.out.print("Enter English Marks : ");
		eng = sc.nextInt();
		System.out.print("Enter Maths Marks : ");
		math = sc.nextInt();
		System.out.print("Enter Science Marks : ");
		sci = sc.nextInt();
		System.out.print("Enter Social Marks : ");
		soc = sc.nextInt();
		
		System.out.println();System.out.println();System.out.println();

		int sum = tel + hin + eng + math + sci + soc;
		System.out.println("Sum of total subjects is : " +sum);

		float avg = sum/6;
		System.out.println("Average marks of all subjects is : " +avg);

		if(avg>=90){
			System.out.println("A Grade");
		}else if(avg>=75 && avg<90){
			System.out.println("B Grade");
		}else if(avg>=60 && avg<75){
			System.out.println("C Grade");
		}else if(avg>=40 && avg<60){
			System.out.println("D Grade");
		}else{
			System.out.println("Fail");
		}
	}
}