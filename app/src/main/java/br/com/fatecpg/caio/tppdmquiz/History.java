package br.com.fatecpg.caio.tppdmquiz;

import java.text.NumberFormat;

/**
 * Created by julio on 15/10/16.
 */

public class History{
    public String date;
    public double  note;


    public String toString() {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        return String.format(this.date + " -> " + nf.format(this.note));
    }

}
