package com.school.data;

import org.junit.Assert;
import org.junit.Test;

import com.school.data.SchoolInMemoryData;
import com.school.model.Standard;


public class SchoolInMemoryDataTest {
	private static SchoolInMemoryData schoolInMemoryData = new SchoolInMemoryData();

	@Test
	public void getSchoolIsNull() {
		Assert.assertNotNull(schoolInMemoryData.getSchool());
	}

	@Test
	public void getSchoolStandard() {
		Assert.assertEquals(3, schoolInMemoryData.getSchool().getClasses().size());
	}

	@Test
	public void getSchoolStandardName() {
		Assert.assertEquals(Standard.SIXTH, schoolInMemoryData.getSchool().getClasses().get(0).getStandard());
		Assert.assertEquals(Standard.SEVENTH, schoolInMemoryData.getSchool().getClasses().get(1).getStandard());
		Assert.assertEquals(Standard.EIGHTH, schoolInMemoryData.getSchool().getClasses().get(2).getStandard());
	}

}
