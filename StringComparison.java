public class StringComparison {

    public static void main(String[] args) {

    	int n, n1, n2;
 		boolean check; 
 		String k;
 		check       = true;
 		n1          = 1;
 		n2          = 2;
 		n           = args.length;

 		if(n % 2 != 0){
 			n1 = 2;
 			n2 = 1;
 		}

		int[] array = new int[n];

 		System.out.print("До: ");
 		for(int i = 0; i < n; i++){
 	 		System.out.print(args[i] + " ");
 	 	}

	 	while(check == true){ 
			check = false;

 			for(int i = 0; i < n - n1; i+=2){ 
 				if(args[i].length() > args[i + 1].length()){
 					k  = args[i];
 					args[i] = args[i + 1];
 					args[i + 1] = k;
 					check = true;
 				}
 	 		}


 	 		for(int i = 1; i < n - n2; i+=2){
 				if(args[i].length() > args[i + 1].length()){
 					k  = args[i];
 					args[i] = args[i + 1];
 					args[i + 1] = k;
 					check = true;
 				}
 			}	
		}


		System.out.print("\nПосле: ");
 	 	for(int i = 0; i < n; i++){
			System.out.print(args[i] + " ");
 	 	}

    }
}

