package exercise;
import lib.Input;;

public class Ex10_2_2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int orange = 0, banana = 0, other = 0;
		String name;
		while((name = Input.getString("orange �܂��� banana �܂��� ����ȊO�̕�������� = ")) != null){
			if(name.equals("orange")){
				++orange;
			}else if(name.equals("banana")){
				++banana;
			}else{
				++other;
			}
		}
		System.out.println("orange = " + orange + " : banana = " + banana + " : other = " + other);
	}

}
