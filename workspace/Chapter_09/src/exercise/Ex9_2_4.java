package exercise;
import lib.Input;

public class Ex9_2_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String password = Input.getString("パスワード = ");
		if(password.equals("superman")){
			System.out.println("Welcome !");
		}else{
			System.out.println("Incorrect !");
		}
	}

}
