package com.example.logging

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.logging.databinding.ActivityMainBinding
//import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setContentView(R.layout.activity_main)

        Logger.logDebug("MainActivity created")
        Logger.logInfo("MainActivity info log")
        Logger.logWarn("MainActivity warning")
        Logger.logError("MainActivity error")

        binding.btnOpenFlutter.setOnClickListener {
//            startActivity(
//                FlutterActivity
//                    .withCachedEngine("my_engine_id")
//                    .build(this@MainActivity)
//            )
        }
    }
}
