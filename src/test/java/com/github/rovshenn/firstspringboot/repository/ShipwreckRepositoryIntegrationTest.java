package com.github.rovshenn.firstspringboot.repository;

import com.github.rovshenn.firstspringboot.model.Shipwreck;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ShipwreckRepositoryIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    ShipwreckRepository shipwreckRepository;

    @Test
    public void exampleTest() throws IOException {
        List<Shipwreck> responseBody = (List<Shipwreck>) restTemplate.getForEntity("/api/v1/shipwrecks", List.class).getBody();

        assertThat(responseBody.size(), greaterThanOrEqualTo(1));
    }

    @Test
    public void testFindAll() {
        List<Shipwreck> shipwrecks = shipwreckRepository.findAll();
        System.out.println("\n\n" + Arrays.toString(shipwrecks.toArray()));
        assertThat(shipwrecks.size(), is(greaterThanOrEqualTo(0)));
    }
}
