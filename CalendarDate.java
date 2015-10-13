
public class CalendarDate {
	
	private int year;
	private int month;
	private int day;
	private String[] monthString = {"January","February","March",
			"April","May","June","July","August","September",
			"October","November","December"};
	
	public CalendarDate(int yr, int mnt, int dy) {
		year = yr;
		month = checkMonth(mnt);
		day = checkDay(year, month, dy);
	}
	
	private boolean isLeapYear(int yr) {
		if (yr%4 == 0) {
			if(yr%100 == 0) {
				if(yr%400 != 0) {
					return false;
				}
				else {
					return true;
				}
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}

	private int checkMonth(int mnt) {
		if (mnt < 1) {
			return 1;
		}
		else if (mnt > 12) {
			return 12;
		}
		else {
			return mnt;
		}
	}
	
	private int checkDay(int yr, int mnt, int dy) {
		if (mnt == 2) {
			if(isLeapYear(yr)) {
				if(dy > 29) {
					return 29;
				}
				else if(dy < 1) {
					return 1;
				}
				else {
					return dy;
				}
			}
			else {
				if(dy > 28) {
					return 28;
				}
				else if (dy < 1) {
					return 1;
				}
				else {
					return dy;
				}
			}
		}
		if(mnt == 1 || mnt == 3 || mnt == 5 || mnt == 7
				|| mnt == 8 || mnt == 10 || mnt == 12) {
			if(dy > 31) {
				return 31; 
			}
			else {
				return dy;
			}
		}
		else if (mnt == 4 || mnt == 6 || mnt == 9 ||
				mnt == 11) {
			if(dy > 30) {
				return 30;
			}
			else {
				return dy;
			}
		}
		else if (dy < 1) {
			return 1;
		}
		else {
			return dy;
		}
	}
	
	public void setDate(int yr, int mnt, int dy) {
		year = yr;
		month = checkMonth(mnt);
		day = checkDay(year, month, dy);
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}

	public String getMonthAsString() {
		
		return monthString[month-1];
	}

	public String toString() {
		return (getMonthAsString() + " " + day + ", " + year);
	}

	public boolean equals(CalendarDate otherDate) {
		if (this.year == otherDate.getYear() && 
				this.month == otherDate.getMonth() &&
				this.day == otherDate.getDay()) {
			return true;
		}
		else {
			return false;
		}
	}

	public CalendarDate tomorrow() {
		int yr = year;
		int mon = month;
		int dy = day;
		if(month == 1 || month == 3 || month == 5 || month == 7
				|| month == 8 || month == 10) {
			if(day == 31) {
				mon++;
				dy = 1;
			}
			else {
				dy++;
			}
		}
		else if(month == 4 || month == 6 || month == 9 ||
				month == 11) {
			if(day == 30) {
				mon++;
				dy = 1;
			}
			else {
				dy++;
			}
		}
		else if (month == 12) {
			if(day == 31){
				yr = year + 1;
				mon = 1;
				dy = 1;
			}
			else {
				dy++;
			}
		}
		else {
			if(isLeapYear(year)) {
				if(day == 29){
					mon++;
					dy = 1;
				}
				else {
					dy++;
				}
			}
			else {
				if(day == 28){
					mon++;
					dy = 1;
				}
				else {
					dy++;
				}
			}
		}
		return new CalendarDate(yr,mon,dy);
	}
}
