class Voiture (private var  marque: String, private var couleur: String, private var prix: Double, private var modele: String, private var vitesse: Double = 0.0) {
    fun demarrer():Unit {
        println("La voiture $marque $modele $couleur au prix de $prix € a démarré.")
    }

    fun accelerer(increment: Int):Unit {
        vitesse += increment
        println("La voiture $marque $modele $couleur au prix de $prix € accélère à $vitesse km/h.")
    }

    fun freiner():Unit {
        vitesse = 0.0
        println("La voiture $marque $modele $couleur au prix de $prix € s'est arrêtée.")
    }
}

class CompteBancaire (private var numeroDeCompte: String, private var nomDuTitulaire: String, private var solde: Double, private var nomDeLaBanque: String) {
    fun getNumeroDeCompte():String {
        return numeroDeCompte
    }

    fun setNumeroDeCompte(numero: String) {
        numeroDeCompte = numero
    }

    fun getNomDuTitulaire():String {
        return nomDuTitulaire
    }

    fun setNomDuTitulaire(nom: String) {
        nomDuTitulaire = nom
    }

    fun getSolde():Double {
        return solde
    }

    fun setSolde(montant: Double) {
        solde = montant
    }

    fun getNomDeLaBanque():String {
        return nomDeLaBanque
    }

    fun setNomDeLaBanque(nom: String) {
        nomDeLaBanque = nom
    }

    fun deposer(montant: Double) {
        if (montant > 0) {
            solde += montant
            println("Montant déposé: \$$montant. Nouveau solde: \$$solde.")
        } else {
            println("Le montant doit être positif.")
        }
    }

    fun retirer(montant: Double) {
        if (montant > 0) {
            solde -= montant
            println("Montant retiré: \$$montant. Nouveau solde: \$$solde.")
        } else {
            println("Le montant doit être positif.")
        }
    }

    fun ouvrirCompte() {
        println("Compte numéro $numeroDeCompte au nom de $nomDuTitulaire ouvert avec succès.")
    }

    fun cloturerCompte() {
        println("Compte numéro $numeroDeCompte au nom de $nomDuTitulaire clôturé avec succès.")
    }
}

fun main (){
    val voiture1 = Voiture("BMW", "Phytonic Blue", 62500.0, "X3")
    voiture1.demarrer()
    voiture1.accelerer(50)
    voiture1.freiner()

    val voiture2 = Voiture("Tesla", "Red Cherry", 49500.0, "Y")
    voiture2.demarrer()
    voiture2.accelerer(130)
    voiture2.freiner()

    val compte1 = CompteBancaire("213", "Bassem MEGHICHE", 1300.0, "La Banque Postale")

    compte1.deposer(50.0)
    compte1.retirer(15.0)
    compte1.ouvrirCompte()
    compte1.cloturerCompte()

    val compte2 = CompteBancaire("14", "Toto", 100.0, "BNP")

    compte2.deposer(25.0)
    compte2.retirer(10.0)
    compte2.ouvrirCompte()
    compte2.cloturerCompte()
}



