package sample;
import lib.TextReader;

public class Sample10_3 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		String text;
		TextReader in = new TextReader("file03.txt");
		while((text = in.readLine()) != null){
			System.out.println(text);
		}
	}

}
