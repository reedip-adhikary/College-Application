package com.appone.jainadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DepartmentActivity extends AppCompatActivity implements View.OnClickListener {

    CardView semSeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        semSeven = findViewById(R.id.semSeven);

        semSeven.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.semSeven:
                intent =new Intent(DepartmentActivity.this, UploadAssActivity.class);
                startActivity(intent);
                break;
        }
    }
}