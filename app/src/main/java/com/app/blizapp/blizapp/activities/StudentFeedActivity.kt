package com.app.blizapp.blizapp.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.app.blizapp.blizapp.R

class StudentFeedActivity : AppCompatActivity() {
    companion object {
        private const val ACTIVITY_NUM = 0
        private const val TAG = "StudentFeedActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_feed)
    }
}
