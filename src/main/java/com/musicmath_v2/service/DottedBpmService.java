package com.musicmath_v2.service;

import com.musicmath_v2.domain.DottedBpmEntity;
import com.musicmath_v2.repository.DottedBpmRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DottedBpmService implements DottedBpmRepo {

    private DottedBpmEntity d = new DottedBpmEntity();


    public double dottedBpm(double bpm) {

        double result;
        result = 240000 / bpm * 1.5;
        d.setWholeNote(result);

        //double result1;
        result = 120000 / bpm * 1.5;
        d.setHalfNote(result);

        //double result3;
        result = 60000 / bpm * 1.5;
        d.setFourthNote(result);

        //double result4;
        result = 30000 / bpm * 1.5;
        d.setEightNote(result);

        //double result5;
        result = 15000 / bpm * 1.5;
        d.setSixteenNote(result);

        //double result6;
        result = 7500 / bpm * 1.5;
        d.setThertyTwoNote(result);

        //double result7;
        result = 3750 / bpm * 1.5;
        d.setSixtyfourNote(result);

        return result;
    }

    public ArrayList<DottedBpmEntity> getAll() {

        ArrayList<DottedBpmEntity> dottedList = new ArrayList<>();

        dottedList.add(new DottedBpmEntity(d.getWholeNote(), d.getHalfNote(), d.getFourthNote(), d.getEightNote(), d.getSixteenNote(), d.getThertyTwoNote(), d.getSixtyfourNote()));

        return dottedList;
    }
}
