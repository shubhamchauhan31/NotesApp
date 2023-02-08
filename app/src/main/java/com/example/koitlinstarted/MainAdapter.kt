package com.example.koitlinstarted

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.card.MaterialCardView
import kotlin.coroutines.coroutineContext

class MainAdapter(var details:List<MainModel>,var context:Context) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    private var selectedItemPosition:Int = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var layout=LayoutInflater.from(parent.context).inflate(R.layout.custom_profile_details,parent,false);
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var profile=details[position]
        holder.userName.text=profile.nane
        holder.userJobProfiles.text=profile.jobProfile
        holder.userAge.text=profile.age
//        Glide.with(context).load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3fsAqK9a8CeatPdyR6HkaIJyZsQEkKAKqsaNC0rEcaQ&s").into(holder.userImage)
        Glide.with(context).load(profile.userImg).into(holder.userImage)
//        onClickListener.onClick(profile.nane,profile.age,profile.jobProfile)


        holder.itemView.setOnClickListener {
            selectedItemPosition==position
            notifyDataSetChanged() 

//            if (selectedItemPosition==position){
////                selectedItemPosition++
//                holder.cardView.setBackgroundColor(Color.parseColor("#00FF00"))
//
//
//
//            }else{
//                holder.cardView.setBackgroundColor(Color.parseColor("#1B89BA"))
//
//            }

        }


    }

    override fun getItemCount(): Int {
       return details.size
    }

    class ViewHolder(private var itemView:View) :RecyclerView.ViewHolder(itemView){
        var userName=itemView.findViewById<TextView>(R.id.custom_profile_details_name);
        var userJobProfiles=itemView.findViewById<TextView>(R.id.custom_profile_details_des);
        var userAge=itemView.findViewById<TextView>(R.id.custom_profile_details_age);
        var cardView=itemView.findViewById<MaterialCardView>(R.id.profile_details)
        var userImage=itemView.findViewById<ImageView>(R.id.custom_profile_details_img)

    }
}