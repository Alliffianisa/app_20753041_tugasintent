package com.example.app_20753041_tugasintent;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}
    public void panggil(View view) {
        String nomor = "085171170452";
        Intent panggil = new Intent(Intent. ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel", nomor, null));
        startActivity(panggil);}
    public void buka(View view) {
        String url = "https://www.youtube.com/";
        Intent bukabrowser = new Intent(Intent.ACTION_VIEW);
        bukabrowser.setData(Uri.parse(url));
        startActivity(bukabrowser);}
    public void OPEN(View view) {
        String url = "https://ask.fm/";
        Intent bukabrowser = new Intent(Intent.ACTION_VIEW);
        bukabrowser.setData(Uri.parse(url));
        startActivity(bukabrowser);}
    public void aboutme(View view) {
        Intent tentang= new Intent(MainActivity.this, AboutMe.class);
        startActivity(tentang);
    }
}