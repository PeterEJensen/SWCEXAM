package com.musicmath_v2.service;

import com.musicmath_v2.domain.RevEntity;
import com.musicmath_v2.domain.TripletBpmEntity;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RevBpmServiceTest {
    RevService rS = new RevService();
    RevEntity rE = new RevEntity();


    @Test
    public void tripletBpm64() {

        rE.setSixtyfourNote(rS.revBpm(120));
        assertEquals(31.25, rE.getSixtyfourNote(), 0000.00000);

    }

}