package com.github.rovshenn.firstspringboot.controller;

import com.github.rovshenn.firstspringboot.model.Shipwreck;
import com.github.rovshenn.firstspringboot.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShipwreckControllerTest {

    @InjectMocks
    private ShipwreckController shipwreckController;

    @Mock
    private ShipwreckRepository shipwreckRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void list() throws Exception {
    }

    @Test
    public void create() throws Exception {
    }

    @Test
    public void get() throws Exception {
        Shipwreck sw = new Shipwreck();
        long id = 1l;
        sw.setId(id);
        when(shipwreckRepository.findOne(id)).thenReturn(sw);

        Shipwreck swRes = shipwreckController.get(id);
        assertThat(swRes.getId().longValue(), is(id));
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

}