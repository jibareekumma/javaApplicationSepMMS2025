import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
imoport java.time.format.DateTimeFormatter;


public class UsingDateTimeFormatter{
	public static void main(String[] args){
		
		LocalDate today = LocalDate.now();
		
		System.out.println("dd : " + 
			now.format(DateTimeFormatter.ofPattern("dd")));
			
		System.out.println("MM : " + 
			now.format(DateTimeFormatter.ofPattern("MM")));
			
		System.out.println("MMM : " + 
			now.format(DateTimeFormatter.ofPattern("MMM")));
			
		System.out.println("MMMM : " + 
			now.format(DateTimeFormatter.ofPattern("MMMM")));
			
			
		)
	}
}