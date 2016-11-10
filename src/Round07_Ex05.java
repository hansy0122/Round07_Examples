import java.io.*;
public class Round07_Ex05 {
	
	public static String qja(String a) throws IOException{	
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	return a+"님! 안녕하세요!";
	
	}
	
	public static void main(String ar[])throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("이름을 입력하세요:");
		String a=in.readLine();
		System.out.print(qja(a));
		
		
		
		}
		
	}

