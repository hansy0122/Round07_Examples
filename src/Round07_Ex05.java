import java.io.*;
public class Round07_Ex05 {
	
	public static String qja(String a) throws IOException{	
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	return a+"��! �ȳ��ϼ���!";
	
	}
	
	public static void main(String ar[])throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�̸��� �Է��ϼ���:");
		String a=in.readLine();
		System.out.print(qja(a));
		
		
		
		}
		
	}

