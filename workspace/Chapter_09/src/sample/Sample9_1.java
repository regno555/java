package sample;
import lib.Input;

public class Sample9_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double data = Input.getDouble();
		if(data >=0){
			double sqrt = Math.sqrt(data);
			System.out.println("平方根 = " + sqrt);
		}else{
			System.out.println("不正なデータです。");
		}
	}

}
