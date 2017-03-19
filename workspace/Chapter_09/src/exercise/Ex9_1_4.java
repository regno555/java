package exercise;

public class Ex9_1_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double rand = Math.random();
		if(rand >= 0.5){
			System.out.println("値 = (" + rand + ") 0.5以上なので大当たり!");
		}else{
			System.out.println("値 = (" + rand + ") 0.5未満ので外れ!");
		}
	}

}
