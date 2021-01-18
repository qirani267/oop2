package com.example.uas_oop.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uas_oop.R
import com.example.uas_oop.model.QiraniDosen

//adapter komponen recycleview = menyeting / wadah untuk menampilkan sebuah data
class QiraniAdapter (val context: Context):RecyclerView.Adapter<QiraniAdapter.DosenViewHolder>(){
    private var dosen: MutableList<QiraniDosen> = mutableListOf()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): QiraniAdapter.DosenViewHolder {
        return DosenViewHolder(LayoutInflater.from(context).inflate(R.layout.item_qirani, parent,false))
    }

    override fun getItemCount(): Int {
        return dosen.size
    }

    override fun onBindViewHolder(holder: QiraniAdapter.DosenViewHolder, position: Int) {
        holder.bindModel(dosen[position])
    }
    //untuk memastikan data ada atau tidak
    fun setDosen(data: List<QiraniDosen>){
        dosen.clear()
        dosen.addAll(data)
        notifyDataSetChanged()
    }

    inner class DosenViewHolder(i : View):RecyclerView.ViewHolder(i){
        val tvId: TextView = i.findViewById(R.id.tv_id) //
        val tvNama: TextView = i.findViewById(R.id.tv_nama)
        val tvNipy: TextView = i.findViewById(R.id.tv_nipy)
        fun bindModel(u: QiraniDosen){
            tvId.text=u.getId().toString()
            tvNama.text=u.getNama()
            tvNipy.text=u.getNipy()
        }
    }
}