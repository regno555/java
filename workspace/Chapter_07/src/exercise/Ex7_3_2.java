package exercise;
import java.time.LocalDate;

public class Ex7_3_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate date1 = LocalDate.of(2020, 04, 01);
		LocalDate date2 = date1.minusDays(600);
		int year = date2.getYear();
		int month = date2.getMonthValue();
		int day = date2.getDayOfMonth();
		System.out.println(year + "年" + month + "月" + day + "日");
		
	}

}
