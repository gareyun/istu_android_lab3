package com.example.myadvisor

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adviceList = listOf(
            Advice("Давление в шинах", R.drawable.ic_advice1,
                "Регулярно проверяйте давление для экономии топлива"),
            Advice("Замена масла", R.drawable.ic_advice2,
                "Меняйте масло по регламенту для защиты двигателя"),
            Advice("Жидкости", R.drawable.ic_advice3,
                "Контролируйте уровни всех технических жидкостей"),
            Advice("Зимний набор", R.drawable.ic_advice4,
                "Всегда имейте скребок и щётку зимой")
        )

        findViewById<RecyclerView>(R.id.adviceList).apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = AdviceAdapter(adviceList)
        }
    }
}
