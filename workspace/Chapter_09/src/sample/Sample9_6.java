package sample;

import lib.Input;

public class Sample9_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int score = Input.getInt("点数を入力 = ");
		if(score >=90){
			System.out.println(score + "点 AA");
		}else if(score >= 70){
			System.out.println(score + "点 A");
		}else if(score >= 60){
			System.out.println(score + "点 B");
		}else{
			System.out.println(score + "点 C");
		}
	}

}
