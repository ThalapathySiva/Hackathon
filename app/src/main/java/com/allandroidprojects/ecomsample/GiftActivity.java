package com.allandroidprojects.ecomsample;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class GiftActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift);
    }

    public void acceptRequest(View view) throws InterruptedException {
        Toast.makeText(this, "Assume here you enter payment, and custom message", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Successfully contributed to gift", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void rejectRequest(View view) {
        Toast.makeText(this, "You rejected the request", Toast.LENGTH_SHORT).show();
        finish();
    }
}
