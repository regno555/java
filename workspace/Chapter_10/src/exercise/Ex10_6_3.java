package exercise;

public class Ex10_6_3 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int [] num = {25, 109, 15, -29, 221, 55};
		int total = 0;
//		for(int i = 0; i < num.length; i++){
//			if(num[i] < 0 || num[i] > 100){
//				continue;
//			}
//			total += num[i];
//		}
		for(int n: num){
			if(n < 0 || n >= 100){
				continue;
			}
			total += n;
		}
		System.out.println("0�ȏ�100�܂ł̐��l�̍��v = " + total);
	}

}