package sample;
import lib.Input;

public class Sample9_1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		double data = Input.getDouble();
		if(data >=0){
			double sqrt = Math.sqrt(data);
			System.out.println("������ = " + sqrt);
		}else{
			System.out.println("�s���ȃf�[�^�ł��B");
		}
	}

}
