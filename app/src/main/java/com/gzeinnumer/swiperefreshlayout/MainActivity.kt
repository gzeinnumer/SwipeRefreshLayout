package com.gzeinnumer.swiperefreshlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        swLayout.setOnRefreshListener {
            Handler().postDelayed({
                swLayout.isRefreshing = false

                llayout.background = ContextCompat.getDrawable(
                    this,
                    android.R.mipmap.sym_def_app_icon
                )
                tv_helloworld.text = "Refreshed"
            }, 5000)
        }
    }
}
