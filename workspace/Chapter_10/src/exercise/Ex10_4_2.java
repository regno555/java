package exercise;
import lib.TextReader;

public class Ex10_4_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TextReader in = new TextReader("file10.txt");
		String csv = null;
		int total = 0;
		while((csv = in.readLine()) != null){
			String [] dt = csv.split(",");
			int tanka = Integer.valueOf(dt[1]);
			int suuryou = Integer.valueOf(dt[2]);
			total += tanka * suuryou;
		}
		System.out.printf("合計 = %,10d円", total);
	}

}
