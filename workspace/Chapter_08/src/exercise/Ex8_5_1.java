package exercise;

public class Ex8_5_1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		double [] height = {175.2, 170.3, 182.6, 168.5, 155.1};
		double total = 0;
		for (int i = 0; i < height.length; i++){
			total += height[i];
		}
		System.out.println("���v = " + total);
	}

}
