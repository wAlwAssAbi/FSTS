package com.mutref.transportation.al_mutreftransportation;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView Web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Web = (WebView) findViewById(R.id.webview);
        Web.setWebViewClient(new MyWebViewClient());
        String url = "http://uts.somee.com";
        Web.getSettings().setJavaScriptEnabled(true);
        Web.loadUrl(url);
    }
    public void onBackPressed() {
        if (Web.canGoBack()) {
            Web.goBack();
        } else {
            super.onBackPressed();
        }
    }



public class MyWebViewClient extends WebViewClient {
    @Override

    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}




}