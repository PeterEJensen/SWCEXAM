package com.musicmath_v2.service;

import com.musicmath_v2.domain.FreqEntity;
import org.junit.Test;

import static org.junit.Assert.*;

public class FreqServiceTest {
    
    FreqService fs = new FreqService();
    FreqEntity fe = new FreqEntity();

    @Test
    public void toneFrek() {

        fe.setOcta1(440);
        assertEquals(440,fe.getOcta1(),0.00);

    }


}