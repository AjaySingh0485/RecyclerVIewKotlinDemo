package com.example.ajaysingh.recyclerviewkotlindemo

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.adapter_layout.view.*

class Adapter( val context: Context, val list:List<Model>):RecyclerView.Adapter<Adapter.ViewHolder>()   {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
 val view= LayoutInflater.from(context).inflate(R.layout.adapter_layout,p0,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val hoobylist=list[p1]
        p0.setdata(hoobylist,p1)

    }

    inner  class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var currenthobby:Model?=null
        var currentPostion:Int=0
        init {
            itemView.setOnClickListener {
                Toast.makeText(context,currenthobby?.tittle+"Clicked",Toast.LENGTH_LONG).show()
                val intent=Intent(context,ExplicitIntentActivity::class.java)
                intent.putExtra("hobby",currenthobby?.tittle)
                context.startActivity(intent)
            }
            itemView.image.setOnClickListener {
                val message: String ="great We sahred implicitly"
                val intent =Intent()
                intent.action=Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT,message)
                intent.type="text/plain"
                context.startActivity(Intent.createChooser(intent,"Please select App"))
            }
        }


fun setdata(hobby:Model?,position:Int){
    itemView.textView.text=hobby!!.tittle
    this.currenthobby=hobby
    this.currentPostion=position
}

    }
}