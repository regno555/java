package exercise;
import lib.Input;

public class Ex9_3_3 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int kokugo = Input.getInt("����̓_������� = ");
		int suugaku = Input.getInt("���w�̓_������� = ");
		double heikin = (kokugo + suugaku) / 2; 
		
		if((heikin >= 60) && (!((kokugo < 50) || (suugaku < 50)))){
			System.out.println("���i");
		}else{
			System.out.println("�s���i");
		}
	}

}
