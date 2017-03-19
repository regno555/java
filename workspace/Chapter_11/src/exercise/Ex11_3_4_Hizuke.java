package exercise;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex11_3_4_Hizuke {
	public static void printToday(){
		LocalDate today = LocalDate.now();
		System.out.println(today);	
	}
	public static String youbi(LocalDate date){
		String youbiValue = null;
		DayOfWeek dw = date.getDayOfWeek();
		youbiValue = dw.getDisplayName(TextStyle.FULL, Locale.JAPAN);
		return youbiValue;
	}
}
