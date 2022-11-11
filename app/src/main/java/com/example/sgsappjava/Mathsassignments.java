package com.example.sgsappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Mathsassignments extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathsassignments);

        webView = findViewById(R.id.wbv);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://drive.google.com/drive/folders/1j-hogdBzfRBCgJfT8sA_RpbHwbQF2XB2");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSafeBrowsingEnabled(true);
        Toast.makeText(this, "Opening", Toast.LENGTH_SHORT).show();
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