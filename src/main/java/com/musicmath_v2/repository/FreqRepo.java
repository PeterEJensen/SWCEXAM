package com.musicmath_v2.repository;


import com.musicmath_v2.domain.FreqEntity;

import java.util.ArrayList;

public interface FreqRepo {

    void freqCal(String note);

    ArrayList<FreqEntity> getAll();
}
