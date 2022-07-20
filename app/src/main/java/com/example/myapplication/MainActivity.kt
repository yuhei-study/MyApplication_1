package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.content.Intent
import android.widget.CalendarView.OnDateChangeListener
import android.widget.Toast
import androidx.annotation.NonNull




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // CalendarViewに現在日時を設定します。/*
        val calendarView = findViewById<CalendarView>(R.id.calendarView)
        calendarView.date = System.currentTimeMillis()

        // CalendarViewで日にちが選択された時に呼び出されるリスナー
        val listener = DateChangeListener()
        calendarView.setOnDateChangeListener(listener)
    }

    private inner class DateChangeListener : CalendarView.OnDateChangeListener {
        override fun onSelectedDayChange(calendarView: CalendarView, year: Int, month: Int, dayOfMonth: Int) {
            // monthは0起算のため+1します。
            //val displayMonth = month + 1
            //Toast.makeText(applicationContext, "$year/$displayMonth/$dayOfMonth", Toast.LENGTH_SHORT).show()
            val intent = Intent(application, detail_activity::class.java)
            startActivity(intent)
        }
    }
/*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // CalendarViewに現在日時を設定します。
        val calendarView = findViewById<CalendarView>(R.id.calendarView)
        calendarView.date = System.currentTimeMillis()

        // CalendarViewで日にちが選択された時に呼び出されるリスナー
        val listener = DateChangeListener()
        calendarView.setOnDateChangeListener(listener)
    }

    // CalendarViewで日にちが選択された時に呼び出されるリスナークラス
    private inner class DateChangeListener : CalendarView.OnDateChangeListener {
        override fun onSelectedDayChange(calendarView: CalendarView, year: Int, month: Int, dayOfMonth: Int) {
            // monthは0起算のため+1します。
            val displayMonth = month + 1
            Toast.makeText(applicationContext, "$year/$displayMonth/$dayOfMonth", Toast.LENGTH_SHORT).show()
        }
    }*/
}