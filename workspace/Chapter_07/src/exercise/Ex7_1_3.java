package exercise;
import java.time.LocalDate;

import lib.Input;

public class Ex7_1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = Input.getString("日付 [XXXX-XX-XX] = ");
		LocalDate date = LocalDate.parse(str);
		System.out.println("日付 = " + date);
	}

}
