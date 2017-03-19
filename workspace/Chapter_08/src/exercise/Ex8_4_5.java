package exercise;

public class Ex8_4_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] n1 = {12, 11, 31, 51, 72};
		int [] n2 = {26, 14, 12, 22, 12};
		int sum;
		
		for (int i = 0; i < n1.length; i++){
			sum = n1[i] + n2[i];
			System.out.println("NO-" + i + " 合計 = " + sum);
		}
	}

}
