package exercise;

public class Ex11_2_2_ChoHan {
	public static void printChoHan(){
		double rand = Math.random();
		if(rand >= 0.5){
			System.out.println("乱数 = " + rand + "：丁(0.5以上)");
		}else{
			System.out.println("乱数 = " + rand + "：半(0.5未満)");
		}
	}
	public static void printChoHan(String bet){
		double rand = Math.random();
		String s = rand >= 0.5 ? "丁" : "半";
		if(s.equals(bet)){
			System.out.println("乱数 = " + rand + "入力 = " + bet + " よって、大当たり");
		}else{
			System.out.println("乱数= " + rand + "入力 = " + bet + "よって、はずれ");
		}
	}
}
