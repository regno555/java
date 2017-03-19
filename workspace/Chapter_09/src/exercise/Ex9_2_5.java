package exercise;
import java.time.LocalTime;

public class Ex9_2_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalTime time = LocalTime.now();
		LocalTime time12 = LocalTime.of(12, 0);
		
		if(time.isBefore(time12)){
			System.out.println("現在の時間は、 = " + time + " 午前です。");
		}else{
			System.out.println("現在の時間は、 = " + time + " 午後です。");
		}
	}

}
