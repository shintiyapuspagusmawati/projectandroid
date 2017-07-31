package linear.com.projectpertama;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.*;

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

        Button p = (Button) findViewById(R.id.Picker);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View Picker) {
                Intent myIntent = new
                        Intent(Picker.getContext(), Picker.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button cb = (Button) findViewById(R.id.check);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View cb) {
                Intent myIntent = new
                        Intent(cb.getContext(), checkBox.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button rb = (Button) findViewById(R.id.radio);
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View radio) {
                Intent myIntent = new
                        Intent(radio.getContext(), RadioButton.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button lv = (Button) findViewById(R.id.list);
        lv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View list) {
                Intent myIntent = new
                        Intent(list.getContext(), listView.class);
                startActivityForResult(myIntent, 0);

            }
        });

    }

}
