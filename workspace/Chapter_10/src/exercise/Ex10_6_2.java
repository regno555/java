package exercise;
import lib.Input;

public class Ex10_6_2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int num, total = 0;
		while((num = Input.getInt("��������� = ")) != 0){
			if(total + num > 100){
				
				continue;
			}
			total += num;
		}
		System.out.println("100�𒴂���O�܂ł̍��v = " + total);
	}

}