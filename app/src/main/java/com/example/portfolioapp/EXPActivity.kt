package com.example.portfolioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class EXPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expactivity)

        val webView = findViewById<WebView>(R.id.web2)
        webView.webViewClient = WebViewClient()
        webView.getSettings().setSupportZoom(true)
        webView.getSettings().setJavaScriptEnabled(true)
        webView.loadUrl("https://docs.google.com/document/d/1gqmfpJzHu_KWoYqSncn_gzzudKqd32K21QATtDo-N-8/edit?usp=sharing" + "https://pdfurl.com/file.pdf");
    }
}