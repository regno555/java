package sample;

import java.time.LocalDate;

public class Sample7_6 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		LocalDate day1 = LocalDate.of(2020, 1, 10);
		LocalDate day2 = LocalDate.of(2019, 12, 6);
		boolean b1 = day1.isAfter(day2);
		boolean b2 = day1.isBefore(day2);
		boolean b3 = day1.isEqual(day2);
		System.out.println("2020-01-10�́A2019-12-06����̓��t���H = " + b1);
		System.out.println("2020-01-10�́A2019-12-06���O�̓��t���H = " + b2);
		System.out.println("2020-01-10�́A2019-12-06�Ɠ������t���H = " + b3);
	}

}
