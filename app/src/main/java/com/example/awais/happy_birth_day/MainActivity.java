package com.example.awais.happy_birth_day;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button play, close;
    TextView Click;
    TextView wish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  play=findViewById(R.id.play);
        close=findViewById(R.id.clos);
        wish=findViewById(R.id.wish);
        Click=findViewById(R.id.click);
     //   play.setOnClickListener(this);
        close.setOnClickListener(this);
        Click.setOnClickListener(this);
        Click.setSoundEffectsEnabled(false);
        close.setSoundEffectsEnabled(false);
        startService(new Intent(this,Services.class));
        Animation an = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);
        wish.startAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {


            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    @Override
    public void onClick(View v) {
//        if (v==play)
//        {
//            startService(new Intent(this,Services.class));
//        }
        if (v==close)
        {
            stopService(new Intent(this,Services.class));
        }
        if (v==Click)
        {
            Intent intent=new Intent(MainActivity.this, Imag.class);
            startActivity(intent);
        }
   }
}
