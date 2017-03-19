package sample;
import java.time.LocalDate;
import lib.Input;

public class Sample9_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate date1 = LocalDate.of(2020,  1, 1);
		int y = Input.getInt("年");
		int m = Input.getInt("月");
		int d = Input.getInt("日");
		LocalDate date2 = LocalDate.of(y, m, d);
		if(date1.isEqual(date2)){
			System.out.println("同じ日付です。");
		}else{
			System.out.println("違う日付です。");
		}
	}

}
