package com.ali.tchoti
import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
class MainActivity : Activity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  val web=WebView(this)
  web.settings.javaScriptEnabled=true
  web.settings.domStorageEnabled=true
  web.webViewClient=WebViewClient()
  web.loadUrl("https://ali-calculator.higgsfield.app")
  setContentView(web)
 }
}