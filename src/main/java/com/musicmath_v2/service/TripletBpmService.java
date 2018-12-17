package com.musicmath_v2.service;

import com.musicmath_v2.domain.TripletBpmEntity;
import com.musicmath_v2.repository.TripletBpmRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TripletBpmService implements TripletBpmRepo {

    private TripletBpmEntity t = new TripletBpmEntity();


    public double tripletBpm(double bpm) {

        double result;
        result = 240000 / bpm * 0.667;
        t.setWholeNote(result);

        //double result2;
        result = 120000 / bpm * 0.667;
        t.setHalfNote(result);

        //double result3;
        result = 60000 / bpm * 0.667;
        t.setFourthNote(result);

        //double result4;
        result = 30000 / bpm * 0.667;
        t.setEightNote(result);

        //double result5;
        result = 15000 / bpm * 0.667;
        t.setSixteenNote(result);

        //double result6;
        result = 7500 / bpm * 0.667;
        t.setThertyTwoNote(result);

        //double result7;
        result = 3750 / bpm * 0.667;
        t.setSixtyfourNote(result);

        return result;
    }

    public ArrayList<TripletBpmEntity> getAll() {

        ArrayList<TripletBpmEntity> tripletList = new ArrayList<>();

        tripletList.add(new TripletBpmEntity(t.getWholeNote(), t.getHalfNote(), t.getFourthNote(), t.getEightNote(), t.getSixteenNote(), t.getThertyTwoNote(), t.getSixtyfourNote()));

        return tripletList;
    }

}
