package com.summercompany.recyclerviewexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.summercompany.recyclerviewexample.R
import com.summercompany.recyclerviewexample.SuperHero

//Esta clase coge un listado y lo convierte en una vistaReciclada//Extiende de la clase RecyclerView

//Este ViewHolder se va a llamar con cada uno de los items del listado. con el metodo Inflater.

                        //aqui recibe el listado ( de objeto SuperHero en este caso)
class SuperHeroAdapter(private val superHeroList:List<SuperHero>) : RecyclerView.Adapter<SuperHeroViewHolder>() {
   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
    //este metodo va a devolver al VIEWHOLDER el item_superhero POR CADA OBJETO QUE HAYA DE LA CLASE,
    // por cada objeto que haya de superHeroe con el INFLATE.

       val layoutInflater = LayoutInflater.from(parent.context)    //necesita un CONTEXTO

       return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))

//       val layoutInflater = LayoutInflater.from(parent.context):
//       Aquí se está creando una variable layoutInflater que se inicializa con un objeto LayoutInflater usando el contexto
//       del parent (probablemente un ViewGroup).
//       El LayoutInflater se utiliza para convertir un archivo de diseño XML en un objeto View
//       que se puede agregar a la interfaz de usuario.
//
//
//       Esta línea está devolviendo una instancia de un SuperHeroViewHolder.
//       layoutInflater.inflate(R.layout.item_superhero, parent, false):
//       Aquí, el inflate está inflando el archivo de diseño XML item_superhero.xml para convertirlo en una vista.
//       El tercer parámetro false significa que no se añadirá la vista inflada al parent aún (esto se maneja en otro momento).
//       Finalmente, el SuperHeroViewHolder se crea usando esa vista inflada.
//       En resumen, el código infla un diseño XML (que define cómo se verá un ítem de un superhéroe en la interfaz)
//       y lo pasa al constructor de SuperHeroViewHolder, que probablemente lo usará para mostrar el ítem en un RecyclerView.
//



   }
                    //este metodo va a pasar por cada uno de los items y va a llamar a Render, y asi se transforma cada item

                                        //fijate que NOS DEVUELVE LA INSTANCIA DEL VIEW HOLDER y tb la posicion
   override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item = superHeroList[position]
        holder.render(item)
   }
   //RETORNA, DEVUELVE EL TAMAÑO DEL LISTADO
   override fun getItemCount(): Int {      // =superHeroList.size  otra manera del poner el return sería asi
    superHeroList.size
    return
   }
}