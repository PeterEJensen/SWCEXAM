package com.musicmath_v2.service;

import com.musicmath_v2.domain.DottedBpmEntity;
import com.musicmath_v2.domain.TripletBpmEntity;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TripletBpmServiceTest {
    TripletBpmService tS = new TripletBpmService();
    TripletBpmEntity tE = new TripletBpmEntity();


    @Test
    public void tripletBpm64() {

        tE.setSixtyfourNote(tS.tripletBpm(120));
        assertEquals(20.84375, tE.getSixtyfourNote(), 0000.00000);

    }

}