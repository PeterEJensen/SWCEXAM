package com.musicmath_v2.service;


import com.musicmath_v2.domain.FreqEntity;
import com.musicmath_v2.repository.FreqRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FreqService implements FreqRepo {


    private FreqEntity f = new FreqEntity();

    public void freqCal(String note) {

        switch (note) {
            case "c": {
                double c0 = 16.35;
                f.setOcta0(c0);
                f.setOcta1(c0 * 2);
                f.setOcta2(c0 * 4);
                f.setOcta3(c0 * 8);
                f.setOcta4(c0 * 16);
                f.setOcta5(c0 * 32);
                f.setOcta6(c0 * 64);
                f.setOcta7(c0 * 128);
                f.setOcta8(c0 * 256);
                f.setOcta9(c0 * 512);
                f.setOcta10(c0 * 1024);
                break;
            }
            case "c#": {
                double c0 = 17.32;
                f.setOcta0(c0);
                f.setOcta1(c0 * 2);
                f.setOcta2(c0 * 4);
                f.setOcta3(c0 * 8);
                f.setOcta4(c0 * 16);
                f.setOcta5(c0 * 32);
                f.setOcta6(c0 * 64);
                f.setOcta7(c0 * 128);
                f.setOcta8(c0 * 256);
                f.setOcta9(c0 * 512);
                f.setOcta10(c0 * 1024);
                break;
            }
            case "d": {
                double c0 = 18.35;
                f.setOcta0(c0);
                f.setOcta1(c0 * 2);
                f.setOcta2(c0 * 4);
                f.setOcta3(c0 * 8);
                f.setOcta4(c0 * 16);
                f.setOcta5(c0 * 32);
                f.setOcta6(c0 * 64);
                f.setOcta7(c0 * 128);
                f.setOcta8(c0 * 256);
                f.setOcta9(c0 * 512);
                f.setOcta10(c0 * 1024);

                break;
            }
            case "d#": {
                double c0 = 19.45;
                f.setOcta0(c0);
                f.setOcta1(c0 * 2);
                f.setOcta2(c0 * 4);
                f.setOcta3(c0 * 8);
                f.setOcta4(c0 * 16);
                f.setOcta5(c0 * 32);
                f.setOcta6(c0 * 64);
                f.setOcta7(c0 * 128);
                f.setOcta8(c0 * 256);
                f.setOcta9(c0 * 512);
                f.setOcta10(c0 * 1024);
                break;
            }
            case "e": {
                double c0 = 20.60;
                f.setOcta0(c0);
                f.setOcta1(c0 * 2);
                f.setOcta2(c0 * 4);
                f.setOcta3(c0 * 8);
                f.setOcta4(c0 * 16);
                f.setOcta5(c0 * 32);
                f.setOcta6(c0 * 64);
                f.setOcta7(c0 * 128);
                f.setOcta8(c0 * 256);
                f.setOcta9(c0 * 512);
                f.setOcta10(c0 * 1024);
                break;
            }
            case "f": {
                double c0 = 21.83;
                f.setOcta0(c0);
                f.setOcta1(c0 * 2);
                f.setOcta2(c0 * 4);
                f.setOcta3(c0 * 8);
                f.setOcta4(c0 * 16);
                f.setOcta5(c0 * 32);
                f.setOcta6(c0 * 64);
                f.setOcta7(c0 * 128);
                f.setOcta8(c0 * 256);
                f.setOcta9(c0 * 512);
                f.setOcta10(c0 * 1024);
                break;
            }
            case "f#": {
                double c0 = 23.12;
                f.setOcta0(c0);
                f.setOcta1(c0 * 2);
                f.setOcta2(c0 * 4);
                f.setOcta3(c0 * 8);
                f.setOcta4(c0 * 16);
                f.setOcta5(c0 * 32);
                f.setOcta6(c0 * 64);
                f.setOcta7(c0 * 128);
                f.setOcta8(c0 * 256);
                f.setOcta9(c0 * 512);
                f.setOcta10(c0 * 1024);

                break;
            }
            case "g": {
                double c0 = 24.50;
                f.setOcta0(c0);
                f.setOcta1(c0 * 2);
                f.setOcta2(c0 * 4);
                f.setOcta3(c0 * 8);
                f.setOcta4(c0 * 16);
                f.setOcta5(c0 * 32);
                f.setOcta6(c0 * 64);
                f.setOcta7(c0 * 128);
                f.setOcta8(c0 * 256);
                f.setOcta9(c0 * 512);
                f.setOcta10(c0 * 1024);
                break;
            }
            case "g#": {
                double c0 = 25.96;
                f.setOcta0(c0);
                f.setOcta1(c0 * 2);
                f.setOcta2(c0 * 4);
                f.setOcta3(c0 * 8);
                f.setOcta4(c0 * 16);
                f.setOcta5(c0 * 32);
                f.setOcta6(c0 * 64);
                f.setOcta7(c0 * 128);
                f.setOcta8(c0 * 256);
                f.setOcta9(c0 * 512);
                f.setOcta10(c0 * 1024);
                break;
            }
            case "a": {
                double c0 = 27.50;
                f.setOcta0(c0);
                f.setOcta1(c0 * 2);
                f.setOcta2(c0 * 4);
                f.setOcta3(c0 * 8);
                f.setOcta4(c0 * 16);
                f.setOcta5(c0 * 32);
                f.setOcta6(c0 * 64);
                f.setOcta7(c0 * 128);
                f.setOcta8(c0 * 256);
                f.setOcta9(c0 * 512);
                f.setOcta10(c0 * 1024);
                break;
            }
            case "a#": {
                double c0 = 29.14;
                f.setOcta0(c0);
                f.setOcta1(c0 * 2);
                f.setOcta2(c0 * 4);
                f.setOcta3(c0 * 8);
                f.setOcta4(c0 * 16);
                f.setOcta5(c0 * 32);
                f.setOcta6(c0 * 64);
                f.setOcta7(c0 * 128);
                f.setOcta8(c0 * 256);
                f.setOcta9(c0 * 512);
                f.setOcta10(c0 * 1024);
                break;
            }
            case "b": {
                double c0 = 30.87;
                f.setOcta0(c0);
                f.setOcta1(c0 * 2);
                f.setOcta2(c0 * 4);
                f.setOcta3(c0 * 8);
                f.setOcta4(c0 * 16);
                f.setOcta5(c0 * 32);
                f.setOcta6(c0 * 64);
                f.setOcta7(c0 * 128);
                f.setOcta8(c0 * 256);
                f.setOcta9(c0 * 512);
                f.setOcta10(c0 * 1024);
                break;
            }
            default:
                ;
                break;
        }

    }

    public ArrayList<FreqEntity> getAll() {
        ArrayList<FreqEntity> freqList = new ArrayList<>();

        freqList.add(new FreqEntity(f.getOcta0(), f.getOcta1(), f.getOcta2(), f.getOcta3(), f.getOcta4(), f.getOcta5(), f.getOcta6(), f.getOcta7(), f.getOcta8(), f.getOcta9(), f.getOcta10()));

        return freqList;
    }
}
