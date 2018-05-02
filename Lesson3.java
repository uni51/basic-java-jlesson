import java.io.*;

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
