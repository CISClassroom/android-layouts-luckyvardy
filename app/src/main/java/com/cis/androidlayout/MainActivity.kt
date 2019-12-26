package com.cis.androidlayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cis.androidlayout.LinearActivity
import com.cis.androidlayout.ProfileActivity
import com.cis.androidlayout.R
import com.cis.androidlayout.RelativeActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val i = Intent(this, LinearActivity::class.java)
            startActivity(i)
        }
        button2.setOnClickListener {
            val i = Intent(this, RelativeActivity::class.java)
            startActivity(i)
        }
        button3.setOnClickListener {
            val i = Intent(this, ProfileActivity::class.java)
            startActivity(i)
        }
    }
}
