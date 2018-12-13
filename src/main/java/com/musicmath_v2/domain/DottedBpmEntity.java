package com.musicmath_v2.domain;

public class DottedBpmEntity {


    private double wholeNote;
    private double halfNote;
    private double fourthNote;
    private double eightNote;
    private double sixteenNote;
    private double thertyTwoNote;
    private double sixtyfourNote;

    public DottedBpmEntity(){
    }

    public DottedBpmEntity(double wholeNote, double halfNote, double fourthNote, double eightNote, double sixteenNote, double thertyTwoNote, double sixtyfourNote) {
        this.wholeNote = wholeNote;
        this.halfNote = halfNote;
        this.fourthNote = fourthNote;
        this.eightNote = eightNote;
        this.sixteenNote = sixteenNote;
        this.thertyTwoNote = thertyTwoNote;
        this.sixtyfourNote = sixtyfourNote;
    }


    public double getWholeNote() {
        return wholeNote;
    }

    public void setWholeNote(double wholeNote) {
        this.wholeNote = wholeNote;
    }

    public double getHalfNote() {
        return halfNote;
    }

    public void setHalfNote(double halfNote) {
        this.halfNote = halfNote;
    }

    public double getFourthNote() {
        return fourthNote;
    }

    public void setFourthNote(double fourthNote) {
        this.fourthNote = fourthNote;
    }

    public double getEightNote() {
        return eightNote;
    }

    public void setEightNote(double eightNote) {
        this.eightNote = eightNote;
    }

    public double getSixteenNote() {
        return sixteenNote;
    }

    public void setSixteenNote(double sixteenNote) {
        this.sixteenNote = sixteenNote;
    }

    public double getThertyTwoNote() {
        return thertyTwoNote;
    }

    public void setThertyTwoNote(double thertyTwoNote) {
        this.thertyTwoNote = thertyTwoNote;
    }

    public double getSixtyfourNote() {
        return sixtyfourNote;
    }

    public void setSixtyfourNote(double sixtyfourNote) {
        this.sixtyfourNote = sixtyfourNote;
    }
}
