package com.example.aplikasibiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2, btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            }

    public void emailku (View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"111202113797@mhs.dinus.ac.id"});

        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email ?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }
    public void teleponku (View view) {
        Uri uri = Uri.parse("tel:081910148213");
        Intent it = new  Intent (Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void maps (View view) {
        Uri gmmIntentUri = Uri.parse("geo:-6.979156505554034, 110.40970129908524?q=Kos Sadewa 3 No.17");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
