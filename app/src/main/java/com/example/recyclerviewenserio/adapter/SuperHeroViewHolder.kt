package com.example.recyclerviewenserio.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewenserio.SuperHero
import com.example.recyclerviewenserio.databinding.ItemSuperheroBinding



class SuperHeroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)


    fun render( superHeroModel: SuperHero){
        binding.tvSuperHeroName.text = superHeroModel.superhero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        binding.tvPower.text = superHeroModel.power
        binding.tvAge.text = superHeroModel.age.toString()

        Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo).into(binding.ivSuperHero)
        binding.ivSuperHero.setOnClickListener {Toast.makeText(binding.ivSuperHero.context,
            superHeroModel.realName,
            Toast.LENGTH_SHORT).show()}

        itemView.setOnClickListener {Toast.makeText(binding.ivSuperHero.context,
            superHeroModel.realName,
            Toast.LENGTH_SHORT).show()}

    }
}