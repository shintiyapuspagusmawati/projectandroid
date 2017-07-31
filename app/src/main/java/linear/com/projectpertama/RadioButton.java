package linear.com.projectpertama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public  class RadioButton extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    RadioGroup orientation;
    RadioGroup gravity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        orientation = (RadioGroup) findViewById(R.id.orientation);
        orientation.setOnCheckedChangeListener(this);
        gravity = (RadioGroup) findViewById(R.id.gravity);
        gravity.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkId) {

        switch (checkId)
        {
            case R.id.horizontal:
                orientation.setOrientation(android.widget.LinearLayout.HORIZONTAL);
                break;
            case R.id.vertical:
                orientation.setOrientation(android.widget.LinearLayout.VERTICAL);
                break;
            case R.id.kiri:
                gravity.setGravity(Gravity.LEFT);
                break;
            case R.id.kanan:
                gravity.setGravity(Gravity.RIGHT);
                break;
            case R.id.tengah:
                gravity.setGravity(Gravity.CENTER);
                break;
        }
    }
}
