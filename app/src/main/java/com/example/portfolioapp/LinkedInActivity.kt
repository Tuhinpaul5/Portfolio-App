package com.example.portfolioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class LinkedInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linked_in)

        val webView = findViewById<WebView>(R.id.webLinkedIn)

        webView.webViewClient = WebViewClient()
        webView.getSettings().setSupportZoom(true)
        webView.getSettings().setJavaScriptEnabled(true)
        webView.loadUrl("https://www.linkedin.com/in/ratnadeep-pal-oo7/");
    }
}