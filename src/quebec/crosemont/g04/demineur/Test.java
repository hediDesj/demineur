package quebec.crosemont.g04.demineur;

public class Test {
    public static void main(String[] args) {
        System.out.println("Init de 10/10, construteur Grille()");
        Grille uneGrille= new Grille();
        System.out.println("init 1st");
        uneGrille.initialiser(-1,-1,20);
        System.out.println(uneGrille);

        System.out.println("Test d'affichage de la fonction compterVoisins() pour les cases8-7 9-9 0-0 \n");

        System.out.println(uneGrille.compterVoisins(8,7));
        System.out.println(uneGrille.compterVoisins(9,9));
        System.out.println(uneGrille.compterVoisins(0,0));
        System.out.println("Test d'affichage de la fonction marquer() de la classe Case");
        uneGrille.cases[1][1].marquer();
        System.out.println(uneGrille);
        uneGrille.cases[1][1].marquer();
        System.out.println(uneGrille);
        System.out.println("=======================Decoucrir 0,0 no bombe====================");
        uneGrille.decouvrir(0,0);
        System.out.println(uneGrille);

        uneGrille.cases[2][2].marquer();
        System.out.println(uneGrille);
        uneGrille.cases[2][2].marquer();
        System.out.println(uneGrille);
        System.out.println("=======================Decoucrir 2,2 no bombe====================");

        uneGrille.decouvrir(2,2);
        System.out.println(uneGrille);

        System.out.println("Test affichage de la fonction toutReveler()");
        uneGrille.toutReveler();
        System.out.println(uneGrille);




    }
}
