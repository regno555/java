package sample;

public class Sample11_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("----- グラフ -----");
		dispGraph(8, 13, 17, 25, 16);
	}

	public static void dispGraph(int... data){
		for(int n : data){
			graph(n);
		}
	}
	
	public static void graph(int n){
		for(int i = 0; i < n; i++){
			System.out.print("*");
		}
		System.out.println();
	}
}
