package com.musicmath_v2.repository;


import com.musicmath_v2.domain.RevEntity;

import java.util.ArrayList;

public interface RevRepo {

    double revBpm(double bpm);

    ArrayList<RevEntity> getAll();

}
