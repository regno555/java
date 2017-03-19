package exercise;
import java.time.LocalTime;

public class Ex7_4_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalTime time = LocalTime.of(15, 30);
		LocalTime now = LocalTime.now();
		System.out.println("作成時刻 = " + time);
		System.out.println("現在時刻 = " + now);
		System.out.println("作成時刻は、現在時刻より前です？ = " + time.isBefore(now));
	}

}
