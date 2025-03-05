package com.summercompany.recyclerviewexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.summercompany.recyclerviewexample.SuperHero

//Esta clase coge un listado y lo convierte en una vistaReciclada//Extiende de la clase RecyclerView


//Este ViewHolder se va a llamar con cada uno de los items del listado. con el metodo Inflater.

                        //aqui recibe el listado ( de objeto SuperHero en este caso)
class SuperHeroAdapter(val superHeroList:List<SuperHero>) : RecyclerView.Adapter<SuperHeroViewHolder>() {
   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
    //este metodo va a devolver al VIEWHOLDER el item_superhero POR CADA OBJETO QUE HAYA DE LA CLASE, por cada objeto que haya de superHeroe
    //con el INFLATE.

       val layoutInflater = LayoutInflater.from()





   }

   override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {

   }
   //RETORNA, DEVUELVE EL TAMAÑO DEL LISTADO
   override fun getItemCount(): Int {      // =superHeroList.size  otra manera del poner el return sería asi
    superHeroList.size
    return
   }
}