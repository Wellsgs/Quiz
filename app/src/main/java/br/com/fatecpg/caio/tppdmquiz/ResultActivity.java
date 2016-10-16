package br.com.fatecpg.caio.tppdmquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.io.FileOutputStream;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ResultActivity extends AppCompatActivity {
    private ArrayList<History> hist = new ArrayList<>();
    private double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        Intent i = getIntent();
        result = i.getDoubleExtra("result", 0);

        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        resultTextView.setText(nf.format(result));

        salvaHistory(result);
    }

    public void salvaHistory(double result){
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
            Date data = new Date();
            Calendar  cal = Calendar.getInstance();
            cal.setTime(data);

            Date data_atual = cal.getTime();

            String now = dateFormat.format(data_atual);
            History h = new History();
            h.setDate(now);
            h.setNote(result);
            hist.add(h);

        String fileName = "history";

        FileOutputStream output = null;

        try {
            output = openFileOutput(fileName, MODE_APPEND);
            output.write(hist.toString().getBytes());
            output.write("\r\n".getBytes());
            output.flush();
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void restart (View view){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        finish();
    }

    public void history (View view){
        Intent i = new Intent(getApplicationContext(), HistoryActivity.class);
        startActivity(i);
        finish();
    }
}
