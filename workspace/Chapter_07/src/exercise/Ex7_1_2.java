package exercise;
import lib.Input;
import java.time.LocalDate;

public class Ex7_1_2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int year = Input.getInt("�N = ");
		int month = Input.getInt("�� = ");
		int day = Input.getInt("�� = ");
		
		LocalDate date = LocalDate.of(year,  month,  day);
		System.out.println("�����́@" + date + " �ł��B");
		
	}

}
