package exercise;
import lib.Input;

public class Ex5_3_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String name = Input.getString("名前");
		String place = Input.getString("出身");
		int age = Input.getInt("年齢");
		
		System.out.println("名前" + "\t" + "出身" + "\t" + "年齢");
		System.out.print(name + "\t");
		System.out.print(place + "\t");
		System.out.print(age + "\t");
		
	}

}
