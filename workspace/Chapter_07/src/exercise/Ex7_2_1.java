package exercise;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex7_2_1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		LocalDate today = LocalDate.now();
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		DayOfWeek dw = today.getDayOfWeek();
		System.out.println(year + "�N" + month + "��" + day + "��" + dw);
	}

}
