package com.soprogramacao.listcontats.util

import android.graphics.Color
import java.util.Random


class FormatterRGB {

    companion object{
        fun formaterRGB():Int{


            val random  = Random()

            val r = random.nextInt(0xff)
            val g = random.nextInt(0xff)
            val b = random.nextInt(0xff)

            return Color.rgb(r,g,b)

        }
    }

}