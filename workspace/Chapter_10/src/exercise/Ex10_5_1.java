package exercise;

public class Ex10_5_1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		double [] data = {12.5, 7.2, 5.6, 15.0, 9.1};
		double total = 0;
		for(double d : data){
			total += d;
		}
		System.out.printf("���v = %4.1f\n", total);
		System.out.printf("���� = %4.1f", total / data.length);
	}

}
