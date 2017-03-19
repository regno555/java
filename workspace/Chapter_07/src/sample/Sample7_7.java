package sample;
import java.time.LocalTime;

public class Sample7_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalTime time = LocalTime.of(7, 15, 30);
		System.out.println("設定時刻 = " + time);
		LocalTime time_plus = time.plusHours(3);
		System.out.println("設定時刻の3時間後 = " + time_plus);
		
	}

}
