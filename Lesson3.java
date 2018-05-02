import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson3 {
	public static void main (String args[]) throws IOException {
		System.out.println("1つめの数字を入力して下さい。");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine(); // コンソールに入力した内容を文字列として取得する
		int x = Integer.parseInt(str1);

		System.out.println("2つめの数字を入力して下さい。");
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		String str2 = br2.readLine(); // コンソールに入力した内容を文字列として取得する
		int y = Integer.parseInt(str2);

		if(x==y){
			System.out.println("2つの数は同じ値です。");
		}else if(x>y){
			System.out.println("XよりYの方が小さい値です。");
		}else{
			System.out.println("XよりYの方が大きい値です。");
		}
	}
}

//★結果表示については、以下のように記述する事も出来ますので参考にして下さい。
/*
import java.io.*;
public class Lesson3 {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("数値1を入力して下さい。" );
		String str1 = br.readLine();
		System.out.print("数値2を入力して下さい。" );
		String str2 = br.readLine();
		int res1 = Integer.parseInt(str1);//br.readLine()で取得した文字列（str1）を数値に変換
		int res2 = Integer.parseInt(str2);//br.readLine()で取得した文字列（str2）を数値に変換
		if (res1==res2){
			System.out.println("2つの数は同じ値です。");
		}else if(res1<res2){
			System.out.println(res1 +"より" + res2 + "の方が大きい値です。");
		}else if(res1>res2){
			System.out.println(res1 +"より" + res2 + "の方が小さい値です。");
		}
	}
}
*/
