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
}
