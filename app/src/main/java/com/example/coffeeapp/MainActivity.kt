import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import com.hfad.coffeeapp.R
import android.widget.ArrayAdapter;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Find the Spinner views by their IDs
        // Find the Spinner views by their IDs
        val hotCoffeeSpinner = findViewById<Spinner>(R.id.hot_coffee)
        val coldCoffeeSpinner = findViewById<Spinner>(R.id.cold_coffee)

        // Create ArrayAdapter for Hot Coffee Spinner
        val hotCoffeeAdapter = ArrayAdapter.createFromResource(this, R.array.hot_coffee, android.R.layout.simple_spinner_item)
        hotCoffeeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        hotCoffeeSpinner.adapter = hotCoffeeAdapter

        // Create ArrayAdapter for Cold Coffee Spinner
        val coldCoffeeAdapter = ArrayAdapter.createFromResource(this, R.array.cold_coffee, android.R.layout.simple_spinner_item)
        coldCoffeeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        coldCoffeeSpinner.adapter = coldCoffeeAdapter
    }
}