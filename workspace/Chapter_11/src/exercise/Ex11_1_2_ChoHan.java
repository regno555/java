package exercise;

public class Ex11_1_2_ChoHan {
	public static void printChoHan(){
		double rand = Math.random();
		if(rand >= 0.5){
			System.out.println("���� = " + rand + "�F��(0.5�ȏ�)");
		}else{
			System.out.println("���� = " + rand + "�F��(0.5����)");
		}
	}
}
