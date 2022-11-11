package com.example.sgsappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MathsPrevivous extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_previvous);
        webView = findViewById(R.id.wbv);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://drive.google.com/drive/folders/1t5pOp6AwbkZ7CXnhVHRKWCM-AG_JxLR0");
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
