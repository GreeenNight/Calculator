package com.example.calculator

//import androidx.appcompat.app.AppCompatActivity
//import android.widget.Button
import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator2.R
//import kotlinx.android.synthetic.main.activity_main.*

//import android.widget.TextView
//import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //findViewById(R.id.btn_0).setOnClickListener { setTextFields("0")}

        var btn_0 = findViewById<TextView>(R.id.btn_0)
        btn_0.setOnClickListener { setTextFields("0") }
        var btn_1 = findViewById<TextView>(R.id.btn_1)
        btn_1.setOnClickListener { setTextFields("1") }
        var btn_2 = findViewById<TextView>(R.id.btn_2)
        btn_2.setOnClickListener { setTextFields("2") }
        var btn_3 = findViewById<TextView>(R.id.btn_3)
        btn_3.setOnClickListener { setTextFields("3") }
        var btn_4 = findViewById<TextView>(R.id.btn_4)
        btn_4.setOnClickListener { setTextFields("4") }
        var btn_5 = findViewById<TextView>(R.id.btn_5)
        btn_5.setOnClickListener { setTextFields("5") }
        var btn_6 = findViewById<TextView>(R.id.btn_6)
        btn_6.setOnClickListener { setTextFields("6") }
        var btn_7 = findViewById<TextView>(R.id.btn_7)
        btn_7.setOnClickListener { setTextFields("7") }
        var btn_8 = findViewById<TextView>(R.id.btn_8)
        btn_8.setOnClickListener { setTextFields("8") }
        //var btn_9 = findViewById<TextView>(R.id.btn_9)
        //btn_9.setOnClickListener { setTextFields("9") }
        findViewById<TextView>(R.id.btn_9).setOnClickListener { setTextFields("9") }

        findViewById<TextView>(R.id.minus_btn).setOnClickListener { setTextFields("-") }
        findViewById<TextView>(R.id.pluss_btn).setOnClickListener { setTextFields("+") }
        findViewById<TextView>(R.id.division_btn).setOnClickListener { setTextFields("/") }
        findViewById<TextView>(R.id.multiply_btn).setOnClickListener { setTextFields("*") }
        findViewById<TextView>(R.id.left_bracket_btn).setOnClickListener { setTextFields("(") }
        findViewById<TextView>(R.id.right_bracket_btn).setOnClickListener { setTextFields(")") }
        var math_operation = findViewById<TextView>(R.id.math_operation)
        findViewById<TextView>(R.id.AC_btn).setOnClickListener { math_operation.text = ""
            findViewById<TextView>(R.id.result_text)
        }

        findViewById<TextView>(R.id.back_btn).setOnClickListener {
            val str = math_operation.text.toString()
            if(str.isNotEmpty())
                math_operation.text = str.substring(0, str.length - 1)
            findViewById<TextView>(R.id.result_text).text = ""

        }











    }




    fun setTextFields(str: String) {
        findViewById<TextView>(R.id.math_operation).append(str)
    }


}