package exerciseDate;

import java.time.LocalDate;
import java.time.Period;

public class AgeOfEmoloye {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2005, 6, 16);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(date, now);

		System.out.println(diff.getYears() + " Years " + diff.getMonths() + " Months " + diff.getDays());
	}
}
