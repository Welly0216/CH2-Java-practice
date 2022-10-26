
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p19 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請問你是男生嗎?");
		System.out.println("輸入Y或N");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		char letter = str.charAt(0);
		if ( letter== 'Y'||letter== 'y') {
			System.out.println("man");
		} else if (letter== 'N'||letter== 'n') {
			System.out.println("womman");
		} else  {
			System.out.println("輸入Y或N");
		}
	}
}