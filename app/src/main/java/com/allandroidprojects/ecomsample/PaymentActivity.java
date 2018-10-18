package com.allandroidprojects.ecomsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }

    public void handlePayment(View view) {
        Toast.makeText(this, "Assume the payment is complete", Toast.LENGTH_LONG).show();
        finish();
    }

    public void finishActivity(View view) {
        finish();
    }
}
