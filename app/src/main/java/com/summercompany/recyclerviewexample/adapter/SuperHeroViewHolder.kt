package com.summercompany.recyclerviewexample.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.summercompany.recyclerviewexample.R
import com.summercompany.recyclerviewexample.SuperHero

//EXTIENDE de ViewHolder
class SuperHeroViewHolder(view: View):RecyclerView.ViewHolder(view) { //recibe una view de tipo View


    val superHero = view.findViewById<TextView>(R.id.tvSuperHeroName)
    val realName = view.findViewById<TextView>(R.id.tvRealName)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    val photo = view.findViewById<ImageView>(R.id.ivSuperHero)


//    render: Es el nombre de la función. El nombre podría sugerir que la función es responsable de "renderizar" o "mostrar"
//    datos de un superhéroe en una interfaz de usuario.
//    superHeroModel: SuperHero: El parámetro superHeroModel es de tipo SuperHero.
//    Esto implica que hay una clase llamada SuperHero que contiene información sobre un superhéroe (como su nombre, su editor, etc.).
//

                                // esta FUNCION se va a llamar por cada item del listado de superHero (superHeroList)
    fun render(superHeroModel: SuperHero) {
        superHero.text = superHeroModel.superhero
        realName.text = superHeroModel.realName
        publisher.text = superHeroModel.publisher


    }
}