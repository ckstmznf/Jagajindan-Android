package com.heechan.jagajindan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebChromeClient
import androidx.databinding.DataBindingUtil
import com.heechan.jagajindan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val name = intent.getStringExtra("name").toString()
        val URL = "file:///android_asset/index.html?username=${name}"

        binding.wvMain.apply {
            webChromeClient = WebChromeClient()
            val webSettings= settings;
            webSettings.javaScriptEnabled = true;
            loadUrl(URL)
        }

    }
}