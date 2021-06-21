package com.example.primenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun solution(nums: IntArray): Int {
        Log.v(TAG,"numbs:$nums")
        var answer = -1


        return answer
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}