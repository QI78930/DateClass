import java.util.Scanner;
// Name: Oluwatomisin Sobowale ID: QI78930 Section:03
// This code will create a class that outputs dates in different formats
//mm/dd/yyyy  month, d yyyy  ddd, yyyy

// main class which is called TestDate
    public class TestDate {
    public static void main(String[] args) {
        // This will display the menu
        Scanner sc = new Scanner(System.in);
        System.out.println("Weclome to the Date class ");
        System.out.println("Enter 1 for format: MM/DD/YY");
        System.out.println("Enter 2 for format: Month name DD, YYYY)");
        System.out.println("Enter 3 for format: DDD YYYY");
        // I am using a do-while loop to get the choice from the switch statement
        int choice;
        //Do Loop for the entry formats
        do {
            System.out.print("CHOICE?");

            choice = sc.nextInt();
        //switch statements for the option choice from the menu
            switch (choice) {
                case 1:
                    System.out.print("\nEnter the month: ");
                    int month = sc.nextInt();
                    System.out.print("\nEnter the day: ");
                    int day = sc.nextInt();
                    System.out.print("\nEnter the year:");
                    int year = sc.nextInt();
                     Date d1 = new Date(month, day, year);
                    System.out.println(d1.month + "/" + d1.day + "/" + d1.year);
                    System.out.println(d1.monthName + " " + d1.day + " " + d1.year);
                    System.out.println(d1.dayNo + " " + d1.year);
                    break;
                case 2:
                    System.out.print("\nEnter the monthname: " );
                    String month1 = sc.next();
                    System.out.print("\nEnter the day:");
                    day = sc.nextInt();
                    System.out.print("\nEnter the year:");
                    year = sc.nextInt();
                     d1 = new Date(month1, day, year);
                    System.out.println(d1.month + "/" + d1.day + "/" + d1.year);
                    System.out.println(d1.monthName + " " + d1.day + " " + d1.year);
                    System.out.println(d1.dayNo + " " + d1.year);
                    break;
                case 3:
                    System.out.print("\nEnter the dayNumber:");
                    int day1 = sc.nextInt();
                    System.out.print("\nEnter the year:");
                    year = sc.nextInt();
                     d1 = new Date(day1, year);
                    System.out.println(d1.month + "/" + d1.day + "/" + d1.year);
                    System.out.println(d1.monthName + " " + d1.day + " " + d1.year);
                    System.out.println(d1.dayNo + " " + d1.year);
                    break;
                case 4:
                    System.out.println("-------------------");
                    System.out.println("Exit.");
                    System.out.println("--------------------");
                    break;
                default:
                    System.out.println("Invalid code");
            }
            // while loop will loop the menu unitil choice is 4(Ends it)
        }
        while(choice != 4);
        System.out.println("Thank you.");
        }
}
            //Class Date which contains the attributes and constructors
class Date {
    int day;
    int dayNo;
    int month;
    String monthName = " ";
    int year;

// Default Constructor
    Date() {

    }
// Constructors with parameters
    Date(int monthNo, int d, int yr) {
        month = monthNo;
        monthName = getMonthName(month);
        month = getMonth(monthName);
        day = d;
        year = yr;
        dayNo = getDayNo(day, month, year);
    }

    Date(String month1, int d, int yr) {
        monthName = month1;
        day = d;
        year = yr;
        month = getMonth(monthName);
        month1 = getMonthName(month);
        dayNo = getDayNo(day, month, year);
        year = yr;
    }

    Date(int day1, int yr) {
        dayNo = day1;
        month = getMonth(monthName);
        dayNo = getDayNo(day, month, year);
        monthName = getMonthName(month);
        dayNo = day1;
        year = yr;
    }
//Method that to get Monthname
   static  String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return "Month is invalid";
    }
    // Method to get month number
    static int getMonth(String month1) {
        switch (month1) {
            case "January":
                return 1;
            case "February":
                return 2;
            case "March":
                return 3;
            case "April":
                return 4;
            case "May":
                return 5;
            case "June":
                return 6;
            case "July":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "October":
                return 10;
            case "November":
                return 11;
            case "December":
                return 12;
        }
        return 0;
    }
    // Method to get the day number in the the month
    static int  getDayNo(int day, int month, int year) {
        int months[] = {31,29,31,30,31,30,31,31,30,31,30,31};
        int count = 0 ;
        for(int i=0;i<month-1;i++) {
            count += months[i];
        }
        return count + day ;
    }
    // method that gets the number of days in the year
    static int getDays(int day1, int year) {

        int daysInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = 0;
        for (int i = 0; i < 12; i++) {
            if (count + daysInMonth[i] <= day1) {
                count += daysInMonth[i];
            }
        }

        return day1 - count;

    }


}

