package exercise;
import java.time.LocalTime;

public class Ex7_4_1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();
		
		System.out.println(hour + "��" + minute + "��" + second + "�b");
	}

}
