package ConditionalStatements;

public class SwitchCase {
    public static void main(String[] args) {
        int week_num = 65;
        switch (week_num) {
            case 1: System.out.println("Sunday");
            break; // break is to make sure if 1st statement is matching it comes out of the switch case
            case 2:System.out.println("Monday");
            break; // if not added break if will execute all conditions without checking below conditions
            case 3:System.out.println("Tuesday");
            break;
            case 4:System.out.println("Wednesday");
            break;
            case 5:System.out.println("Thursday");
            break;
            case 6:System.out.println("Friday");
            break;
            case 7:System.out.println("Saturday");
            break;
            default: // not break required here as no other statement after default statement required
                System.out.println("invalid week number");
        }

    }
}
