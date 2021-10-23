/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act8java;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author danyg
 */
public class Deck {
    
     private List<Card> card;
    private Integer numCard = 52;

    public List<Card> getCard() {
        return card;
    }

    public void setCard(List<Card> card) {
        this.card = card;
    }

    public Integer getNumCard() {
        return numCard;
    }

    public void setNumCard(Integer numCard) {
        this.numCard = numCard;
    }

    public void shuffle() {
        Collections.shuffle(card);
        System.out.println("Se mezcló el Deck");
    }
    
    public void head() {
        System.out.println(card.get(0).getAll());
        card.remove(0);
        numCard-=1;
        System.out.println("Quedan: "+numCard);
    }
    
    public void pick() {
        Random randomNumbers = new Random();
        int aleatorio = randomNumbers.nextInt(numCard);
        System.out.println(card.get(aleatorio).getAll());
        card.remove(aleatorio);
        numCard-=1;
        System.out.println("Quedan: "+numCard);
    }
    
    public void hand() {
        int i = 1;
        while(i <= 5) {
        Random randomNumbers = new Random();
        int aleatorio = randomNumbers.nextInt(numCard);
        System.out.println(card.get(aleatorio).getAll());
        card.remove(aleatorio);
        numCard-=1;
        i++;
        }
        System.out.println("Quedan: "+numCard);
    }
    
    public void mostrar() {
        for(int i = 0; i < numCard; i++) {
            System.out.println(card.get(i).getAll());
        }
    }
    
}
