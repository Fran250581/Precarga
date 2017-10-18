package com.example.fran.bsquedaconprecarga

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import android.text.TextWatcher
import android.view.View

class MainActivity : AppCompatActivity(), TextWatcher {

    private var seleccion: TextView? = null
    private var edit: AutoCompleteTextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seleccion = findViewById<View>(R.id.seleccion) as TextView?
        edit = findViewById<View>(R.id.edit) as AutoCompleteTextView?
        edit!!.addTextChangedListener(this)
        edit!!.setAdapter(ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, items))
    }

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        seleccion!!.text = edit!!.text
    }

    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
        // necesario para el interface, pero no implementado
    }

    override fun afterTextChanged(s: Editable) {
        // necesario para el interface, pero no implementado
    }

    companion object {
        private val items = arrayOf("En", "un", "lugar", "de", "la", "Mancha", "de", "cuyo", "nombre",
                "no", "quiero", "acordarme", "no", "ha", "mucho", "tiempo", "que", "vivía", "un",
                "hidalgo", "de", "los", "de", "lanza", "en", "astillero", "adarga", "antigua", "rocín",
                "flaco", "y", "galgo", "corredor")
    }
}

