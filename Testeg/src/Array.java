
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int [] input= {1,3,5,35,20,35,20,45};
		
		//System.out.println("The given array is"+input);
		
		for(int i=0;i<input.length;i++) {
			//System.out.println(input[i]);
			for(int j=i+1;j<input.length;j++) {
				
				int temp=0;
				if(input[i]<input[j]) {
					temp=input[i];
					input[i]=input[j];
					input[j]=temp;
					//System.out.println("Duplicate values"+input[j]);
				}
			}
			System.out.println("The sorted array is:"+input[i]);
		}
			
	}
}

