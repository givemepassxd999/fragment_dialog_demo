package com.sample.demo.fragment_dialog_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            val demoDialogFragment = DemoDialogFragment()
            demoDialogFragment.show(supportFragmentManager, "")
        }
    }
}
