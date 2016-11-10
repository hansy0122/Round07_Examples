
public class Round07_Ex03 {
	public static int fac(int x){
		if(x==1){
			return 1;
		}
		else{
			return x*fac(x-1);
		}
	}

	
	public static void main(String[] ar){
		
		System.out.print(fac(5));
		
	}
	
}
