import static org.junit.Assert.*;

import org.junit.Test;

public class CalendarDateTest {

	@Test
	public void testGetMonthAsString() {
		CalendarDate calendar = new CalendarDate(2015,2,3);
		CalendarDate cal = new CalendarDate(2015,5,3);
		CalendarDate cal2 = new CalendarDate(2015,9,3);
		CalendarDate cal3 = new CalendarDate(2015,12,3);
		
		assertEquals("February",calendar.getMonthAsString());
		assertEquals("May",cal.getMonthAsString());
		assertEquals("September",cal2.getMonthAsString());
		assertEquals("December",cal3.getMonthAsString());
	}

	@Test
	public void testToString() {
		CalendarDate calendar = new CalendarDate(2015,2,3);
		CalendarDate cal = new CalendarDate(2012,5,11);
		CalendarDate cal2 = new CalendarDate(1992,9,28);
		CalendarDate cal3 = new CalendarDate(2020,12,25);
		
		assertEquals("February 3, 2015",calendar.toString());
		assertEquals("May 11, 2012",cal.toString());
		assertEquals("September 28, 1992",cal2.toString());
		assertEquals("December 25, 2020",cal3.toString());
	}
	
	@Test
	public void testEquals() {
		CalendarDate cal = new CalendarDate(2011,12,3);
		CalendarDate other = new CalendarDate(2011,12,3);
		CalendarDate not = new CalendarDate(2012,3,11);
		
		assertTrue(cal.equals(other));
		assertFalse(cal.equals(not));
	}
	
	@Test
	public void testTomorrow() {
		CalendarDate cal = new CalendarDate(1999,12,31);
		CalendarDate cal2 = new CalendarDate(2016,2,29);
		CalendarDate cal3 = new CalendarDate(2015,2,28);
		CalendarDate cal4 = new CalendarDate(2020,9,30);
		CalendarDate cal5 = new CalendarDate(1992,5,31);
		CalendarDate cal6 = new CalendarDate(2001,10,13);
		
		cal = cal.tomorrow();
		cal2 = cal2.tomorrow();
		cal3 = cal3.tomorrow();
		cal4 = cal4.tomorrow();
		cal5 = cal5.tomorrow();
		cal6 = cal6.tomorrow();
		
		assertEquals("January 1, 2000",cal.toString());
		assertEquals("March 1, 2016",cal2.toString());
		assertEquals("March 1, 2015",cal3.toString());
		assertEquals("October 1, 2020",cal4.toString());
		assertEquals("June 1, 1992",cal5.toString());
		assertEquals("October 14, 2001",cal6.toString());
	}
}
