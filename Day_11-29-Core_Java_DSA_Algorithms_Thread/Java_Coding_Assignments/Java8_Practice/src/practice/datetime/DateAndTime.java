package practice.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
			System.out.println("------------------LocaDate------------------");
		
			System.out.println("\nThe Current Year is: " + date.getYear());
			System.out.println("\nThe Cureennt Month is: " + date.getMonth());
			System.out.println("\nThe Current Day of week is: " + date.getDayOfWeek());
			System.out.println("\nThe Current Day of Month is: " +date.getDayOfMonth());
			System.out.println("\nThe Current Day of Year is: " +date.getDayOfYear());
			System.out.println("\nThe Current Month Value is: " +date.getMonthValue());
			
			
			LocalDate futureDate = date.plusDays(10); // Adding 10 days
	        LocalDate pastDate = date.minusWeeks(2); // Subtracting 2 weeks
	        LocalDate nextMonthDate = date.withMonth(6); // Setting month to June
	        
	        System.out.println("\nFuture Date (10 days later): " + futureDate);
	        System.out.println("\nPast Date (2 weeks earlier): " + pastDate);
	        System.out.println("\nDate in next month (June): " + nextMonthDate);
	        
	        // Getting the first and last day of the current month
	        LocalDate firstDayOfMonth = date.withDayOfMonth(1);
	        LocalDate lastDayOfMonth = date.withDayOfMonth(date.lengthOfMonth());

	        System.out.println("\nFirst Day of Current Month: " + firstDayOfMonth);
	        System.out.println("\nLast Day of Current Month: " + lastDayOfMonth);
	        
	     // Adding and subtracting months
	        LocalDate datePlusMonths = date.plusMonths(3); // Adding 3 months
	        LocalDate dateMinusMonths = date.minusMonths(3); // Subtracting 3 months

	        System.out.println("\nDate after adding 3 months: " + datePlusMonths);
	        System.out.println("\nDate after subtracting 3 months: " + dateMinusMonths);
			
		LocalTime time = LocalTime.now();
		
			System.out.println("\n\n------------------LocaTime------------------");
		
			System.out.println("\nCurrent Hour is: "+time.getHour());
			System.out.println("\nCurrent Minute is: "+time.getMinute());
			System.out.println("\nCurrent Second is: "+time.getSecond());
			System.out.println("\nCurrent Nano-Second is: "+time.getNano());
			
			 // Additional LocalTime methods
	        LocalTime timePlusHours = time.plusHours(5); // Adding 5 hours
	        LocalTime timeMinusMinutes = time.minusMinutes(30); // Subtracting 30 minutes
	        LocalTime timeWithNewSecond = time.withSecond(45); // Setting seconds to 45
	        LocalTime midnight = LocalTime.MIDNIGHT; // Getting midnight time

	        System.out.println("\nTime after adding 5 hours: " + timePlusHours);
	        System.out.println("\nTime after subtracting 30 minutes: " + timeMinusMinutes);
	        System.out.println("\nTime with seconds set to 45: " + timeWithNewSecond);
	        System.out.println("\nMidnight time: " + midnight);
			
		
		LocalDateTime dateTime = LocalDateTime.now();
		
			System.out.println("\n\n------------------LocaDateTime------------------");
			
			System.out.println("\nCurrent month: " + dateTime.getMonthValue());
		
		LocalDate ldt = LocalDate.of(0124, 1, 26);
		
			System.out.println("\nThe Manual set Date is: " + ldt);
			
			System.out.println("\nAfter " + date.isAfter(ldt));
			
			System.out.println("\nBefore " + date.isBefore(ldt));
			
			System.out.println("\nIs Leap Year? : " + date.isLeapYear());
			
			System.out.println("\nThe Day of week on Date " +  ldt +  " is: " + ldt.getDayOfWeek());
			
			System.out.println("\nThe Day of Year on Date " + ldt + " is: " + ldt.getDayOfYear());
			
			
			// Additional LocalDateTime methods
	        LocalDateTime dateTimePlusDays = dateTime.plusDays(10); // Adding 10 days
	        LocalDateTime dateTimeMinusHours = dateTime.minusHours(5); // Subtracting 5 hours
	        LocalDateTime dateTimeWithMonth = dateTime.withMonth(12); // Setting month to December
	        LocalDateTime dateTimeWithYear = dateTime.withYear(2025); // Setting year to 2025

	        System.out.println("\nDate and Time after adding 10 days: " + dateTimePlusDays);
	        System.out.println("\nDate and Time after subtracting 5 hours: " + dateTimeMinusHours);
	        System.out.println("\nDate and Time in December: " + dateTimeWithMonth);
	        System.out.println("\nDate and Time in the year 2025: " + dateTimeWithYear);
		
	}

}
