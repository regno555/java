package sample;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Sample7_3 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		LocalDate today = LocalDate.now();
		int year = today.getYear();			//�N�����o��
		int month = today.getMonthValue();	//�������o��
		int day = today.getDayOfMonth();	//�������o��
		DayOfWeek dw = today.getDayOfWeek();//�j���i�p���j�����o��
		System.out.println(year + "�N" + month + "��" + day + "��" + dw);
	}

}
