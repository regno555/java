package exercise;
import lib.Input;

import java.time.LocalDate;

public class Ex9_4_3 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		LocalDate today = LocalDate.now();
		int kazu = Input.getInt("�󒍐��ʂ���� = ");
		
		if(kazu >=300){
			System.out.println("���k");
		}else if(kazu >= 200){
			System.out.println("�o��" + today.plusDays(18));
		}else if(kazu >= 100){
			System.out.println("�o��" + today.plusDays(15));
		}else{
			System.out.println("�o��" + today.plusDays(10));
		}
		
	}

}
