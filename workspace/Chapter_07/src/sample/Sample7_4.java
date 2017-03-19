package sample;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Sample7_4 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		LocalDate today = LocalDate.now();
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		DayOfWeek dw = today.getDayOfWeek();
		String dayw = dw.getDisplayName(TextStyle.FULL, Locale.CHINA);
		System.out.println(year + "�N" + month + "��" + day + "��" + dayw);
	}

}
