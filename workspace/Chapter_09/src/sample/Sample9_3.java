package sample;
import lib.Input;

public class Sample9_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String name1 = Input.getString("名前1 = ");
		String name2 = Input.getString("名前2 = ");
		if(name1.equals(name2)){
			System.out.println("同じ名前です。");
		}else{
			System.out.println("違う名前です。");
		}
	}

}
