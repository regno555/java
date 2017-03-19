package exercise;

public class Ex6_1_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 10, ans;
		++num;	//num = 11
		System.out.print(num + "\t");	//11
		num++;	//num = 12
		System.out.print(num + "\t");	//12
		ans = ++num;
		System.out.print(ans + "\t");	//13
		ans = num++;
		System.out.print(ans + "\t");	//13
	}

}
