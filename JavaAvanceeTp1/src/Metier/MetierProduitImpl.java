package Metier;

import Metier.IMetier;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {
    List<Produit> produits=new ArrayList<>();

    public MetierProduitImpl() {
    }

    public MetierProduitImpl(List<Produit> produits) {
        this.produits = produits;
    }

    public void add(Produit o){
        Produit P=new Produit();
        for (Produit p:produits ){
            if(p.getId()==o.getId()){
                System.err.println("produit deja exist");
                P=p;
            }
        }
        if(P.getId()==o.getId()){
            System.err.println("chercher une autre id ");
        }

        else produits.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return this.produits;
    }

    @Override
    public Produit findById(long id) {
        Produit P=new Produit();
        for (Produit p:produits ){
            if(p.getId()==id){
                P=p;
            }
        }
        return P;
    }

    @Override
    public void delete(long id) {
        Produit P=new Produit();
        for(Produit p:produits){
            if(p.getId()==id){
                P=p;
            }
        }
        produits.remove(P);

    }




}