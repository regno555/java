package sample;
import lib.TextReader;

public class Sample10_4 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		TextReader in = new TextReader("file04.txt");
		String csv;
		while((csv = in.readLine()) != null){
			String [] dt = csv.split(",");
			String name = dt[0];
			String address = dt[1];
			int age = Integer.valueOf(dt[2]);
			System.out.printf("%-5s %2d %-3s\n", name, age, address);
		}
		in.close();
	}

}
