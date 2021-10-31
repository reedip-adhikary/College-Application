package com.appone.jainadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UploadAssActivity extends AppCompatActivity implements View.OnClickListener {

    CardView secure, secureLab, spm, rer, devops;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_ass);

        secure = findViewById(R.id.secure);
        secureLab = findViewById(R.id.secureLab);
        spm = findViewById(R.id.spm);
        rer = findViewById(R.id.rer);
        devops = findViewById(R.id.devops);

        secure.setOnClickListener(this);
        secureLab.setOnClickListener(this);
        spm.setOnClickListener(this);
        rer.setOnClickListener(this);
        devops.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.secure:
                intent =new Intent(UploadAssActivity.this, SecureProgramming.class);
                startActivity(intent);
                break;

            case R.id.secureLab:
                intent =new Intent(UploadAssActivity.this, SecureProgrammingLab.class);
                startActivity(intent);
                break;

            case R.id.spm:
                intent =new Intent(UploadAssActivity.this, SoftwareProjectManagement.class);
                startActivity(intent);
                break;

            case R.id.rer:
                intent =new Intent(UploadAssActivity.this, EnergyResource.class);
                startActivity(intent);
                break;

            case R.id.devops:
                intent =new Intent(UploadAssActivity.this, DevOps.class);
                startActivity(intent);
                break;
        }
    }
}