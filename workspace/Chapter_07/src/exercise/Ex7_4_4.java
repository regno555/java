package exercise;
import java.time.LocalDateTime;

public class Ex7_4_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDateTime datetime1 = LocalDateTime.now();
		LocalDateTime datetime2 = datetime1.plusDays(2);
		LocalDateTime datetime3 = datetime2.plusHours(6);
		int year = datetime3.getYear();
		int month = datetime3.getMonthValue();
		int date = datetime3.getDayOfMonth();
		int hour = datetime3.getHour();
		int minute = datetime3.getMinute();
		int second = datetime3.getSecond();
		System.out.println(year + "年" + month + "月" + date + "日 " + hour + "時" + minute + "分" + second + "秒");
	}

}
