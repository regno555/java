package exercise;
import java.time.LocalTime;

public class Ex9_3_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalTime time = LocalTime.now();
		LocalTime t12 = LocalTime.of(12, 0);
		LocalTime t13 = LocalTime.of(13, 0);
		if(time.isAfter(t12) && time.isBefore(t13)){
			System.out.println("昼休み");
		}else{
			System.out.println("営業中");
		}
	}

}
