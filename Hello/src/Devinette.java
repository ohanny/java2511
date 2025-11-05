import java.util.Random;
import java.io.*;

/**
 * Ce programme fait deviner à l'utilisateur un nombre entier secret compris entre 0 et 99. 
 * L'utilisateur a 6 essais, au maximum, pour découvrir le nombre, et est informé après chaque 
 * tentative si le nombre est plus grand, plus petit ou égal au nombre cherché. 
 */
public class Devinette {

    public static void main(String[] args) throws Exception {

        // Création d’un objet pour lire la saisie clavier :
        BufferedReader clavier =
            new BufferedReader(new InputStreamReader(System.in));

        // Génération du nombre aléatoire (déjà fait pour vous)
        Random aleatoire = new Random();
        int nombreSecret = aleatoire.nextInt() % 100;
        if (nombreSecret < 0) {
            nombreSecret = -nombreSecret;
        }

        // Variables utiles pour le jeu
        int nbEssai = 1;
        int valeur = 0;
        boolean trouve = false;

        // Début du jeu : afficher un message d’accueil
        System.out.println("=== Jeu de la devinette ===");
        System.out.println("J’ai choisi un nombre entre 0 et 99. À vous de deviner !");
        System.out.println("Vous avez 6 essais maximum.");

        // À vous de compléter ici ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

        /* Objectif :
           Répéter les actions suivantes tant que :
             - le joueur n’a pas trouvé le bon nombre ET
             - il n’a pas dépassé 6 essais

           À chaque tour :
             1. Demander une saisie clavier avec :
                System.out.println("Essai " + nbEssai + " : saisissez un nombre");
                valeur = Integer.parseInt(clavier.readLine());

             2. Comparer la valeur saisie avec le nombre secret :
                - si la valeur est plus petite → afficher "Trop petit"
                - si la valeur est plus grande → afficher "Trop grand"
                - sinon → afficher "Bravo !" et mettre trouve = true

             3. Incrémenter nbEssai (nbEssai = nbEssai + 1)
        */

        // ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

        // Fin du jeu
        if (trouve) {
            System.out.println("Bravo ! Le nombre secret était " + nombreSecret);
            System.out.println("Vous l’avez trouvé en " + nbEssai + " essais.");
        } else {
            System.out.println("Perdu. Le nombre secret était " + nombreSecret);
        }
    }
}
