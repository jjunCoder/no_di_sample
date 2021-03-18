package com.jjuncoder.starbucks

import java.util.*
import java.util.concurrent.Callable
import kotlin.reflect.KClass

class Partner(
    val id: String = UUID.randomUUID().toString(),
    private val menuMap: Map<KClass<*>, Callable<Drink>> = mapOf(
        Espresso::class to Callable<Drink> {
            Espresso(Water(), CoffeeBean())
        },
        Americano::class to Callable<Drink> {
            Americano(
                Water(),
                Espresso(Water(), CoffeeBean())
            )
        },
        Latte::class to Callable<Drink> {
            Latte(Milk(), Espresso(Water(), CoffeeBean()))
        },
    )
) {
    fun makeMenu(whichDrink: KClass<*>) = menuMap[whichDrink]?.call()
}