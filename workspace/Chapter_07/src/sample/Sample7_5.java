package sample;
import java.time.LocalDate;

public class Sample7_5 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		LocalDate today = LocalDate.now();
		LocalDate newDay = today.plusDays(5);	//5����̓��t�𓾂�
		System.out.println(today);
		System.out.println(newDay);
		
	}

}
