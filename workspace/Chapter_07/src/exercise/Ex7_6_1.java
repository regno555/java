package exercise;
import lib.TextReader;

public class Ex7_6_1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		TextReader in = new TextReader("myfile.txt");
		String text1 = in.readLine();
		String text2 = in.readLine();
		String text3 = in.readLine();
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		in.close();
	}

}
