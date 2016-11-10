import java.io.*;
public class Round07_Ex04 {

	public static int plu(int x, int y) throws IOException {
		return x+y;
	}
	public static int min(int x, int y) throws IOException {
		return x-y;
	}
	public static int mul(int x, int y) throws IOException {
		return x*y;
	}
	public static int div(int x, int y) throws IOException {
		return x/y;
	}
	public static int per(int x, int y) throws IOException {
		return x%y;
	}
	
	public static void main(String ar[]) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("두수를 입력하세요 x,y");
		int x=Integer.parseInt(in.readLine());
		int y=Integer.parseInt(in.readLine());
		
		plu(x,y);
		min(x,y);
		mul(x,y);
		div(x,y);
		per(x,y);
		
		System.out.println(""+plu(x,y)+
		"\n"+min(x,y)+"\n"+
		mul(x,y)+"\n"+
		div(x,y)+"\n"+
		per(x,y));
		
		
		
		
		
		
	}
}
