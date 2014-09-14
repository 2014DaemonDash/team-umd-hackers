/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Andrew
 */
public class product {
    public String upc;
    public String comments;
    public int score;
    public product(String a, String b, int c){
        upc = a;
        comments = b;
        score = c;
    }
    public void thumbsUp(){
        score +=1;
    }
    public void thumbsDown(){
        score -=1;
    }
}
