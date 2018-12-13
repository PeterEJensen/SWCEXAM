package com.musicmath_v2.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class FindScaleControllerTest {
    private MockMvc mockMvc;

    @InjectMocks
    FindScaleController findScaleController;


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(findScaleController).build();
    }

    @Test
    public void testGetFindScale() throws Exception {
        mockMvc.perform(get("/getFindScale"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("findScale"));
    }


}