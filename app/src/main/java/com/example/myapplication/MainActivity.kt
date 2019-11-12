package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), TextWatcher {

    private var editName: EditText? = null
    private var editAge: EditText? = null
    private var name: String? = null
    private var age: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editName = findViewById<EditText>(R.id.editText_Name)
        editAge = findViewById<EditText>(R.id.editText_Age)

        editName?.addTextChangedListener(this)
        editAge?.addTextChangedListener(this)
    }

    override fun afterTextChanged(s: Editable?) {
        
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        Toast.makeText(this, s.toString(), Toast.LENGTH_SHORT ).show()
    }

}
