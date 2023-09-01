package com.assignment.assignment3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class KYCDateRange {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("KYCDateRange");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        for (int i = 0; i < n; i++) {
            String[] dates = scanner.nextLine().split(" ");
            String signupDateString = dates[0];
            String currentDateString = dates[1];

            Date signupDate = dateFormat.parse(signupDateString);
            Date currentDate = dateFormat.parse(currentDateString);

            Date anniversaryDate = getAnniversaryDate(signupDate, currentDate);

            if (anniversaryDate != null) {
                Date startDate = getStartDate(anniversaryDate);
                Date endDate = getEndDate(anniversaryDate);
                if (currentDate.compareTo(startDate) >= 0 && currentDate.compareTo(endDate) <= 0) {
                    System.out.println(dateFormat.format(startDate) + " " + dateFormat.format(endDate));
                } else {
                    System.out.println("No range");
                }
            }
        }
    }

    private static Date getAnniversaryDate(Date signupDate, Date currentDate) {
        Calendar signupCal = Calendar.getInstance();
        signupCal.setTime(signupDate);

        Calendar currentCal = Calendar.getInstance();
        currentCal.setTime(currentDate);

        if (signupCal.get(Calendar.MONTH) == currentCal.get(Calendar.MONTH) &&
            signupCal.get(Calendar.DAY_OF_MONTH) == currentCal.get(Calendar.DAY_OF_MONTH)) {
            return null; // Not an anniversary
        }

        currentCal.set(Calendar.YEAR, signupCal.get(Calendar.YEAR));

        if (currentCal.after(signupCal)) {
            currentCal.add(Calendar.YEAR, 1);
        }

        return currentCal.getTime();
    }

    private static Date getStartDate(Date anniversaryDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(anniversaryDate);
        cal.add(Calendar.DAY_OF_MONTH, -30);
        return cal.getTime();
    }

    private static Date getEndDate(Date anniversaryDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(anniversaryDate);
        cal.add(Calendar.DAY_OF_MONTH, 30);
        return cal.getTime();
    }
}
