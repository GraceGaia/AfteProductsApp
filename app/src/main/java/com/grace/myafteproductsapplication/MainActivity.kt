package com.grace.myafteproductsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CursorAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var productsList:ListView? = null
    var adapter:CustomAdapter? = null
    var products:ArrayList<Item>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        productsList = findViewById(R.id.mListProducts)
        products = ArrayList()
        adapter = CustomAdapter(this,products!!)

        var products1 = Item(R.drawable.heart,"Rice","Pilau Mwea","Ksh.200")
        var products2 = Item(R.drawable.stocck,"Meat","KFC","Ksh.600")
        var products3 = Item(R.drawable.leaf,"Chapati","Exe","Ksh.300")
        var products4 = Item(R.drawable.heart,"Mashakura","Daawat","Ksh.500")
        var products5 = Item(R.drawable.stocck,"Omena","L.Victoria","Ksh.250")
        var products6 = Item(R.drawable.leaf,"Maandazi","Exe All Purpose","Ksh.500")
        var products7 = Item(R.drawable.heart,"Spaghetti","Santa Maria","Ksh.90")
        var products8 = Item(R.drawable.stocck,"Nyama Choma","Kamakis","Ksh.700")
        var products9 = Item(R.drawable.leaf,"Samosa","Street Kitchen","Ksh.30")
        products!!.add(products1)
        products!!.add(products2)
        products!!.add(products3)
        products!!.add(products4)
        products!!.add(products5)
        products!!.add(products6)
        products!!.add(products7)
        products!!.add(products8)
        products!!.add(products9)
        productsList!!.adapter = adapter
    }
}