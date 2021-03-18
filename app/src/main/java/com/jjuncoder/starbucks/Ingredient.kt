package com.jjuncoder.starbucks

open class Ingredient(private val name: String) {
    open fun getIngredient(): String = "Ingredient: $name"
}

data class Water(private val name: String = "Water") : Ingredient(name)

data class CoffeeBean(private val name: String = "CoffeeBean") : Ingredient(name)

data class Milk(private val name: String = "Milk") : Ingredient(name)