package in.papayacoders.plgpl.assignmet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import in.papayacoders.plgpl.DeveloperActivity;
import in.papayacoders.plgpl.Devops;
import in.papayacoders.plgpl.R;
import in.papayacoders.plgpl.Rer;
import in.papayacoders.plgpl.Secure;
import in.papayacoders.plgpl.SecureLab;
import in.papayacoders.plgpl.Spm;
import in.papayacoders.plgpl.ebook.EbookActivity;


public class Assignment extends AppCompatActivity implements View.OnClickListener{

    CardView secure, devops, secureLab, spm, rer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        secure = findViewById(R.id.secure);
        secure.setOnClickListener(this);
        devops = findViewById(R.id.devops);
        devops.setOnClickListener(this);
        secureLab = findViewById(R.id.secureLab);
        secureLab.setOnClickListener(this);
        spm = findViewById(R.id.spm);
        spm.setOnClickListener(this);
        rer = findViewById(R.id.rer);
        rer.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {

            case R.id.secure:
                intent = new Intent(Assignment.this, Secure.class);
                startActivity(intent);
                break;

            case R.id.secureLab:
                intent = new Intent(Assignment.this, SecureLab.class);
                startActivity(intent);
                break;

            case R.id.spm:
                intent = new Intent(Assignment.this, Spm.class);
                startActivity(intent);
                break;

            case R.id.rer:
                intent = new Intent(Assignment.this, Rer.class);
                startActivity(intent);
                break;

            case R.id.devops:
                intent = new Intent(Assignment.this, Devops.class);
                startActivity(intent);
                break;
        }
    }

}