import java.io.*;
public class Round07_Ex06 {
	
	public static String num(int x) throws IOException{

		return "입력된 수는"+x+"입니다.";
	}

	
	public static void main(String ar[]) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("수를 입력하세요");
		
		int a=Integer.parseInt(in.readLine());
		System.out.print(num(a));
		
	}
}
