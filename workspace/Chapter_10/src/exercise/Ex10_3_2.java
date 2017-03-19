package exercise;
import lib.TextReader;
import lib.TextWriter;

public class Ex10_3_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String text = null;
		TextReader in = new TextReader("file03.txt");
		TextWriter out = new TextWriter("myCopy.txt");
		
		while((text = in.readLine()) != null){
			out.println(text);
		}
		in.close();
		out.close();
	}

}
