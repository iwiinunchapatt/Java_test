import java.util.Scanner; 

public class binaryid {
	
	public static void main(String[] args) {	
			int id[] = {1,6,2,0,7,0,8,0,4,8};
			int idSelect[] = new int [5];
			int j =0;
			
			for (int i = 0; i < id.length; i++) {
				System.out.print(id[i]);
			}
			
			System.out.println("\n");
	 		System.out.print("'"+id[3]+""+id[4]+"'");
	 		System.out.println(" '"+id[5]+""+id[6]+""+id[7]+"' \n");
			
			for (int i = 3; i < 8; i++) {
				idSelect[j] = id[i];
				j++;
			}	
			
			for (int i = 0; i < idSelect.length; i++) {
				if(idSelect[i] != 0){
						int num =idSelect[i];
	        			int count = 0;
	        			while(num != 0){
	        				num = num/2;
	        				count++;
	        			}
	        		    if(idSelect[i] <=7){
	        		        count++;
	        		        int array_binary[] = new int [count];
	        		        array_binary[0] = 0;
	        		    }
	        			int array_binary[] = new int [count];
	        			int n = 0;
	        			num = idSelect[i];
	        		while(num != 0){
	        			array_binary[n] = num%2;
	        			num = num/2;
	        			
	        			n++;
	        		}
	        		for(int k = array_binary.length-1 ; k >= 0 ; k--){
	        		    System.out.print(array_binary[k]);
	        		}
	        		System.out.println();
				}
				else{
					System.out.println("0000");
				}
			}
		}
	}

