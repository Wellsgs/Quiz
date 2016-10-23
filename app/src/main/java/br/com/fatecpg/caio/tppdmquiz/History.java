package br.com.fatecpg.caio.tppdmquiz;

import java.text.NumberFormat;

/**
 * Created by julio on 15/10/16.
 */

public class History{
    private String date;
    private double  note;


    public double getNote() {
        return note;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNote(double note) {
        this.note = note;
    }


    public String toString() {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        return String.format(this.date + " - Nota: " + nf.format(this.note));
    }

}
