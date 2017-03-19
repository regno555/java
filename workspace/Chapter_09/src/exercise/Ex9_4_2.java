package exercise;
import lib.Input;

public class Ex9_4_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String word = Input.getStr("単語を入力 = ");
		if(word.equals("プロパー")){
			System.out.println("親受け会社");
		}else if(word.equals("ぷらぷら")){
			System.out.println("C++言語");
		}else if(word.equals("なると")){
			System.out.println("@");
		}else{
			System.out.println("???");
		}
	}

}
