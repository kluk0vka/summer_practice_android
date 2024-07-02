package com.example.summer_practice_android

open class Auto (
    val model: String,
    val brand: String,
    val number: Int,
    val year: Int,
    val color: String,
    val maxSpeed: Int
){
    fun printInfo() {
        println("Model: $model, brand: $brand, number: $number, year: $year, color: $color, " +
                "maximum speed: $maxSpeed")
    }
}

class Pickup (
    model: String,
    brand: String,
    number: Int,
    year: Int,
    color: String,
    maxSpeed: Int,
    val typeOfDrive: String
) : Auto(model, brand, number, year, color, maxSpeed)

class Sedan (
    model: String,
    brand: String,
    number: Int,
    year: Int,
    color: String,
    maxSpeed: Int,
    val sizeOfTrunk: Int
) : Auto(model, brand, year, number, color, maxSpeed)

class Minivan (
    model: String,
    brand: String,
    number: Int,
    year: Int,
    color: String,
    maxSpeed: Int,
    val numberOfSeats: Int
) : Auto(model, brand, year, number, color, maxSpeed)

class Cabriolet  (
    model: String,
    brand: String,
    number: Int,
    year: Int,
    color: String,
    maxSpeed: Int,
    val enginePower: Int
) : Auto(model, brand, year, number, color, maxSpeed)

class Limousine (
    model: String,
    brand: String,
    number: Int,
    year: Int,
    color: String,
    maxSpeed: Int,
    val length: Int
) : Auto(model, brand, year, number, color, maxSpeed)




class AutoBuild(private var number: Int) {
    private var model: String = ""
    private var brand: String = ""
    private var year: Int = 0
    private var color: String = ""
    private var maxSpeed: Int = 0

    fun setModel(model: String) = apply { this.model = model }
    fun setBrand(brand: String) = apply { this.brand = brand }
    fun setYear (year: Int) = apply { this.year = year }
    fun setColor (color: String) = apply { this.color = color }
    fun setmaxSpeed (maxSpeed: Int) = apply { this.maxSpeed = maxSpeed }

    fun build(): Auto {
        return Auto(model, brand, number, year, color, maxSpeed)
    }
}