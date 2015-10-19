public class Competition {

    public static void main(String[] args){
        StringBuilder[] sb = new StringBuilder[args.length];
        for(int i = 0; i < sb.length; i++){
            sb[i] = new StringBuilder(args[i]);
        }

        int temp = sb[0].indexOf(":");
        StringBuilder firstName = new StringBuilder(sb[0].substring(0, temp));
        StringBuilder secondName = new StringBuilder(sb[0].substring(++temp, sb[0].length()));

        int firstGoals = 0, secondGoals = 0;
        for(int i = 1; i < sb.length; i++)
        {
            temp = sb[i].indexOf(":");
            firstGoals += Integer.parseInt(sb[i].substring(0, temp));
            secondGoals += Integer.parseInt(sb[i].substring(++temp, sb[i].length()));
        }

        StringBuilder out = new StringBuilder();
        out.append(firstName); out.append(" ");
        out.append(Integer.toString(firstGoals));
        out.append(" | ");
        out.append(secondName); out.append(" ");
        out.append(Integer.toString(secondGoals));

        System.out.println(out.toString());
    }
}
