
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p21{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("輸入整數");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int n=Integer.parseInt(str);
		char ans=(n==1)?'A':'B';
		System.out.println("選擇了"+ans+"路線");
	}
}