package com.vokasi.helloapp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vokasi.helloapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var number=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            txtNumber.text= number.toString()
            btnToast.setOnClickListener {
                Toast.makeText(this@MainActivity,"Count $number"
                    , Toast.LENGTH_SHORT).show()
            }
            btnCount.setOnClickListener {
                //update number
                number++
                txtNumber.text=number.toString()
            }
        }


        Log.d("CLOG","onCreate: log debug")
        Log.e("CLOG","onCreate: log error")
        Log.w("CLOG","onCreate: log warning")
        Log.i("CLOG","onCreate: log info")

    }
}