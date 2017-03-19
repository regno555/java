package exercise;
import lib.Input;

public class Ex10_1_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sansei = 0, hantai = 0;
		int vote;
		while((vote = Input.getInt("1 または 2を入力 = ")) != 0){
			if(vote == 1){
				sansei += 1;
			}else if(vote ==2){
				hantai += 1;
			}
		}
		System.out.print("賛成 = " + sansei + "\t\t");
		System.out.print("反対 = " + hantai);
	}

}
