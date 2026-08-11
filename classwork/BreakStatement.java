public class BreakStatement{
	public static void main(String[] args){
	
		for(int x = 1; x <= 25; x++){
			System.out.printf("%d%n",x);
			if(x == 15){
				break;
			}
		}
	}
}