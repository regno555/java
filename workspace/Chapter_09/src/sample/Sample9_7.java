package sample;

import lib.Input;

public class Sample9_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int error = Input.getInt("エラーコード番号 = ");
		switch(error){
		case 401:
			System.out.println("Bad Request");
			break;
		case 403:
			System.out.println("Forbidden");
			break;
		case 500:
			System.out.println("Internal Server Error");
			break;
		default:
			System.out.println("Error");
		}
		
	}

}
