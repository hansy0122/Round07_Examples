import java.io.*;
public class Round07_Ex06 {
	
	public static String num(int x) throws IOException{

		return "�Էµ� ����"+x+"�Դϴ�.";
	}

	
	public static void main(String ar[]) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� �Է��ϼ���");
		
		int a=Integer.parseInt(in.readLine());
		System.out.print(num(a));
		
	}
}
