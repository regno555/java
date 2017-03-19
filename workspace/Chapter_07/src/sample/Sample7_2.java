package sample;
import java.time.LocalDate;

public class Sample7_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate day1 = LocalDate.of(2017,  2,  23);
		System.out.println("day1 = " + day1);
		LocalDate day2 = LocalDate.parse("2017-02-24");
		System.out.println("day2 = " + day2);
	}

}
