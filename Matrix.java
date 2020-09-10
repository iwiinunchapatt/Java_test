import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int num[][] = new int [input1][input2];
		int set[][] = new int [input2][input1];
		int sum1 = 1;
		int sum2 = 1;
		int r1[] = new int[input1];
		int r2[] = new int[input1];
		int t = -1;
		int total =0;
		
		
		boolean check = true;
		boolean check2 = true;
		
		for (int i = 0; i < input1; i++) {
			for (int j = 0; j < input2; j++) {
				num[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("===== MatrixTranpose =====");
		for (int i = 0; i < input2; i++) {
			for (int j = 0; j < input1; j++) {
				set[i][j] = num[j][i];
//			System.out.print(set[i][j]+" ");
			}
			
//			System.out.println("");
		}
		
		for (int i = 0; i < input2; i++) {
			for (int j = 0; j < input1; j++) {
				set[i][j] = num[j][i];
			System.out.print(set[i][j]+" ");
			}
			System.out.println("");
		}
		for (int i = 0; i < input2; i++) {
			for (int j = 0; j < input1; j++) {
				if(i == j){
					if(num[i][j] != 1){
						check = false;
					}
					if(i>0){
						if(num[i][j-1] != 0){
							check = false;
						}
					}
				}
				else{
					if(num[i][j] != 0){
						check2 = false;
					}
				}
			}
		}
		for (int i = 0; i < input1; i++) {
			for (int j = 0; j < input2; j++) {
				
				
				if(i == j){
					sum1 *= num[i][j];
					
				}
				
				if(i+j == input1-1){
					sum2 *= num[i][j];
					num[i][j] =(num[i][j])*t;
					
				}
			}
		}	
		total = 1/(sum1-sum2);
//		System.out.println("");
//		System.out.println(sum1);
//		System.out.println(sum2);
		
		if(check == true){
			
			System.out.println("===== Matrix is Gauss.=====");
		}
		else{
			System.out.println("===== Matrix is not Gauss");
		}
		if(check2 == true){
			
			System.out.println("===== Matrix is Gauss-Jordan.=====");
		}
		else{
			System.out.println("===== Matrix is not Gauss-Jordan. ====");
		}
		System.out.println("");
		System.out.println("1/"+sum1+"-"+sum2+"--->"+"1/"+total);
		System.out.println("x");
		
		for (int i = 0; i < input2; i++) {
			for (int j = 0; j < input1; j++) {
				
			System.out.print(num[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
