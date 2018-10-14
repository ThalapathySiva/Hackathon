package com.allandroidprojects.ecomsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class OpinionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opinion);
    }

    public void acceptRequest(View view) throws InterruptedException {
        Toast.makeText(this, "Your response has been sent to Sivaram", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void rejectRequest(View view) {
        Toast.makeText(this, "Your response has been sent to Sivaram", Toast.LENGTH_SHORT).show();
        finish();
    }
}
