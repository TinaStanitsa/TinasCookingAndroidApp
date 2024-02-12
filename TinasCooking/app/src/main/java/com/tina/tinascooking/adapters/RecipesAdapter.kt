package com.tina.tinascooking.adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.RecyclerView
import com.tina.tinascooking.R
import com.tina.tinascooking.dataclasses.Recipe
import com.tina.tinascooking.utilities.loadImageUrl

class RecipesAdapter(private val recipes: List<Recipe>, private val navigateTo: (Bundle) -> Unit) :
    RecyclerView.Adapter<MyViewHolder>() {

    override fun getItemCount(): Int {
        return recipes.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recipe_card_view, parent, false)

        return MyViewHolder(view, navigateTo)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.recipeText.text = recipes[position].recipeTitle
        holder.recipeImage.loadImageUrl(recipes[position].image, R.drawable.mousakas)
        holder.imageURL = recipes[position].image
        holder.execution = recipes[position].execute

    }
}

class MyViewHolder(view: View, navigateTo: (Bundle) -> Unit) : RecyclerView.ViewHolder(view) {
    val recipeText: TextView
    val recipeImage: ImageView
    var wholeView: View

    var imageURL = ""
    var execution = ""

    init {

        recipeText = view.findViewById(R.id.recipe_title)
        recipeImage = view.findViewById(R.id.recipe_image)
        wholeView = view.findViewById(R.id.card_view)

        wholeView.setOnClickListener {
            val bundle = bundleOf(
                "recipe_title" to recipeText.text.toString(),
                "imageURL" to imageURL,
                "execution" to execution
            )
            navigateTo(bundle)
        }
    }


}