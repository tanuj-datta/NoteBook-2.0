package com.example.sgsappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class PPS extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pps);

        webView = findViewById(R.id.wbv);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://drive.google.com/drive/folders/108s0goa3TuFgpyuHBe5_amnx34IttxJf");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSafeBrowsingEnabled(true);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (webView.canGoBack()){
            webView.goBack();
            Toast.makeText(this, "Going back", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "Exiting a webview", Toast.LENGTH_SHORT).show();
        }
    }
}