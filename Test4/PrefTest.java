import java.awt.*;
import java.awt.event.*;

class PrefFrame extends Frame{
	
	public PrefFrame(String	title){
		//�t���[���̃^�C�g��
		setTitle(title);
		
		//�E�B���h�E�����
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	
	}
}

public class PrefTest{

	public static void main(String args[]){
		PrefFrame frm = new PrefFrame("�s���{���ʃ}�X�^�[");
		frm.setLocation(300, 200);
		frm.setSize(250, 350);
		frm.setBackground(Color.LIGHT_GRAY);
		frm.setVisible(true);
	}
}

