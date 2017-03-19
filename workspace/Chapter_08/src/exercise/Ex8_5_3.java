package exercise;

public class Ex8_5_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] kokugo = {88, 58, 63, 95, 77};
		int total = 0;
		for (int i = 0; i < kokugo.length; i++){
			total += kokugo[i];
		}
		System.out.println("合計 = " + total);
		System.out.println("平均 = " + total / kokugo.length);
	}

}
