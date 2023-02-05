package com.example.kp6photowall

data class Photo(
    val resource: Int,          //照片
    val title: String,          //標題
    val createdDate: String,    //拍攝日
    val category:String,        //照片分類
)
