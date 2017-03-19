package exercise;

public class Ex10_5_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] number = {34, 45, 88, 22, 18, 45, 32, 16};
		for(int n : number){
			if((n % 3) == 0){
				System.out.print(n + "\t");
			}
		}
	}

}
