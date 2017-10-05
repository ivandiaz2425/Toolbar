package com.i034114.toolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Main2Activity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toolbar = (Toolbar) findViewById(R.id.id_tb_toolbar);
        showToolbar(getResources().getString(R.string.str_tb_p2), true);

    }

    private void showToolbar(String title1, boolean upButton) {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_pantalla_dos,menu);

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        showPantallaUno();

        return super.onOptionsItemSelected(item);
    }
    public void showPantallaUno(){

        Intent b = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(b);

    }
}
