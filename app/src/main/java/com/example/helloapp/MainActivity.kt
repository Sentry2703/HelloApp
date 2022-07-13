package com.example.helloapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

//Handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Show the layout file activity_main
        setContentView(R.layout.activity_main)

        //User can tap a button to change the color of the label
        //Add button to layout
        var i = 0; var j = 0; var k = 0
        findViewById<Button>(R.id.TextColorButton).setOnClickListener{
            //Handle Button tap
            //Change color of text when that occurs
            i += 1

            Log.i("Tunji", "Tapped on \"Change Text\" times $i times")
            //Get a reference to the text view
            //Set color of the text view
            if (i % 3 == 1) {
                findViewById<TextView>(R.id.textView).setTextColor(Color.parseColor("#FF0000"))
            } else if (i % 3 == 2) {
                findViewById<TextView>(R.id.textView).setTextColor(Color.parseColor("#FFFFFF"))
            } else if ( i % 3 == 0) {
                findViewById<TextView>(R.id.textView).setTextColor(Color.parseColor("#050406"))
            }
        }

        findViewById<Button>(R.id.BackgroundColorButton).setOnClickListener {
            j++
            Log.i ("Tunji", "Tapped on \"Change Background\" times $j times")

            if (j % 3 == 1) {
                findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(Color.parseColor("#A2F3D2"))
            } else if (j % 3 == 2) {
                findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(Color.parseColor("#CFDF50"))
            } else if (j % 3 == 0) {
                findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(Color.parseColor("#FF03DAC5"))
            }
        }

        findViewById<Button>(R.id.ResetButton).setOnClickListener {
            i = 0; j = 0; k = 0

            Log.i("Tunji", "Hit the \"Reset button\" ")

            findViewById<TextView>(R.id.textView).text = "Hello from Tunji!"
            findViewById<TextView>(R.id.textView).setTextColor(Color.parseColor("#000000"))
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(Color.parseColor("#9FAA9D"))

        }

        findViewById<Button>(R.id.ChangeTextButton).setOnClickListener {

            k += 1

            Log.i("Tunji", "Changed the text $k times")

            if (k % 3 == 1) {
                findViewById<TextView>(R.id.textView).text = "Android is Awesome!"
            } else if (k % 3 == 2) {
                findViewById<TextView>(R.id.textView).text = "Or is it??????!!!!!!"
            } else if (k % 3 == 0) {
                findViewById<TextView>(R.id.textView).text = "Yeah! It's the best"
            }
        }


    }
}