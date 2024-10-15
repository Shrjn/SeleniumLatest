    package ConditionalStatements;

    public class WeekDayUsingNumber {
        public static void main(String[] args)
        {
            int week_num=5;

            if(week_num== 1) {
                System.out.println("Sunday");
            }
            else if (week_num== 2)
            {
                System.out.println("Monday");
            } else if (week_num == 3) {
                System.out.println("Wednesday");
            }
            else
                System.out.println("Invalid week number");
        }
    }
