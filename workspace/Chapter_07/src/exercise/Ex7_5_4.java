package exercise;
import lib.Input;
import lib.TextWriter;

public class Ex7_5_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number;
		double value;
		boolean result;
		
		TextWriter out = new TextWriter("value.txt");
		
		number = Input.getInt("int型の値を入力 = ");
		value = Input.getDouble("double型の値を入力 = ");
		result = Input.getBoolean("boolean型の値を入力 = ");
		
		out.println(number);
		out.println(value);
		out.println(result);
		out.close();
		
	}

}
