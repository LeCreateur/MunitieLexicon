package nl.munitielexicon.munitielexicon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        String url = "https://www.munitielexicon.nl";

        WebView web = (WebView) findViewById(R.id.webView);
        web.loadUrl(url);


    }
}
