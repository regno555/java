package exercise;
import lib.TextWriter;

public class Ex7_5_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TextWriter out = new TextWriter("myfile.txt");
		out.println("Java言語はインターネットでもっとも関心度の高い言語です。");
		out.println("オブジェクト指向は現代的なプログラミング言語の特徴です。");
		out.println("JavaEEの発展により、ウェブシステムの開発が容易になりました。");
		out.close();
	}

}
