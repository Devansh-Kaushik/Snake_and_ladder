@file:Suppress("DEPRECATION")

package com.example.dice

import android.content.pm.ActivityInfo
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    var sum1=0
    var sum2=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.apply {
            // Hide both the navigation bar and the status bar.
            // SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
            // a general rule, you should design your app to hide the status bar whenever you
            // hide the navigation bar.
            systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }
        setContentView(R.layout.activity_main2)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.hide()
        var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.snakehit)
        var mediaPlayer_1: MediaPlayer? = MediaPlayer.create(this, R.raw.roll)
        val t: ImageView =findViewById(R.id.imageView)
        val t1 : ImageView =findViewById(R.id.imageView3)
        var t2 : ImageView = findViewById(R.id.imageView2)
        val r : ImageView =findViewById(R.id.imageView4)
        val g : ImageView =findViewById(R.id.imageView5)
        var tex : TextView =findViewById<TextView>(R.id.textView) as TextView

        t1.setImageResource(R.drawable.snake_and_ladder)
        t.setImageResource(R.drawable.dice_1)
        val p=mapOf(0 to g, 1 to r)
        var i:Int
        val a = mapOf(1 to 150, 2 to 260, 3 to 370, 4 to 480, 5 to 590, 6 to 670, 7 to 775, 8 to 885, 9 to 995, 10 to 1100,
            20 to 170, 19 to 260, 18 to 370, 17 to 480, 16 to 590, 15 to 670, 14 to 775, 13 to 885, 12 to 995, 11 to 1100,
            21 to 170, 22 to 260, 23 to 370, 24 to 480, 25 to 590, 26 to 670, 27 to 775, 28 to 885, 29 to 995, 30 to 1100,
            40 to 170, 39 to 260, 38 to 370, 37 to 480, 36 to 590, 35 to 670, 34 to 775, 33 to 885, 32 to 995, 31 to 1100,
            41 to 170, 42 to 260, 43 to 370, 44 to 480, 45 to 590, 46 to 670, 47 to 775, 48 to 885, 49 to 995, 50 to 1100,
                60 to 170, 59 to 260, 58 to 370, 57 to 480, 56 to 590, 55 to 670, 54 to 775, 53 to 885, 52 to 995, 51 to 1100,
            61 to 170, 62 to 260, 63 to 370, 64 to 480, 65 to 590, 66 to 670, 67 to 775, 68 to 885, 69 to 995, 70 to 1100,
            80 to 170, 79 to 260, 78 to 370, 77 to 480, 76 to 590, 75 to 670, 74 to 775, 73 to 885, 72 to 995, 71 to 1100,
            81 to 170, 82 to 260, 83 to 370, 84 to 480, 85 to 590, 86 to 670, 87 to 775, 88 to 885, 89 to 995, 90 to 1100,
            100 to 170, 99 to 260, 98 to 370, 97 to 480, 96 to 590, 95 to 670, 94 to 775, 93 to 885, 92 to 995, 91 to 1100)

        val b = mapOf(1 to 160, 2 to 270, 3 to 380, 4 to 490, 5 to 590, 6 to 690, 7 to 799, 8 to 920, 9 to 1050, 10 to 1150,
            20 to 160, 19 to 270, 18 to 380, 17 to 490, 16 to 590, 15 to 690, 14 to 799, 13 to 920, 12 to 1050, 11 to 1150,
            21 to 160, 22 to 270, 23 to 380, 24 to 490, 25 to 590, 26 to 690, 27 to 799, 28 to 920, 29 to 1050, 30 to 1150,
            40 to 160, 39 to 270, 38 to 380, 37 to 490, 36 to 590, 35 to 690, 34 to 799, 33 to 920, 32 to 1050, 31 to 1150,
            41 to 160, 42 to 270, 43 to 380, 44 to 490, 45 to 590, 46 to 690, 47 to 799, 48 to 920, 49 to 1050, 50 to 1150,
            60 to 160, 59 to 270, 58 to 380, 57 to 490, 56 to 590, 55 to 690, 54 to 799, 53 to 920, 52 to 1050, 51 to 1150,
            61 to 160, 62 to 270, 63 to 380, 64 to 490, 65 to 590, 66 to 690, 67 to 799, 68 to 920, 69 to 1050, 70 to 1150,
            80 to 160, 79 to 270, 78 to 380, 77 to 490, 76 to 590, 75 to 690, 74 to 799, 73 to 920, 72 to 1050, 71 to 1150,
            81 to 160, 82 to 270, 83 to 380, 84 to 490, 85 to 590, 86 to 690, 87 to 799, 88 to 920, 89 to 1050, 90 to 1150,
            100 to 150, 99 to 270, 98 to 370, 97 to 490, 96 to 590, 95 to 690, 94 to 799, 93 to 920, 92 to 1050, 91 to 1150)

        t.setOnClickListener {
            val c1 = (1..6).random()
            var i = 0
            mediaPlayer_1?.start()
            when (c1) {
                1 -> t.setImageResource(R.drawable.dice_1)
                2 -> t.setImageResource(R.drawable.dice_2)
                3 -> t.setImageResource(R.drawable.dice_3)
                4 -> t.setImageResource(R.drawable.dice_4)
                5 -> t.setImageResource(R.drawable.dice_5)
                6 -> t.setImageResource(R.drawable.dice_6)
            }

            sum1 = sum1 + c1
            Toast.makeText(this, "Player 1:" + sum1.toString(), Toast.LENGTH_SHORT).show()

            //----------------------------------------------------------------------------
            //SNAKE BITE
            if (sum1 == 16) {
                mediaPlayer?.start()
                sum1 = 8
                p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                p[i]?.animate()?.translationY(-25f)
            }
            if (sum1 == 21) {
                mediaPlayer?.start()
                sum1 = 18
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-125f)
            }
            if (sum1 == 35) {
                mediaPlayer?.start()
                sum1 = 23
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-225f)
            }
            if (sum1 == 48) {
                mediaPlayer?.start()
                sum1 = 29
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-225f)
            }
            if (sum1 == 58) {
                mediaPlayer?.start()
                sum1 = 38
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-325f)
            }
            if (sum1 == 67) {
                mediaPlayer?.start()
                sum1 = 51
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-525f)
            }
            if (sum1 == 87) {
                mediaPlayer?.start()
                sum1 = 65
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-625f)
            }
            if (sum1 == 93) {
                mediaPlayer?.start()
                sum1 = 71
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-725f)
            }
            if (sum1 == 98) {
                mediaPlayer?.start()
                sum1 = 78
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-725f)
            }
            //-----------------------------------------------------------------------------
            //LADDER

            if (sum1 == 2) {
                sum1 = 19
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-125f)
            }
            if (sum1 == 11) {
                sum1 = 31
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-325f)
            }
            if (sum1 == 27) {
                sum1 = 47
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-425f)
            }
            if (sum1 == 39) {
                sum1 = 41
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-425f)
            }
            if (sum1 == 45) {
                sum1 = 66
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-625f)
            }
            if (sum1 == 50) {
                sum1 = 52
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-525f)
            }
            if (sum1 == 57) {
                sum1 = 63
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-625f)
            }
            if (sum1 == 60) {
                sum1 = 80
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-725f)
            }
            if (sum1 == 70) {
                sum1 = 88
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-825f)
            }
            if (sum1 == 76) {
                sum1 = 96
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-925f)
            }
            //---------------------------------------------------------------------
            //SIDE CHANGE
            if (sum1 > 10) {
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-125f)
            }
            if (sum1 > 20) {
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-225f)
            }
            if (sum1 > 30) {
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-325f)
            }
            if (sum1 > 40) {
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-425f)
            }
            if (sum1 > 50) {
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-525f)
            }
            if (sum1 > 60) {
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-625f)
            }
            if (sum1 > 70) {
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-725f)
            }
            if (sum1 > 80) {
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-825f)
            }
            if (sum1 > 90) {
                val translationX = p[i]?.animate()?.translationX((a[sum1])!!.toFloat())
                val translationY = p[i]?.animate()?.translationY(-925f)
            }
            if (sum1 > 100) {
                sum1 = 100
                val translationX = p[i]?.animate()?.translationX((b[(sum1)])!!.toFloat())
                tex.text = "PLAYER WINS"
            }
            //-------------------------------------------------------------------------------------
            else {
                val bal = a[sum1]
                val translationX = p[i]?.animate()?.translationX((bal)!!.toFloat())
            }
        }
        t2.setOnClickListener {
            var j = 1
            val c2 = (1..6).random()
            mediaPlayer_1?.start()
            when (c2) {
                1 -> t.setImageResource(R.drawable.dice_1)
                2 -> t.setImageResource(R.drawable.dice_2)
                3 -> t.setImageResource(R.drawable.dice_3)
                4 -> t.setImageResource(R.drawable.dice_4)
                5 -> t.setImageResource(R.drawable.dice_5)
                6 -> t.setImageResource(R.drawable.dice_6)
            }
            sum2 = sum2 + c2
            Toast.makeText(this, "Player 2:" + sum2.toString(), Toast.LENGTH_SHORT).show()
            //----------------------------------------------------------------------------
            //SNAKE BITE
            if (sum2 == 16) {
                mediaPlayer?.start()
                sum2 = 8
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-25f)
            }
            if (sum2 == 21) {
                mediaPlayer?.start()
                sum2 = 18
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-125f)
            }
            if (sum2 == 35) {
                mediaPlayer?.start()
                sum2 = 23
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-225f)
            }
            if (sum2 == 48) {
                mediaPlayer?.start()
                sum2 = 29
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-225f)
            }
            if (sum2 == 58) {
                mediaPlayer?.start()
                sum2 = 38
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-325f)
            }
            if (sum2 == 67) {
                mediaPlayer?.start()
                sum2 = 51
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-525f)
            }
            if (sum2 == 87) {
                mediaPlayer?.start()
                sum2 = 65
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-625f)
            }
            if (sum2 == 93) {
                mediaPlayer?.start()
                sum2 = 71
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-725f)
            }
            if (sum2 == 98) {
                mediaPlayer?.start()
                sum2 = 78
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-725f)
            }
            //-----------------------------------------------------------------------------
            //LADDER

            if (sum2 == 2) {
                sum2 = 19
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-125f)
            }
            if (sum2 == 11) {
                sum2 = 31
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-325f)
            }
            if (sum2 == 27) {
                sum2 = 47
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-425f)
            }
            if (sum2 == 39) {
                sum2 = 41
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-425f)
            }
            if (sum2 == 45) {
                sum2 = 66
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-625f)
            }
            if (sum2 == 50) {
                sum2 = 52
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-525f)
            }
            if (sum2 == 57) {
                sum2 = 63
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-625f)
            }
            if (sum2 == 60) {
                sum2 = 80
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-725f)
            }
            if (sum2 == 70) {
                sum2 = 88
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-825f)
            }
            if (sum2 == 76) {
                sum2 = 96
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-925f)
            }
            //---------------------------------------------------------------------
            //SIDE CHANGE
            if (sum2 > 10) {
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-125f)
            }
            if (sum2 > 20) {
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-225f)
            }
            if (sum2 > 30) {
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-325f)
            }
            if (sum2 > 40) {
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-425f)
            }
            if (sum2 > 50) {
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-525f)
            }
            if (sum2 > 60) {
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-625f)
            }
            if (sum2 > 70) {
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-725f)
            }
            if (sum2 > 80) {
                val translationX = p[j]?.animate()?.translationX((b[sum2])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-825f)
            }
            if (sum2 > 90) {
                val translationX = p[j]?.animate()?.translationX((b[(sum2)])!!.toFloat())
                val translationY = p[j]?.animate()?.translationY(-925f)
            }
            //-------------------------------------------------------------------------------------
            if (sum2 > 100) {
                sum2 = 100
                val translationX = p[j]?.animate()?.translationX((b[(sum2)])!!.toFloat())
                tex.text = "COMPUTER WINS"
            } else {
                val cal = b[sum2]
                val translationX = p[j]?.animate()?.translationX((cal)!!.toFloat())
            }

        }

    }

}
