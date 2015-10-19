public class ReplaysCharacters {//оформить вывод
	public static void main(String[] args) {

		String x;
		int counter, n;
		boolean check;
		x 	  = args[0];
		check = true;

		for (int i = 0; i < x.length(); i++) {
			counter = 0;
			for (int j = 0; j < x.length(); j++) {
				if(x.charAt(i) == x.charAt(j)){
					counter++;
					if(counter >= 2){
						j = x.length();
					}
				}
			}
			if(counter < 2){
				check = false;
				break;
			}	
		}
		if(check == true){
			int result = (int) Math.round(Math.random() * (x.length() - 1));
			System.out.println(x.charAt(result));
		}
	}
}
