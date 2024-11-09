package com.skover.inventori

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "items")
data class Item(@PrimaryKey(autoGenerate = true) val id: Long,
    var name:String,
    var price:Long,
    var quantity:Long)