package com.example.ajaysingh.recyclerviewkotlindemo

import android.app.Activity
import android.widget.Toast
//Extension Function .You can Use in  entire Apllication.
fun Activity. showToast( string :String?,vall:Int=Toast.LENGTH_SHORT){
     Toast.makeText(this,string,vall).show()
    normalFun()
 }

//Default Parameter  in kotlin
fun normalFun( value:Int=90){

}
