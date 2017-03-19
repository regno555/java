package exercise;
import java.time.LocalDate;
import lib.TextReader;

public class Ex10_4_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String csv;
		TextReader in = new TextReader("file05.txt");
		while((csv = in.readLine()) != null){
			String [] dt = csv.split(",");
			String title = dt[0];
			String author = dt[1];
			String publisher = dt[2];
			LocalDate date = LocalDate.parse(dt[3]);
			System.out.printf("%-7s\t%-6s\t%-5s\t%-10s\n", title, author, publisher, date);
		}
		in.close();
	}

}
