package br.com.fatecpg.caio.tppdmquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {
    ArrayList<String> ht = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

       ArrayList<History> hist = (ArrayList<History>)getIntent().getSerializableExtra("hist");

       ListView listView1 = (ListView) findViewById(R.id.historyListView);

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

       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ht);
       listView1.setAdapter(adapter);
    }

    public void restart (View view){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        finish();
    }
}
