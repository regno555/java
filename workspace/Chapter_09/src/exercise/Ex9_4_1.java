package exercise;
import lib.Input;

public class Ex9_4_1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		double weight = Input.getDouble("�d�ʂ���� = ");
		
		if(weight >= 5){
			System.out.println(weight + "��舵���Ȃ�");
		}else if(weight >= 4){
			System.out.println(weight + "kg 700�~");
		}else if(weight >= 2){
			System.out.println(weight + "kg 500�~");
		}else{
			System.out.println(weight + "kg 300�~");
		}
	}

}
