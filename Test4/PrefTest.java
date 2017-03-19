import java.awt.*;
import java.awt.event.*;

class PrefFrame extends Frame{
	
	public PrefFrame(String	title){
		//フレームのタイトル
		setTitle(title);
		
		//ウィンドウを閉じる
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	
	}
}

public class PrefTest{

	public static void main(String args[]){
		PrefFrame frm = new PrefFrame("都道府県別マスター");
		frm.setLocation(300, 200);
		frm.setSize(250, 350);
		frm.setBackground(Color.LIGHT_GRAY);
		frm.setVisible(true);
	}
}

