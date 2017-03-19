package exercise;

public class Ex10_5_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String [] city = {"札幌", "東京", "大阪", "福岡"};
		String cities = "";
		for(String s : city){
			System.out.println(s);
			cities += s;
		}
		System.out.println(cities);
	}

}
