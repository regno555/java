package exercise;
import lib.TextReader;

public class Ex7_6_3 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		TextReader in = new TextReader("today.txt");
		String today = in.readLine();
		System.out.println(today);
		in.close();
	}

}
