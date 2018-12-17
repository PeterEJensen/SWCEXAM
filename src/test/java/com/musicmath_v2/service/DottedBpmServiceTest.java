package com.musicmath_v2.service;

import com.musicmath_v2.domain.DottedBpmEntity;
import org.junit.Test;

import static org.junit.Assert.*;

public class DottedBpmServiceTest {
    DottedBpmService d = new DottedBpmService();
    DottedBpmEntity de = new DottedBpmEntity();


    @Test
    public void dottedBpm64() {


        de.setSixtyfourNote(d.dottedBpm(120));
        assertEquals(46.875, de.getSixtyfourNote(), 0000.00000);

    }

}