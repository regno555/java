package exercise;
import java.time.LocalTime;

public class Ex7_4_2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		LocalTime time = LocalTime.of(15, 30);
		LocalTime now = LocalTime.now();
		System.out.println("�쐬���� = " + time);
		System.out.println("���ݎ��� = " + now);
		System.out.println("�쐬�����́A���ݎ������O�ł��H = " + time.isBefore(now));
	}

}
