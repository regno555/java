package sample;
import java.time.LocalDate;
import lib.Input;

public class Sample9_4 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		LocalDate date1 = LocalDate.of(2020,  1, 1);
		int y = Input.getInt("�N");
		int m = Input.getInt("��");
		int d = Input.getInt("��");
		LocalDate date2 = LocalDate.of(y, m, d);
		if(date1.isEqual(date2)){
			System.out.println("�������t�ł��B");
		}else{
			System.out.println("�Ⴄ���t�ł��B");
		}
	}

}
