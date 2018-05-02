import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson6 {
	public static void main (String args[]) throws IOException {
		String strTmp;
		int intTmp = 0;
		int intSum = 0;
		while(intTmp != 999){
			intSum += intTmp;
			System.out.println("テストの点数を入力してください。(999で終了）");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			strTmp = br.readLine(); // コンソールに入力した内容を文字列として取得する
			intTmp = Integer.parseInt(strTmp);
		}
		System.out.println(intSum);
	}
}
