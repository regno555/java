package exercise;
import java.time.LocalTime;

public class Ex9_2_5 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		LocalTime time = LocalTime.now();
		LocalTime time12 = LocalTime.of(12, 0);
		
		if(time.isBefore(time12)){
			System.out.println("���݂̎��Ԃ́A = " + time + " �ߑO�ł��B");
		}else{
			System.out.println("���݂̎��Ԃ́A = " + time + " �ߌ�ł��B");
		}
	}

}
