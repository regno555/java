package exercise;
import java.time.LocalTime;

public class Ex8_2_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalTime time;
		
		for (int i = 1; i <= 50; i++){
			time = LocalTime.now();
			System.out.println("i = " + i + "\t" + time);
		}
	}

}
