package sample;
import java.time.LocalTime;

public class Sample7_7 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		LocalTime time = LocalTime.of(7, 15, 30);
		System.out.println("�ݒ莞�� = " + time);
		LocalTime time_plus = time.plusHours(3);
		System.out.println("�ݒ莞����3���Ԍ� = " + time_plus);
		
	}

}
