package com.example.shoppinglist.shoppinglist

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "product_table")
data class Product(

    @ColumnInfo(name = "product_quantity")
    var quantity: Int,

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "product_name")
    var productName: String


) : Parcelable