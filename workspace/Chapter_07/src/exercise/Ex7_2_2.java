package exercise;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex7_2_2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		LocalDate day = LocalDate.parse("2017-02-27");
		DayOfWeek dw = day.getDayOfWeek();
		
		System.out.println("���t = " + day);
		System.out.println("�j���i���{��) = " + dw.getDisplayName(TextStyle.FULL, Locale.JAPAN));
		System.out.println("�j��(������) = " + dw.getDisplayName(TextStyle.FULL, Locale.CHINA));
		System.out.println("�j��(�t�����X��) = " + dw.getDisplayName(TextStyle.FULL, Locale.FRANCE));
	}

}
