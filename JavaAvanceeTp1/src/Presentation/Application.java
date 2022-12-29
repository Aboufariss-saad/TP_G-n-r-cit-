package Presentation;

import Metier.MetierProduitImpl;
import Metier.Produit;

import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        int choix;
        do {
            String MENU = "\n"
                    + "1. Afficher la liste des produits.\n"
                    + "2. Rechercher un produit par son id.\n"
                    + "3. Ajouter un nouveau produit dans la liste.\n"
                    + "4. Supprimer un produit par id.\n"
                    + "5. Quitter ce programme.\n";
            System.out.println(MENU);
            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.println(metier.getAll());
                    break;
                case 2:
                    System.out.println("entrer l'id du produit que vous recherchez");
                    Scanner Rp = new Scanner(System.in);
                    long id1 = Rp.nextInt();
                    System.out.println(metier.findById(id1));
                    break;
                case 3:
                    System.out.println("entrer l'id du produit que vous Souhaitez ajouter dans la liste");
                    Scanner Ip = new Scanner(System.in);
                    long Idp = Ip.nextInt();
                    System.out.println("entrer le nom du produit que vous Souhaitez ajouter dans la liste");
                    Scanner np = new Scanner(System.in);
                    String Nom_p = np.nextLine();

                    System.out.println("entrer la marque du produit que vous Souhaitez ajouter dans la liste");
                    Scanner Mp = new Scanner(System.in);
                    String Marque_p = Mp.nextLine();

                    System.out.println("entrer le prix du produit que vous Souhaitez ajouter dans la liste");
                    Scanner Pp = new Scanner(System.in);
                    double Prix_p = Pp.nextDouble();

                    System.out.println("entrer la Description du produit que vous Souhaitez ajouter dans la liste");
                    Scanner Dp = new Scanner(System.in);
                    String Descr_p = Dp.nextLine();

                    System.out.println("entrer le nombre de stock du produit que vous Souhaitez ajouter dans la liste");
                    Scanner Ns_p = new Scanner(System.in);
                    int Nbr_s_p = Ns_p.nextInt();
                    Produit p=new Produit(Idp,Nom_p,Marque_p,Prix_p,Descr_p,Nbr_s_p);
                    metier.add(p);
                    break;
                case 4:
                    System.out.println("entrer l'id du produit que vous souhaitez Supprimer");
                    Scanner Sp = new Scanner(System.in);
                    long id3 = Sp.nextInt();
                    metier.delete(id3);
                    break;
                case 5:
                    System.out.println("vous avez quiter l'application");
                    break;
                default:
                    System.out.println("choix invalide");
                    break;

            }
        } while(choix!= 5);

    }







}
