package com.example.ajaysingh.recyclerviewkotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.explicit_activity.*

class ExplicitIntentActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.explicit_activity)
        val bundle :Bundle?=intent.extras
        val hh=bundle?.getString("hobby")
        showToast(hh)
      //  Toast.makeText(this,hh,Toast.LENGTH_SHORT).show()
        textView2.text=hh

    }
}