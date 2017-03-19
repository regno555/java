package exercise;
import lib.Input;

import java.time.LocalDate;

public class Ex9_4_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate today = LocalDate.now();
		int kazu = Input.getInt("受注数量を入力 = ");
		
		if(kazu >=300){
			System.out.println("相談");
		}else if(kazu >= 200){
			System.out.println("出荷" + today.plusDays(18));
		}else if(kazu >= 100){
			System.out.println("出荷" + today.plusDays(15));
		}else{
			System.out.println("出荷" + today.plusDays(10));
		}
		
	}

}
