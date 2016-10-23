package br.com.fatecpg.caio.tppdmquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> ht = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher_quiz2);

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        String fileName = "history";

        try{
            FileInputStream fis = openFileInput(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
            String line = null, input = "";
            while ((line = reader.readLine()) != null) {
                ht.add(line);
            }
            reader.close();
            fis.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

        double total = 0;
        for( String linha : ht ){
            String[] separeted = linha.split("-");
            String str = separeted[1].replace(']', ' ');
            str  = str.replace("Nota:", " ");

            total = total + Double.parseDouble(str.trim());
        }

        double media  = total/ht.size();

        String qt = "Total: "+ ht.size();
        String md = "Media: "+ 0;

        if(media > 0) {
            md = "Media: " + nf.format(media);
        }

        TextView txqt = (TextView) findViewById(R.id.txtTotalJogadas);
        TextView txmd = (TextView) findViewById(R.id.txtMediaJogadas);
        txqt.setText(qt);
        txmd.setText(md);
    }

    public void initTest(View view){
        EditText qtq = (EditText) findViewById(R.id.questionNumber);

        if(qtq.getText().toString().trim().isEmpty()){
            qtq.setError("É necessário digitar um número!");
        }else if((Integer.parseInt(qtq.getText().toString()) == 0)){
            qtq.setError("É necessário digitar um número maior que 0");
        }else if((Integer.parseInt(qtq.getText().toString()) > 30)){
            qtq.setError("É necessário digitar um número até 30");
        }else{
            String qt = qtq.getText().toString();
            Intent it = new Intent(this, TestActivity.class);
            it.putExtra("qtq", Integer.parseInt(qt));
            startActivity(it);
            finish();
        }
    }
}
