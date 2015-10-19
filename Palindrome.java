public class Palindrome{

    public static boolean check(String x) {
        try {
                Integer.parseInt(x);
            }catch (Exception e) {
                return false;
            }
        return true;
    }

    public static void main(String[] args) {
        boolean ck;
        ck = true;

        if(check(args[0]) == false){
            System.out.println("Введенные данные не являются полноценным числом");
        }
        else{
            for(int i = 0; i < args[0].length() / 2; i++){
                if(args[0].charAt(i) != args[0].charAt(args[0].length() - i - 1)){
                    ck = false;
                    System.out.println(i);
                    break;
                }
            }
        }
        if(ck == true){
            System.out.println("Число " + args[0] + " является полиндромом");
        }
        else{
            System.out.println("Число " + args[0] + " не является полиндромом");   
        }
    }
}
