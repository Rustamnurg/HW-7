public class CorrectABC {
	public static void main(String[] args) {
		String x; 
		boolean check;
		x     = args[0];
		check = true;

		for (int i = 0; i <= x.length(); i++){
			for (int j = i + 1; j < x.length(); j++) {
				if(x.charAt(i) >= x.charAt(j)){
					check = false;
					break;
				}
				
			}

		}

		if(check == true){
			System.out.println("строчка введена по алфовиту");
		}
		else{
			System.out.println("строчка введена по не алфовиту");
		}
	}
}
