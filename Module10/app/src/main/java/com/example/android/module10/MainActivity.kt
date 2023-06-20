package com.example.android.module10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Layout stuff
        var noteCounter = findViewById<TextView>(R.id.noteNumber)
        var noteInputter = findViewById<EditText>(R.id.noteInputter)
        var noteUpdater = findViewById<Button>(R.id.adder)
        var noteHolder = findViewById<LinearLayout>(R.id.noteHolder)

        var numOfNotes = 0;



        //Updater button
        noteUpdater.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this, noteInputter.text.toString(), Toast.LENGTH_SHORT).show()
            numOfNotes++
            noteCounter.text = numOfNotes.toString() + " total notes"

            var newText = TextView(this)
            newText.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            newText.text = "Note " + numOfNotes + ": " + noteInputter.text.toString()
            newText.textSize = 20f
            newText.gravity = 1
            noteHolder.addView(newText)
        })
    }
}