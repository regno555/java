package exercise;
import lib.Input;
import lib.TextWriter;

public class Ex7_5_4 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int number;
		double value;
		boolean result;
		
		TextWriter out = new TextWriter("value.txt");
		
		number = Input.getInt("int�^�̒l����� = ");
		value = Input.getDouble("double�^�̒l����� = ");
		result = Input.getBoolean("boolean�^�̒l����� = ");
		
		out.println(number);
		out.println(value);
		out.println(result);
		out.close();
		
	}

}
