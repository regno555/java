package sample;
import java.time.LocalDateTime;

public class Sample7_8 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("���݂̓��t�{���� = " + datetime);
		LocalDateTime datetime_minus3days = datetime.minusDays(3);
		System.out.println("���݂̓��t�{���� = " + datetime_minus3days);
	}

}
