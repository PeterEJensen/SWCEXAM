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

public class NoteFreqControllerTest {
    private MockMvc mockMvc;

    @InjectMocks
    NoteFreqController noteFreqController;


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(noteFreqController).build();
    }

    @Test
    public void testGetNoteFreq() throws Exception {
        mockMvc.perform(get("/getNoteFreq"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("noteFreq"));
    }


}