package in.papayacoders.plgpl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.cardview.widget.CardView;

import in.papayacoders.plgpl.assignmet.AssignmentActivity;

public class Secure extends Activity implements View.OnClickListener{
    CardView checkAssignment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkassignment);

        checkAssignment = findViewById(R.id.checkAssignment);
        checkAssignment.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {

            case R.id.checkAssignment:
                intent = new Intent(Secure.this, AssignmentActivity.class);
                startActivity(intent);
                break;
        }
    }
}
