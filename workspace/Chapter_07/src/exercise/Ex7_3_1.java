package exercise;
import java.time.LocalDate;

public class Ex7_3_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = date1.plusWeeks(1);
		System.out.println("今日の日付 = " + date1 + "の1週間後は、" + date2);
		
	}

}
