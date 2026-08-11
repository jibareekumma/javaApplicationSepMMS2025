import java.util.Scanner;

public class SentlineRepition {
	public static void main(String args){
	
		Scanner scan = new Scanner(System.in);
		int num;
		int sum = 0;
		
		System.out.println("Enter -1 to end the input");
		while(true){
            System.out.print("Enter a number: ");
            num = scan.nextInt();      

            if (num == -1) {           
                break;                 
            }

            sum = sum + num; 
        }

        System.out.println("The sum is: " + sum);

        scan.close();
    
	}
}