package exercise;
import lib.Input;

public class Ex5_1_2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		double height, weight;
		
		height = Input.getDouble();
		weight = Input.getDouble();
		
		System.out.println(weight / (height * height));
	}

}
