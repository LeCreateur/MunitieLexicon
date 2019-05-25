package nl.munitielexicon.munitielexicon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;

public class AboutPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);

    }

    public void LoadWebPage (View v){

        Intent intent = new Intent(this,WebActivity.class);
        startActivity(intent);
    }
}
