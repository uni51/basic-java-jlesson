import java.io.*;

public class Lesson2 {
	public static void main (String args[]) throws IOException {
		System.out.println("数字を入力して下さい。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // コンソールに入力した内容を文字列として取得する
		int res = Integer.parseInt(str);
		if((res % 2)==0){
			System.out.println(res+"は偶数です。");
		}else{
			System.out.println(res+"は奇数です。");
		}
	}
}
