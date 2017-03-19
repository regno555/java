package exercise;
import java.time.LocalTime;

public class Ex7_4_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();
		
		System.out.println(hour + "時" + minute + "分" + second + "秒");
	}

}
