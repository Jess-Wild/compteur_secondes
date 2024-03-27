public class SecondesAu21emeSiecle {
    public static void main(String... args) {

        TempsPasse compteurSecondes = new TempsPasse();

        for(int annee = 2000; annee < 2018; annee++){
            compteurSecondes.ajouteAnnee(annee);
        }
        for(int mois = 1; mois < 4; mois++){
            compteurSecondes.ajouteMois(mois, false);
        }

        compteurSecondes.ajouteHeures(14);
        compteurSecondes.ajouteMinutes(28);
        compteurSecondes.ajouteSecondes(32);

        System.out.println("Au 21ème siècle il y a eu " + compteurSecondes.nbSecondes + " secondes.");
    }
}