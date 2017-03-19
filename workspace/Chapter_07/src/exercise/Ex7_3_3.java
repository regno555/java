package exercise;
import lib.Input;
import java.time.LocalDate;

public class Ex7_3_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int year;
		int month;
		int day;
		year = Input.getInt("年 = ");
		month = Input.getInt("月 = ");
		day = Input.getInt("日 = ");
		LocalDate date1 = LocalDate.of(year, month, day);
		System.out.println("日付1 = " + date1);
		
		year = Input.getInt("年 = ");
		month = Input.getInt("月 = ");
		day = Input.getInt("日 = ");
		LocalDate date2 = LocalDate.of(year, month, day);
		System.out.println("日付 = " + date2);
		
		System.out.println("日付1 = " + date1 + "は、 日付2 = " + date2 + "と比較して前ですか？ = " + date1.isBefore(date2));
		
	}

}
