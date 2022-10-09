import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel exercice ? Saisissez :");
        System.out.println("[1] Discriminant");
        System.out.println("[2] Parite d'un nombre");
        System.out.println("[3] Calcul d'extremum");
        System.out.println("[4] Egalite entre chaine de caracteres");
        System.out.println("[5] Factorielle");
        System.out.println("[6] Compte a rebours");
        System.out.println("[7] Valeurs de carrés");
        System.out.println("[8] Table de multiplication");
        System.out.println("[9] Division d'entier");
        System.out.println("[10] Regle graduee");
        System.out.println("[11] Nombres premiers");
        System.out.println("[12] Manipulation sur tableau");
        System.out.println("[13] Inverser un tableau");
        System.out.print("\nChoisissez un exercice : ");

        int exo = scanner.nextInt();

        switch(exo)
        {
            case 1:
                discriminant();
                break;
            case 2:
                parite();
                break;
            case 3:
                max();
                break;
            case 4:
                egaliteStr();
                break;
            case 5:
                factorielle();
                break;
            case 6:
                countdown();
                break;
            case 7:
                carres();
                break;
            case 8:
                tableMultiplication();
                break;
            case 9:
                division();
                break;
            case 10:
                regle();
                break;
            case 11:
                nombrePremier();
                break;
            case 12:
                initialisationTableau();
                break;
            case 13:
                inverseTableau(new int[] {4,3,1,8});
        }
    }

    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un premier nombre :");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Le nombre" + a + "est pair");
        } else {
            System.out.println("Le nombre " + a + " est impart");
        }
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Premier entier");
        int a = scanner.nextInt();
        System.out.println("deuxieme entier");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Le maximum est " + a);
        } else {
            System.out.println("Le maximum est " + b);
        }

    }

    public static void countdown() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("BOOM !");
    }

    public static void carres() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisir un entier positif ou nul : ");
        int n = scanner.nextInt();
        System.out.print("    ");
        System.out.println(n * n);
    }

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {        // on traite le cas de racines complexes conjuguées
            System.out.println("Ce polynome n'a pas de racine réelle");
            String x = String.valueOf(-b/(2.0*a));
            String xi = String.valueOf(Math.sqrt(-delta)/(2*a));
            String x0 = x + " + i" + xi;
            String x1 = x + " - i" + xi;
            System.out.println("Racine x0 = " + x0 + "\nRacine x1 = " + x1);
        } else if (delta == 0) {
            double racine_double = -b / 2 * a;
            System.out.println("La racine double du polynome est : " + racine_double);
        } else {
            double racine1 = (-b + Math.sqrt(delta)) / 2 * a;
            double racine2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("Les racines sont : " + racine1 + " et " + racine2);
        }
    }

    public static void egaliteStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une chaine de caractères");
        String a = scanner.next();
        System.out.println("Entrez une autre chaine de caractères");
        String b = scanner.next();
        if (a.equals(b)) {
            System.out.println("Ce sont les mêmes chaines");
        } else {
            System.out.println("Ce ne sont pas les mêmes chaines");
        }
    }

    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }

    public static void tableMultiplication()
    {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++)
            {
                System.out.print(i*j + " ");
            }
            System.out.print("\n");
        }
    }
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un premier nombre entier");
        double v1 = scanner.nextInt();
        System.out.println("Saisir un deuxieme nombre entier");
        double v2;
        do { // si le dénominateur est égal à 0 on demande une autre valeur
            System.out.println("Saisir un entier différent de 0");
            v2 = scanner.nextInt();
        } while (v2 == 0);
        double divis = v1 / v2;
        System.out.println("La résultat est : " + divis);
    }

    public static void regle() {
        Scanner scanner = new Scanner(System.in);
        int longueur;
        // l'utilisateur doit saisir une nouvelle valeur tant que ce n'est pas un entier positif
        do {
            System.out.println("Saisir un entier positif");
            longueur = scanner.nextInt();
        } while (longueur < 0);

        // affichage de la regle graduée

        System.out.print("|");
        for (int i = 1; i <= longueur; i++) {
            if (i % 10 == 0) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }

        }
    }

    public static void nombrePremier(){
        // Récupération de la valeur d'entrée :

        Scanner scanner = new Scanner(System.in);
        int number;
        do {      // l'utilisateur doit saisir une nouvelle valeur tant que ce n'est pas un entier positif
            System.out.println("Saisir un entier positif");
            number = scanner.nextInt();
        } while (number < 0);

        // Test de la primalité du nombre :
        int diviseurs = 0;
        for(int i = 1; i <= number ; i++){
            if (number % i == 0){
                diviseurs++;
            }
        }
        if (diviseurs==2){
            System.out.println("Le nombre : " + number + " est premier !");
        }
        else{
            System.out.println("Le nombre : " + number + " n'est pas premier !");
        }
    }

    public static void initialisationTableau() {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[4];
        System.out.println("Nous allons créer un tableau de 4 valeurs");
        for (int i = 0; i < tab.length; i++) { // pour tous les éléments du tableau
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt(); // on stocke la valeur d'entrée saisie par l'utilisateur
            tab[i] = entier; // on stocke la valeur dans le tableau
        }
        System.out.println("Le tableau entré par l'utilisateur est : " + Arrays.toString(tab));

        // Calcul du maximum du tableau :
        int maxi = tab[0];
        for(int i = 1; i<tab.length; i++){
            if (maxi < tab[i]){
                maxi = tab[i];
            }
        }
        System.out.println("Le maximum du tableau est : " + maxi);

        // Calcul du minimum du tableau :
        int mini = tab[0];
        for(int i = 1; i<tab.length; i++){
            if (mini > tab[i]){
                mini = tab[i];
            }
        }
        System.out.println("Le minimum du tableau est : " + mini);

        // Calcul de la somme :
        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }
        System.out.println("La somme des éléments du tableau est : " + somme);

        // Affichage des éléments pairs :
        System.out.println("Les éléments pairs sont : ");
        for (int j = 0; j < tab.length; j++) { // parcours de tout le tableau
            if (tab[j] % 2 == 0) {
                System.out.println(tab[j]);
            }
        }

        // Affichage des éléments d'indice pairs
        System.out.println("Les éléments d'indice pair sont : ");
        for (int i = 0; i < tab.length; i += 2){
            System.out.println(tab[i]);
        }
    }

    public static void inverseTableau(int[] tableau){
        System.out.println("Tableau avant l'inversion" + Arrays.toString(tableau));
        for (int i = 0; i < tableau.length/2; i++){     //parcourt les éléments du tableau et les échanges jusqu'à ce qu'il arrive au point médian
            int stock = tableau[i];
            tableau[i] = tableau[tableau.length - i -1]; // on échange la première valeur
            tableau[tableau.length - i - 1] = stock; // on échange la valeur correspondante avec la première valeur
        }
        System.out.println("Le tableau inversé est : " + Arrays.toString(tableau));

    }
}