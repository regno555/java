package exercise;

public class Ex11_2_2_ChoHan {
	public static void printChoHan(){
		double rand = Math.random();
		if(rand >= 0.5){
			System.out.println("���� = " + rand + "�F��(0.5�ȏ�)");
		}else{
			System.out.println("���� = " + rand + "�F��(0.5����)");
		}
	}
	public static void printChoHan(String bet){
		double rand = Math.random();
		String s = rand >= 0.5 ? "��" : "��";
		if(s.equals(bet)){
			System.out.println("���� = " + rand + "���� = " + bet + " ����āA�哖����");
		}else{
			System.out.println("����= " + rand + "���� = " + bet + "����āA�͂���");
		}
	}
}
