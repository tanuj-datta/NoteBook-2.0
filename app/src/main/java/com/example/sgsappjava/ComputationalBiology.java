package com.example.sgsappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class ComputationalBiology extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computational_biology);
        webView = findViewById(R.id.wbv);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://drive.google.com/drive/folders/1ZI0RVnRDJWQWq9uG7rgYMIF7iU-a05zm");
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
