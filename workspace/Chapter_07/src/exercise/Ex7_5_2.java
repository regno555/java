package exercise;
import lib.Input;
import lib.TextWriter;

public class Ex7_5_2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		TextWriter out = new TextWriter("renshu.txt");
		String text = Input.getString("��������� = ");
		out.println(text);
		out.close();
	}

}
