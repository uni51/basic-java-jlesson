import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//●解答サンプル：パターン１（Stringクラスのまま比較）
//import java.io.*;
//public class Lesson1 {
//	public static void main(String args[]) throws IOException{
//		System.out.print("数値を入力して下さい。" );
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		switch (str){
//			case "1":
//			case "2":
//			case "3":
//				System.out.println(str + "が入力されました。");
//				break;
//			default:
//				System.out.println("1～3以外の数字が入力されました。");
//		}
//	}
//}

// ●解答サンプル：パターン２（int型に変換後比較）
public class Lesson1 {
	public static void main(String args[]) throws IOException{
		System.out.print("数値を入力して下さい。" );
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		switch (res){
			case 1:
			case 2:
			case 3:
				System.out.println(str + "が入力されました。");
				break;
			default:
				System.out.println("1～3以外の数字が入力されました。");
		}
	}
}