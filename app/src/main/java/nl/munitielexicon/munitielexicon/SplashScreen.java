package nl.munitielexicon.munitielexicon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SplashScreen extends AppCompatActivity {

    private Button button, button2;

    ImageView bgapp;
    LinearLayout textsplash, texthome, homebtn;
    Animation frombottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);

        bgapp = (ImageView) findViewById(R.id.bgapp);
        textsplash = (LinearLayout) findViewById(R.id.textsplash);
        texthome = (LinearLayout) findViewById(R.id.texthome);
        homebtn = (LinearLayout) findViewById(R.id.homebtn);

        bgapp.animate().translationY(-1800).setDuration(800).setStartDelay(400);
        textsplash.animate().translationY(-140).alpha(0).setDuration(800).setStartDelay(600);

        texthome.startAnimation(frombottom);
        homebtn.startAnimation(frombottom);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutPage();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }
    public void openMainActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void openAboutPage(){
        Intent intent = new Intent(this,AboutPage.class);
        startActivity(intent);
    }
}