import java.io.IOException;

public class Lesson4 {
	public static void main (String args[]) throws IOException {
		for (int i=1; i<7; i++) {
			if(i<4){
				System.out.println("Happy"+i);
			}else{
				System.out.println("Lucky"+i);				
			}
		}
		System.out.println("ループが終了しました。");
	}
}
