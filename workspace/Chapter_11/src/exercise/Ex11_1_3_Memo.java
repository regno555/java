package exercise;
import lib.TextReader;

public class Ex11_1_3_Memo {
	public static void printMemo(){
		TextReader in = new TextReader("file08.txt");
		String text;
		while((text = in.readLine()) != null){
			System.out.println(text);
		}
		in.close();
	}
}
