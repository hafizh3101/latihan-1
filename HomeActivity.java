package dev.hafizh.tugas_layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void layout1_1(View view) {
        startActivity(new Intent(HomeActivity.this,Layout1.class));
    }

    public void layout2_2(View view) {
        startActivity(new Intent(HomeActivity.this,Layout2.class));
    }

    public void layout3_3(View view) {
        startActivity(new Intent(HomeActivity.this,Layout3.class));
    }

    public void layout4_4(View view) {
        startActivity(new Intent(HomeActivity.this,Layout4.class));
    }
}
