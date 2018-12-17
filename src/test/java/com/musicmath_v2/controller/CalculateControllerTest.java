package com.musicmath_v2.controller;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.configuration.MockAnnotationProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class CalculateControllerTest {


    private MockMvc mockMvc;

    @InjectMocks
    CalculateController calculateController;


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(calculateController).build();
    }

    @Test
    public void testGetCalculateBpm() throws Exception {
        mockMvc.perform(get("/getCalculateBpm"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("calculateBpm"));
    }


}