package com.example.primenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nums: ArrayList<Int> = arrayListOf(1,2,3,4)
        solution(nums)

    }

    private fun solution(nums: ArrayList<Int>): Int {
        Log.v(TAG,"numbs:$nums")
        var answer = 0

        for (i in 0 until nums.size-2) {
            for (j in i+1 until nums.size-1){
                for (k in j+1 until nums.size){
                    println("${nums[i]} | ${nums[j]} | ${nums[k]}")
                    val sum = nums[i]+nums[j]+nums[k]
                    println("sum:$sum")
                    var isPrime = false
                    for (l in 2 until sum) {
                        isPrime = (sum % l == 0)
                        if (isPrime) {
                            break
                        }
                    }
                    if (isPrime.not()) {
                        answer++
                    }
                }
            }
        }

        println("Answer:$answer")
        return answer
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}