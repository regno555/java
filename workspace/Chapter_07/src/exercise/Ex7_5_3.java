package exercise;
import java.time.LocalDateTime;
import lib.TextWriter;

public class Ex7_5_3 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		TextWriter out = new TextWriter("today.txt");
		LocalDateTime today = LocalDateTime.now();
		out.println(today);
		out.close();
	}

}
