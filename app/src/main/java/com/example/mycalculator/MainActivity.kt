package com.example.mycalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var etInput1:TextInputEditText
    lateinit var tilInput2:TextInputLayout
    lateinit var etInput2:TextInputEditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnMultiply:Button
    lateinit var btnDivision:Button
    lateinit var tvAnswer:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etInput1=findViewById(R.id.etInput1)
        etInput2=findViewById(R.id.etInput2)
        tvAnswer=findViewById(R.id.tvAnswer)

        btnSubtract=findViewById(R.id.btnSubtract)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnDivision=findViewById(R.id.btnDivision)

    }

    fun calculation(){
        btnAdd.setOnClickListener {

            val tilInput1=etInput1!!.text.toString().toDouble()
            val tilInput2=etInput2!!.text.toString().toDouble()
            val answer=tilInput1!!+tilInput2!!
            tvAnswer!!.text=answer.toString()
        }


        btnSubtract.setOnClickListener {
            calculation()
            val tilInput1=etInput1!!.text.toString().toDouble()
            val tilInput2=etInput2!!.text.toString().toDouble()
            val answer=tilInput1!!-tilInput2!!
            tvAnswer!!.text=answer.toString()
        }
        btnMultiply.setOnClickListener {
            calculation()
            val tilInput1=etInput1!!.text.toString().toDouble()
            val tilInput2=etInput2!!.text.toString().toDouble()
            val answer=tilInput1!!*tilInput2!!
            tvAnswer!!.text=answer.toString()
        }
        btnDivision.setOnClickListener {
            calculation()
            val tilInput1=etInput1!!.text.toString().toDouble()
            val tilInput2=etInput2!!.text.toString().toDouble()
            val answer=tilInput1!!/tilInput2!!
            tvAnswer!!.text=answer.toString()
        }
}
}