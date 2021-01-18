package com.example.uas_oop.model

import io.realm.RealmObject
import io.realm.annotations.RealmClass

@RealmClass
// table
open class QiraniDosen : RealmObject() {
    private var id: Int=0
    private var nama:String=""
    private var nipy:String=""

    fun setId(id:Int){
        this.id =id
    }
    fun getId():Int{
        return id
    }
    fun setNama(nama:String){
        this.nama=nama
    }
    fun getNama():String{
        return nama
    }
    fun setNipy(nipy:String){
        this.nipy=nipy
    }
    fun getNipy():String{
        return nipy
    }
}