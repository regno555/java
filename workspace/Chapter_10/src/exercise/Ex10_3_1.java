package exercise;
import lib.TextReader;

public class Ex10_3_1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int total = 0;
		String text ;
		TextReader in = new TextReader("file03.txt");
		while((text = in.readLine()) != null){
			total += text.length();
		}
		System.out.println("���v������ = " + total);
	}

}
