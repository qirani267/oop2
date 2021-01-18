package com.example.uas_oop.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uas_oop.R
import com.example.uas_oop.model.NaraUser

class NaraAdapter (val context: Context):RecyclerView.Adapter<NaraAdapter.UserViewHolder>(){
    private var users: MutableList<NaraUser> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NaraAdapter.UserViewHolder {
        return UserViewHolder(LayoutInflater.from(context).inflate(R.layout.item_nara, parent,false))
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: NaraAdapter.UserViewHolder, position: Int) {
        holder.bindModel(users[position])
    }
    fun setUser(data: List<NaraUser>){
        users.clear()
        users.addAll(data)
        notifyDataSetChanged()
    }
    inner class UserViewHolder(i : View): RecyclerView.ViewHolder(i){
        val tvId: TextView = i.findViewById(R.id.tv_id)
        val tvNama: TextView = i.findViewById(R.id.tv_nama)
        val tvNim: TextView = i.findViewById(R.id.tv_nim)
        fun bindModel(u: NaraUser){
            tvId.text=u.getId().toString()
            tvNama.text=u.getNama()
            tvNim.text=u.getNim()
        }
    }

}