package exercise;
import lib.Input;

public class Ex9_5_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String seiza = Input.getString("星座を入力 = ");
		switch (seiza){
		case "おひつじ座":
			System.out.println("Aries");
			break;
		case "おうし座":
			System.out.println("Taurus");
			break;
		case "ふたご座":
			System.out.println("Gemini");
			break;
		case "かに座":
			System.out.println("Cancer");
			break;
		case "しし座":
			System.out.println("Leo");
			break;
		case "おとめ座":
			System.out.println("Virgo");
			break;
		case "てんびん座":
			System.out.println("Libra");
			break;
		case "さそり座":
			System.out.println("Scorpio");
			break;
		case "いて座":
			System.out.println("Sagittarius");
			break;
		case "やぎ座":
			System.out.println("Capricorn");
			break;
		case "みずがめ座":
			System.out.println("Aquarius");
			break;
		case "うお座":
			System.out.println("Pisces");
			break;
		default:
			System.out.println("???");
		}
	}

}
