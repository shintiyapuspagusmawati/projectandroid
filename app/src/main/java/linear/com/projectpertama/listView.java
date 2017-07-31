package linear.com.projectpertama;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class listView extends ListActivity {
    TextView seleksi;
    String[] pilihan={"Merabu","Merapi","Lawu","Rinjani",
            "Sumbing","Sindaro","Krakatau","Selat Sunda","Selat Bali",
            "Selat Malaka","Kalimantan","Sulawesi","Jawa"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        setListAdapter(new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,pilihan));
        seleksi=(TextView) findViewById(R.id.yangDipilih);
    }
    public void onListItemClick (ListView parent, View v, int position, long id)
    {
        seleksi.setText(pilihan[position]);
    }
}
