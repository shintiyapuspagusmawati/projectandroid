package linear.com.projectpertama;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
public class KotakDialog extends Activity implements View.OnClickListener {
    Button pesanToast;
    Button keluar;
    Button tampilList;
    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotak_dialog);

        pesanToast = (Button) findViewById(R.id.toastBtn);
        pesanToast.setOnClickListener(this);

        keluar = (Button) findViewById(R.id.exitBtn);
        keluar.setOnClickListener(this);

        tampilList = (Button) findViewById(R.id.listDialogBtn);
        tampilList.setOnClickListener(this);
    }

    public void onClick(View clicked) {
        switch (clicked.getId()) {
            case R.id.listDialogBtn:
                munculListDialog();
                break;
            case R.id.toastBtn:
                Toast.makeText(this, "Kamu Memilih Toast", Toast.LENGTH_SHORT).show();
                break;
            case R.id.exitBtn:
                exit();
                break;
        }
    }

    private void munculListDialog() {
        // TODO Auto-generated method stub
        final CharSequence[] items = { "Es Teh", "Es Jeruk", "Lemon Squash", "Soft Drink"};

        AlertDialog.Builder kk = new AlertDialog.Builder(this);
        kk.setTitle("Pilih Minuman");
        kk.setItems(items, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                Toast.makeText(getApplicationContext(), items[item], Toast.LENGTH_SHORT).show();
            }
        }).show();
    }

    private void exit() {
        AlertDialog.Builder builder = new  AlertDialog.Builder(this);
        builder.setMessage("Apakah Kamu Benar-Benar Ingin Keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        KotakDialog.this.finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int arg1) {
                        // TODO Auto-generated method stub
                        dialog.cancel();
                    }
                }).show();
    }

}
