import java.io.*;

class sample{
	public static void main(String args[]){
		System.out.println("Hello");
		
		String[] name = new String[2];
		name[0] = "TEST1";
		name[1] = "TEST2";
		
		for(int i = 0; i < 2; i++){
			System.out.println(name[i]);
		}
		
		try{
			File fl = new File("./test.txt");
			fl.createNewFile();
		}catch(IOException e){
			System.out.println(e + "—áŠO‚ª”­¶‚µ‚Ü‚µ‚½B");
		}
		
	}
}
