package com.musicmath_v2.repository;

import com.musicmath_v2.domain.DottedBpmEntity;

import java.util.ArrayList;

public interface DottedBpmRepo {

    double dottedBpm(double bpm);

    ArrayList<DottedBpmEntity> getAll();
}
