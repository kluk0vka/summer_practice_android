package com.example.summer_practice_android

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carCountEditText = findViewById<EditText>(R.id.car_count)
        val startRaceButton = findViewById<Button>(R.id.start_race_button)

        startRaceButton.setOnClickListener {
            val carCountText = carCountEditText.text.toString()
            if (carCountText.isNotEmpty()) {
                val carCount = carCountText.toInt()
                val cars = raceParticipants(carCount)
                startRace(cars)
            }
        }
    }

    private fun raceParticipants(count: Int): List<Auto> {
        val models = listOf("Camaro", "Corolla", "Camry", "Avalon", "Land Cruiser", "Mustang", "Wigo")
        val brands = listOf("BMW", "Mercedes-Benz", "Toyota", "Chevrolet", "Honda", "Tesla", "Ford")
        val colors = listOf("Green", "Pink", "Blue", "White", "Silver", "Red", "Black")

        return List(count) { i ->
            Auto(
                model = models.random(),
                brand = brands.random(),
                number = i + 1,
                year = (1885..2024).random(),
                color = colors.random(),
                maxSpeed = (50..533).random()
            )
        }
    }

    private fun startRace(cars: List<Auto>) {
        var round = 1
        var participants = cars.toMutableList()

        while (participants.size > 1) {
            println("--- Раунд $round ---")
            val winners = mutableListOf<Auto>()

            val pairs = participants.shuffled().chunked(2)
            for (pair in pairs) {
                if (pair.size == 2) {
                    val car1 = pair[0]
                    val car2 = pair[1]


                    val winner = if (car1.maxSpeed > car2.maxSpeed) car1 else car2
                    println("Гонка между ${car1.number} и ${car2.number}, Победитель ${winner.number}")
                    winners.add(winner)
                } else {
                    println("${pair[0].number} - Нет пары, следующий круг")
                    winners.add(pair[0])
                }
            }


            participants = winners
            round++
        }

        println("Победитель: ${participants[0].number}")
    }
}