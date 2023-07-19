package com.example.portfolioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class EduActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edu)

        val webView = findViewById<WebView>(R.id.web3)
        webView.webViewClient = WebViewClient()
        webView.getSettings().setSupportZoom(true)
        webView.getSettings().setJavaScriptEnabled(true)
        webView.loadUrl("https://docs.google.com/document/d/192_N-F4291LUrBtUxCabvaQcYo9rAoE4dEA03CFbvfA/edit?usp=sharing" + "https://pdfurl.com/file.pdf");
    }
}