package com.example.seekbarv3

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alpha.max = 255
        red.max = 255
        green.max = 255
        blue.max = 255






    }

    fun btn(view:View) {


        class CommonListener: SeekBar.OnSeekBarChangeListener {

            var al = 0
            var re = 0
            var gr = 0
            var bl = 0

            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    when(p0?.id) {
                        R.id.alpha -> {
                            al = p1
                        }
                        R.id.red -> {
                            re = p1
                        }
                        R.id.green -> {
                            gr = p1
                        }
                        R.id.blue -> {
                            bl = p1
                        }
                    }


                var myCol = Color.argb(al,re,gr,bl)
                when(view.id){
                    R.id.button1 -> {
                        button1.setBackgroundColor(myCol)
                    }
                    R.id.button2 -> {
                        button2.setBackgroundColor(myCol)
                    }
                    R.id.button3 -> {
                        button3.setBackgroundColor(myCol)
                    }
                    R.id.button4 -> {
                        button4.setBackgroundColor(myCol)
                    }
                    R.id.button5 -> {
                        button5.setBackgroundColor(myCol)
                    }
                    R.id.button6 -> {
                        button6.setBackgroundColor(myCol)
                    }
                    R.id.button7 -> {
                        button7.setBackgroundColor(myCol)
                    }
                    R.id.button8 -> {
                        button8.setBackgroundColor(myCol)
                    }
                    R.id.button9 -> {
                        button9.setBackgroundColor(myCol)
                    }
                }

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}

            override fun onStopTrackingTouch(p0: SeekBar?) {}

        }
        var commonListener = CommonListener()
        alpha.setOnSeekBarChangeListener(commonListener)
        red.setOnSeekBarChangeListener(commonListener)
        green.setOnSeekBarChangeListener(commonListener)
        blue.setOnSeekBarChangeListener(commonListener)
    }

}
