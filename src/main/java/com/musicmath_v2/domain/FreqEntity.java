package com.musicmath_v2.domain;




public class FreqEntity {


    private double octa0;
    private double octa1;
    private double octa2;
    private double octa3;
    private double octa4;
    private double octa5;
    private double octa6;
    private double octa7;
    private double octa8;
    private double octa9;
    private double octa10;
    private String noteName;


    public FreqEntity() {
    }


    public FreqEntity(double octa0, double octa1, double octa2, double octa3, double octa4, double octa5, double octa6, double octa7, double octa8, double octa9, double octa10) {
        this.octa0 = octa0;
        this.octa1 = octa1;
        this.octa2 = octa2;
        this.octa3 = octa3;
        this.octa4 = octa4;
        this.octa5 = octa5;
        this.octa6 = octa6;
        this.octa7 = octa7;
        this.octa8 = octa8;
        this.octa9 = octa9;
        this.octa10 = octa10;
    }

    public FreqEntity(String noteName) {
        this.noteName = noteName;
    }


    public double getOcta0() {
        return octa0;
    }

    public void setOcta0(double octa0) {
        this.octa0 = octa0;
    }

    public double getOcta1() {
        return octa1;
    }

    public void setOcta1(double octa1) {
        this.octa1 = octa1;
    }

    public double getOcta2() {
        return octa2;
    }

    public void setOcta2(double octa2) {
        this.octa2 = octa2;
    }

    public double getOcta3() {
        return octa3;
    }

    public void setOcta3(double octa3) {
        this.octa3 = octa3;
    }

    public double getOcta4() {
        return octa4;
    }

    public void setOcta4(double octa4) {
        this.octa4 = octa4;
    }

    public double getOcta5() {
        return octa5;
    }

    public void setOcta5(double octa5) {
        this.octa5 = octa5;
    }

    public double getOcta6() {
        return octa6;
    }

    public void setOcta6(double octa6) {
        this.octa6 = octa6;
    }

    public double getOcta7() {
        return octa7;
    }

    public void setOcta7(double octa7) {
        this.octa7 = octa7;
    }

    public double getOcta8() {
        return octa8;
    }

    public void setOcta8(double octa8) {
        this.octa8 = octa8;
    }

    public double getOcta9() {
        return octa9;
    }

    public void setOcta9(double octa9) {
        this.octa9 = octa9;
    }

    public double getOcta10() {
        return octa10;
    }

    public void setOcta10(double octa10) {
        this.octa10 = octa10;
    }


    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }



}


