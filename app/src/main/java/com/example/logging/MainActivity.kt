package com.example.logging

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.logging.databinding.ActivityMainBinding
//import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: MainViewModel

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val viewModelFactory = MainViewModelFactory(Logger())
        viewModel = ViewModelProvider(this, viewModelFactory)[MainViewModel::class.java]

        viewModel.logData(className = localClassName)

        binding.btnOpenFlutter.setOnClickListener {
//            startActivity(
//                FlutterActivity.createDefaultIntent(this)
//            )
        }
    }

}
