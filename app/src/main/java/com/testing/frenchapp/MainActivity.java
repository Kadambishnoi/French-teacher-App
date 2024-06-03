package com.testing.frenchapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    Button redbtn,greenbtn,purplebtn,yellowbtn,blackbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        blackbtn=findViewById(R.id.blackbtn);
        redbtn=findViewById(R.id.redbtn);
        yellowbtn=findViewById(R.id.yellowbtn);
        greenbtn=findViewById(R.id.greenbtn);
        purplebtn=findViewById(R.id.purplebtn);

        redbtn.setOnClickListener(this);
        blackbtn.setOnClickListener(this);
        greenbtn.setOnClickListener(this);
        yellowbtn.setOnClickListener(this);
        purplebtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int clickedbtnid=v.getId();

        if(clickedbtnid ==R.id.redbtn){
            playsounds(R.raw.red);
        } else if (clickedbtnid==R.id.blackbtn) {
            playsounds(R.raw.black);
        } else if (clickedbtnid==R.id.greenbtn) {
            playsounds(R.raw.green);
        } else if (clickedbtnid==R.id.yellowbtn) {
            playsounds(R.raw.yellow);
        }else if (clickedbtnid==R.id.purplebtn){
            playsounds(R.raw.purple);
        }
    }
    public void playsounds(int id){
        MediaPlayer mediaPlayer =MediaPlayer.create(this,id);
        mediaPlayer.start();
    }

}