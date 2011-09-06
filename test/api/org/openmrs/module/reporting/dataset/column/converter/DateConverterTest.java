package org.openmrs.module.reporting.dataset.column.converter;

import java.util.Date;
import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;
import org.openmrs.module.reporting.common.DateUtil;

public class DateConverterTest {
	
	/**
	 * @see DateConverter#convert(Object)
	 * @verifies convert a Date into a String with the passed format
	 */
	@Test
	public void convert_shouldConvertADateIntoAStringWithThePassedFormat() throws Exception {
		Date today = DateUtil.getDateTime(2011, 4, 6);
		Assert.assertEquals("2011-04-06", (new DateConverter()).convert(today));
		Assert.assertEquals("06/Apr/2011", (new DateConverter("dd/MMM/yyyy")).convert(today));
		Assert.assertEquals("06/avr./2011", (new DateConverter("dd/MMM/yyyy", Locale.FRENCH)).convert(today));
	}
}