package exercise;
import lib.Input;

public class Ex10_1_4 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int sansei = 0, hantai = 0;
		int vote;
		while((vote = Input.getInt("1 �܂��� 2����� = ")) != 0){
			if(vote == 1){
				sansei += 1;
			}else if(vote ==2){
				hantai += 1;
			}
		}
		System.out.print("�^�� = " + sansei + "\t\t");
		System.out.print("���� = " + hantai);
	}

}
