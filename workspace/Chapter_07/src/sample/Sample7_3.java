package sample;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Sample7_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		LocalDate today = LocalDate.now();
		int year = today.getYear();			//年を取り出す
		int month = today.getMonthValue();	//月を取り出す
		int day = today.getDayOfMonth();	//日を取り出す
		DayOfWeek dw = today.getDayOfWeek();//曜日（英字）を取り出す
		System.out.println(year + "年" + month + "月" + day + "日" + dw);
	}

}
