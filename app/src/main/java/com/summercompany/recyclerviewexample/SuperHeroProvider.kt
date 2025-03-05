package com.summercompany.recyclerviewexample

class SuperHeroProvider {

    //Un objeto compañero o companion object es la representación de un miembro que se puede llamar directamente
    // del nombre de una clase, sin la creación previa
    // de una instancia de dicha clase. METODO ESTÁTICO

    companion object{

        //objeto de clase SuperHero, llamado en este caso superHeroFirst
        val superHeroList = listOf<SuperHero>(

            SuperHero("Kotlinman", "Jetbrains", "Arsenio", "https//"),
            SuperHero("Jon", "jet", "Antonio", "https//"),
            SuperHero("Pepa", "Jet","Fajardo", "https//"),
            SuperHero("Chunda", "Jet", "Fermin", "https//"),
            SuperHero("Walter", "Dc", "Sisi", "https//"),
            SuperHero("Chocho", "Dc", "Juana", "https//"),
            SuperHero("Pencawoman", "oreo", "Rosa", "https//")


        )
    }
}