package sample;

import lib.Input;

public class Sample9_6 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int score = Input.getInt("�_������� = ");
		if(score >=90){
			System.out.println(score + "�_ AA");
		}else if(score >= 70){
			System.out.println(score + "�_ A");
		}else if(score >= 60){
			System.out.println(score + "�_ B");
		}else{
			System.out.println(score + "�_ C");
		}
	}

}
