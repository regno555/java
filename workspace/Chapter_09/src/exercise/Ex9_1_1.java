package exercise;
import lib.Input;

public class Ex9_1_1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int number;
		number = Input.getInt("��������́i100�ȏォ����j = ");
		System.out.print("���͒l�́A100�ȏ� = ");
		System.out.println(number >= 100);
		
		System.out.print("���͒l�́A50���� = ");
		System.out.println(number < 50);
		
		System.out.print("���͒l�́A200�ɓ����� = ");
		System.out.println(number == 200);
		
		System.out.print("���͒l�́A7�̔{�� = ");
		System.out.println(number % 7 == 0);
		
		double data;
		data = Input.getInt("��������́i��������2.0���傫���H������j = ");
		System.out.print("��������2.0���傫�� = ");
		System.out.println(Math.sqrt(data) > 2.0);
		
		double data1, data2;
		data1 = Input.getDouble("data1 ����� = ");
		data2 = Input.getDouble("data2����� = ");
		if(data1 == data2){
			System.out.println("data1 �� data2�@�́A�������ł��B");
		}else{
			System.out.println("data1 �� data2 �́A�����łȂ��ł��B");
		}
		if(data1 <= Math.pow(data2, 3)){
			System.out.println("data1 �́A data2��3���肿�������B");
		}else{
			System.out.println("data1 �́Adata2�̂R��ȏ�B");
		}
			
	}

}
