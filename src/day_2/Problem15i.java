package day_2;

public class Problem15i {
	public static void main(String[] args) {
		int arr[]=new int[101];
		for(int i=2;i<101;i++) {
			if(arr[i]!=1) {
				for(int j=i+i;j<101;j+=i) {
					arr[j]=1;
					if(101-j<i) {
						break;
					}
				}				
			}
		}
		
		for(int i=2;i<101;i++){
			if(arr[i]==0) {
				System.out.print(i+" ");
			}
		}
	}
}
