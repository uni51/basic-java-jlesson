import java.io.*;

public class Lesson1 {
	public static void main (String args[]) throws IOException {
		System.out.println("数字を入力して下さい。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // コンソールに入力した内容を文字列として取得する
		char res = str.charAt(0);
		switch(res){
		case '1':
			System.out.println("1が入力されました。");
			break;
		case '2':
			System.out.println("2が入力されました。");
			break;
		case '3':
			System.out.println("3が入力されました。");
			break;
		default:	// 上記以外の場合
			System.out.println("1～3以外の数字が入力されました。");
		}
	}
}