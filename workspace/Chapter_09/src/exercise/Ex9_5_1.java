package exercise;
import lib.Input;

public class Ex9_5_1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		String seiza = Input.getString("��������� = ");
		switch (seiza){
		case "���Ђ���":
			System.out.println("Aries");
			break;
		case "��������":
			System.out.println("Taurus");
			break;
		case "�ӂ�����":
			System.out.println("Gemini");
			break;
		case "���ɍ�":
			System.out.println("Cancer");
			break;
		case "������":
			System.out.println("Leo");
			break;
		case "���Ƃߍ�":
			System.out.println("Virgo");
			break;
		case "�Ă�т��":
			System.out.println("Libra");
			break;
		case "�������":
			System.out.println("Scorpio");
			break;
		case "���č�":
			System.out.println("Sagittarius");
			break;
		case "�€��":
			System.out.println("Capricorn");
			break;
		case "�݂����ߍ�":
			System.out.println("Aquarius");
			break;
		case "������":
			System.out.println("Pisces");
			break;
		default:
			System.out.println("???");
		}
	}

}
