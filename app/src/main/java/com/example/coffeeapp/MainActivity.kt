package com.example.coffeeapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val findCoffee = findViewById<Button>(R.id.find_coffee)
        findCoffee.setOnClickListener {
            val coffeeCategorySpinner = findViewById<Spinner>(R.id.coffee_category)
            val category = coffeeCategorySpinner.selectedItem.toString()
            val coffeeList = getCoffees(category)
            val coffeeBrands = findViewById<TextView>(R.id.coffee_brands)
            val coffeeText = coffeeList.joinToString("\n")
            coffeeBrands.text = coffeeText
        }
    }

    private fun getCoffees(category: String): List<String> {
        return when (category) {
            "Hot Coffee" -> listOf("Espresso", "Caffee Latte", "Cappuccino")
            "Cold Coffee" -> listOf("Iced Caffe Americano", "Nitro Cold Brew", "Iced Coffee")
            "Tea" -> listOf("Green Tea", "Black Tea", "Herbal Tea")
            else -> listOf("Lemonade", "Soda", "Fruit Punch")
        }
    }
}
