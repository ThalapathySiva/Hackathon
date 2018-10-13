package com.allandroidprojects.ecomsample.miscellaneous;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.allandroidprojects.ecomsample.R;

public class EmptyActivity extends AppCompatActivity {
    ImageButton call,mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);
        call=findViewById(R.id.imageBukktton);
        mail=findViewById(R.id.imageButton);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                call();
            }
        });
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mail();
            }
        });
    }
    public void call() {
        Intent i = new Intent(Intent.ACTION_DIAL);
        String p = "tel:" + "8144479784";
        i.setData(Uri.parse(p));
        startActivity(i);

    }

    public void mail() {
        Intent y = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","sivaramsiva16@gmail.com",null));
        y.putExtra(Intent.EXTRA_SUBJECT,"Send your Message");
        startActivity(y.createChooser(y,"choose app to send message"));

    }

}
