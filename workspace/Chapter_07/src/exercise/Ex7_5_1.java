package exercise;
import lib.TextWriter;

public class Ex7_5_1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		TextWriter out = new TextWriter("myfile.txt");
		out.println("Java����̓C���^�[�l�b�g�ł����Ƃ��֐S�x�̍�������ł��B");
		out.println("�I�u�W�F�N�g�w���͌���I�ȃv���O���~���O����̓����ł��B");
		out.println("JavaEE�̔��W�ɂ��A�E�F�u�V�X�e���̊J�����e�ՂɂȂ�܂����B");
		out.close();
	}

}
