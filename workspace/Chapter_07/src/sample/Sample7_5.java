package sample;
import java.time.LocalDate;

public class Sample7_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate today = LocalDate.now();
		LocalDate newDay = today.plusDays(5);	//5日後の日付を得る
		System.out.println(today);
		System.out.println(newDay);
		
	}

}
