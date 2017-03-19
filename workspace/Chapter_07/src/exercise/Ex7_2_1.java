package exercise;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex7_2_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate today = LocalDate.now();
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		DayOfWeek dw = today.getDayOfWeek();
		System.out.println(year + "年" + month + "月" + day + "日" + dw);
	}

}
