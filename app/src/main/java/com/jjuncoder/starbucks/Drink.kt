package com.jjuncoder.starbucks

import android.util.Log

interface Drink {
    fun logIngredient(): String?
}

class Espresso(val water: Water, val coffeeBean: CoffeeBean) : Drink {
    override fun logIngredient(): String {
        Log.d(
            "Starbucks",
            "Espresso created : ${water.getIngredient()} + ${coffeeBean.getIngredient()}"
        )
        return "${water.getIngredient()} + ${coffeeBean.getIngredient()}"
    }
}

class Americano(val water: Water, val espresso: Espresso) : Drink {
    override fun logIngredient(): String? {
        Log.d(
            "Starbucks",
            "Americano created : ${water.getIngredient()} + ${espresso.logIngredient()}"
        )
        return null
    }
}

class Latte(val milk: Milk, val espresso: Espresso) : Drink {
    override fun logIngredient(): String? {
        Log.d("Starbucks", "Latte created : ${milk.getIngredient()} + ${espresso.logIngredient()}")
        return null
    }
}