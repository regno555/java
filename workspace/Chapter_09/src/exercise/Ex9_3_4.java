package exercise;
import java.time.LocalTime;

public class Ex9_3_4 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		LocalTime time = LocalTime.now();
		LocalTime t12 = LocalTime.of(12, 0);
		LocalTime t13 = LocalTime.of(13, 0);
		if(time.isAfter(t12) && time.isBefore(t13)){
			System.out.println("���x��");
		}else{
			System.out.println("�c�ƒ�");
		}
	}

}
