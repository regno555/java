package sample;

public class Sample11_4b {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("----- グラフ -----");
		int [] num = {8, 13, 17, 25, 16};
		for(int n : num){
			for(int i = 0; i < n; i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
