package exercise;
import lib.Input;
import java.time.LocalDate;

public class Ex7_3_3 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int year;
		int month;
		int day;
		year = Input.getInt("�N = ");
		month = Input.getInt("�� = ");
		day = Input.getInt("�� = ");
		LocalDate date1 = LocalDate.of(year, month, day);
		System.out.println("���t1 = " + date1);
		
		year = Input.getInt("�N = ");
		month = Input.getInt("�� = ");
		day = Input.getInt("�� = ");
		LocalDate date2 = LocalDate.of(year, month, day);
		System.out.println("���t = " + date2);
		
		System.out.println("���t1 = " + date1 + "�́A ���t2 = " + date2 + "�Ɣ�r���đO�ł����H = " + date1.isBefore(date2));
		
	}

}
