package sample;

import java.time.LocalDate;

public class Sample7_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate day1 = LocalDate.of(2020, 1, 10);
		LocalDate day2 = LocalDate.of(2019, 12, 6);
		boolean b1 = day1.isAfter(day2);
		boolean b2 = day1.isBefore(day2);
		boolean b3 = day1.isEqual(day2);
		System.out.println("2020-01-10は、2019-12-06より後の日付か？ = " + b1);
		System.out.println("2020-01-10は、2019-12-06より前の日付か？ = " + b2);
		System.out.println("2020-01-10は、2019-12-06と同じ日付か？ = " + b3);
	}

}
