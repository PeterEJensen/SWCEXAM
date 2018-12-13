package com.musicmath_v2.repository;

import com.musicmath_v2.domain.TripletBpmEntity;

import java.util.ArrayList;

public interface TripletBpmRepo {

    double tripletBpm(double bpm);

    ArrayList<TripletBpmEntity> getAll();
}
