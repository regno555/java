package exercise;
import lib.Input;

public class Ex9_1_5 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int a = Input.getInt("����(a)����� = ");
		int b = Input.getInt("����(b)����� = ");
		double ans = a * a - b;
		
		if(ans >= 0){
			System.out.println("���ʂ́A���̒l�i��������0�j�� = " + ans);
		}else{
			System.out.println("���ʂ́A���̒l�� = " + ans);
		}
	}

}
