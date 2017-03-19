package sample;
import java.time.LocalDateTime;

public class Sample7_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("現在の日付＋時刻 = " + datetime);
		LocalDateTime datetime_minus3days = datetime.minusDays(3);
		System.out.println("現在の日付＋時刻 = " + datetime_minus3days);
	}

}
