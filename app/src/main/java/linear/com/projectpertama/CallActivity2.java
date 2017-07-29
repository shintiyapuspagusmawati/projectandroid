package linear.com.projectpertama;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class CallActivity2 extends Activity {
    //    Called when the activity is first created.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call2);

        Button prev = (Button) findViewById(R.id.Button02);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new
                        Intent();
                setResult(RESULT_OK, Intent);
                finish();

            }
        });
    }

}