package exercise;

import java.time.LocalDate;

public class Ex11_3_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate today = LocalDate.now();
		String youbi_mei = Ex11_3_4_Hizuke.youbi(today);
		System.out.println("日付 = " + today + " 曜日 = " + youbi_mei);
	}

}
