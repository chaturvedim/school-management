package com.school.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;
import static com.jayway.jsonpath.JsonPath.read;

/**
 * @author gaurav_karnatak Created: 11/16/18
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SchoolManagementApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class SchoolManagementApplicationTest {

    @LocalServerPort
    private int serverPort;
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void health() {
        String response = testRestTemplate.getForObject(String.format("http://localhost:%s/health", serverPort), String.class);
        System.out.println(response);
        assertEquals("UP", read(response, "$.status"));
    }
}
