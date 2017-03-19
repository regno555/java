package exercise;
import lib.Input;
import java.time.LocalDate;

public class Ex7_1_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int year = Input.getInt("年 = ");
		int month = Input.getInt("月 = ");
		int day = Input.getInt("日 = ");
		
		LocalDate date = LocalDate.of(year,  month,  day);
		System.out.println("今日は　" + date + " です。");
		
	}

}
