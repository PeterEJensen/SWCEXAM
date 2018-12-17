package com.musicmath_v2.service;


import com.musicmath_v2.domain.RevEntity;
import com.musicmath_v2.repository.RevRepo;
import org.springframework.stereotype.Service;


import java.util.ArrayList;

@Service
public class RevService implements RevRepo {

    private RevEntity r = new RevEntity();


    public double revBpm(double bpm) {


        double result;
        result = 240000 / bpm;
        r.setWholeNote(result);

        //double result2;
        result = 120000 / bpm;
        r.setHalfNote(result);

        //double result3;
        result = 60000 / bpm;
        r.setFourthNote(result);

        //double result4;
        result = 30000 / bpm;
        r.setEightNote(result);

        //double result5;
        result = 15000 / bpm;
        r.setSixteenNote(result);

        //double result6;
        result = 7500 / bpm;
        r.setThertyTwoNote(result);

        //double result7;
        result = 3750 / bpm;
        r.setSixtyfourNote(result);

        return result;

    }

    public ArrayList<RevEntity> getAll() {
        ArrayList<RevEntity> revList = new ArrayList<>();


        revList.add(new RevEntity(r.getWholeNote(), r.getHalfNote(), r.getFourthNote(), r.getEightNote(), r.getSixteenNote(), r.getThertyTwoNote(), r.getSixtyfourNote()));

        return revList;
    }
}
