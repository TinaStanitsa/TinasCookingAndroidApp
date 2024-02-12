package com.tina.tinascooking.utilities

import android.widget.ImageView
import com.bumptech.glide.Glide


fun ImageView.loadImageUrl(url: String?, placeholder: Int){
    Glide.with(this)
        .load(url)
        .fitCenter()
        .placeholder(placeholder)
        .into(this)
}