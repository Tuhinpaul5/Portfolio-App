package com.example.portfolioapp


import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class SkillsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)

        val webView = findViewById<WebView>(R.id.webSkills)
        webView.webViewClient = WebViewClient()
        webView.getSettings().setSupportZoom(true)
        webView.getSettings().setJavaScriptEnabled(true)
        webView.loadUrl("https://docs.google.com/document/d/1hYxFbAL-xpig86A4KZguGNjKhPgLbVQXnbacfVMo3XA/edit?usp=sharing" + "https://pdfurl.com/file.pdf");
    }
}


