package com.example.myfirstapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.util.Log
import android.view.ViewGroup
import androidx.core.view.setPadding

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var container: ViewGroup

    // Оголошення змінних
    private val x = 30
    private val y = 40
    private val z = 50

    private val a = 10
    private val b = 5
    private val c = 20
    private val d = 4

    private val a2 = 9
    private val b2 = 2
    private val c2 = 70
    private val d2 = 7

    private val a3 = 3
    private val b3 = 19
    private val c3 = 20
    private val d3 = 9

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        container = findViewById(R.id.mainLayout)

        button.setOnClickListener {
            // Розрахунки з підставленими значеннями змінних
            val result1 = (x > y) && (z > x) || (y > z)
            val result2 = (a + b > c) && ((a - b) < c)
            val result3 = ((a2 - b) * c) * d * 2 + a % d - (c * d)
            val result4 = ((a2 * c2) / b2) / d2 + 10 * a2 % b2 - (a2 / d2)
            val result5 = ((a3 + c3) / d3) * a3 - 3 + 7 * (a3 - d3) - (c3 * d3)

            val results = listOf(
                "1) (x > y) && (z > x) || (y > z) = $result1",
                "2) (a + b > c) && ((a - b) < c) = $result2",
                "3) ((a - b) * c) * d * 2 + a % d - (c * d) = $result3",
                "4) ((a * c) / b) / d + 10a % b - (a / d) = $result4",
                "5) ((a + c) / d) * a - 3 + 7*(a - d) - (c * d) = $result5"
            )

            // Видалити попередні результати перед додаванням нових
            container.removeAllViews()

            results.forEach { text ->
                val textView = TextView(this)
                textView.text = text
                textView.textSize = 16f
                textView.setPadding(16)

                container.addView(textView)
            }
        }
    }
}