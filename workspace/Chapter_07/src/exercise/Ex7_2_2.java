package exercise;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex7_2_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate day = LocalDate.parse("2017-02-27");
		DayOfWeek dw = day.getDayOfWeek();
		
		System.out.println("日付 = " + day);
		System.out.println("曜日（日本語) = " + dw.getDisplayName(TextStyle.FULL, Locale.JAPAN));
		System.out.println("曜日(中国語) = " + dw.getDisplayName(TextStyle.FULL, Locale.CHINA));
		System.out.println("曜日(フランス語) = " + dw.getDisplayName(TextStyle.FULL, Locale.FRANCE));
	}

}
