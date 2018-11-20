package uat;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.school.app.SchoolManagementApplication;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author gaurav_karnatak Created: 11/16/18
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" })
public class RunUatTest {

	@BeforeClass
	public static void run() {
		SchoolManagementApplication.main(ArrayUtils.EMPTY_STRING_ARRAY);
	}
}
