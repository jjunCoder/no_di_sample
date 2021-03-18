package com.jjuncoder.starbucks

import android.util.Log

class Starbucks {
    init {
        val partner1 = Partner()
        Log.d("Starbucks", "Partner1 : ${partner1.id}")

        val partner2 = Partner()
        Log.d("Starbucks", "Partner2 : ${partner2.id}")

        partner1.makeMenu(Americano::class)?.let {
            Log.d("Starbucks", "\nAmericano 1 : $it")
            it.logIngredient()
        }

        partner1.makeMenu(Americano::class)?.let {
            Log.d("Starbucks", "\nAmericano 2 : $it")
            it.logIngredient()
        }

        partner2.makeMenu(Latte::class)?.logIngredient()
    }
}
