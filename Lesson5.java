import java.io.IOException;

public class Lesson5 {
	public static void main (String args[]) throws IOException {
		System.out.println("1～10までの偶数を出力します。");
		for (int i=1; i<=10; i++) {
			if(i % 2 == 0){
				System.out.println(i);
			}
		}
		System.out.println("ループが終了しました。");
	}
}
