package exercise;
import lib.TextReader;

public class Ex10_4_2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		TextReader in = new TextReader("file10.txt");
		String csv = null;
		int total = 0;
		while((csv = in.readLine()) != null){
			String [] dt = csv.split(",");
			int tanka = Integer.valueOf(dt[1]);
			int suuryou = Integer.valueOf(dt[2]);
			total += tanka * suuryou;
		}
		System.out.printf("���v = %,10d�~", total);
	}

}
