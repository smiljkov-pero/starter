package com.google.firebase.codelab.mlkit

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import com.google.firebase.analytics.FirebaseAnalytics

import kotlinx.android.synthetic.main.activity_basic.*

class BasicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            val s: String? = null
            s!!.length
        }
    }

    override fun onResume() {
        super.onResume()
        val tracker = FirebaseAnalytics.getInstance((applicationContext))
        tracker.setCurrentScreen(this, "Second View", null)
        tracker.logEvent("test_event", Bundle())
    }
}
