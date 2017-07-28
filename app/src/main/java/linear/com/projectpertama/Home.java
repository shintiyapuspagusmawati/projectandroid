package linear.com.projectpertama;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button lls = (Button) findViewById(R.id.LinearLayoutSederhana);
        lls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View LinearLayoutSederhana) {
                Intent myIntent = new
                        Intent(LinearLayoutSederhana.getContext(), LinearLayout.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button llr = (Button) findViewById(R.id.LinearLayoutRelative);
        llr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View LinearLayoutRelative) {
                Intent myIntent = new
                        Intent(LinearLayoutRelative.getContext(), RelativeLayoutSederhana.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button llt = (Button) findViewById(R.id.LinearLayoutTable);
        llt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View LinearLayoutTable) {
                Intent myIntent = new
                        Intent(LinearLayoutTable.getContext(), LayoutTable.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button ga = (Button) findViewById(R.id.GambarAndroid);
        ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View GambarAndroid) {
                Intent myIntent = new
                        Intent(GambarAndroid.getContext(), GambarAndroid.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button ta = (Button) findViewById(R.id.TextAutocomplete);
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View AutocompleteSederhana) {
                Intent myIntent = new
                        Intent(AutocompleteSederhana.getContext(), AutocompleteSederhana.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button kd = (Button) findViewById(R.id.KotakDialog);
        kd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View KotakDialog) {
                Intent myIntent = new
                        Intent(KotakDialog.getContext(), KotakDialog.class);
                startActivityForResult(myIntent, 0);

            }
        });
    }

}
