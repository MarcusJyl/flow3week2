/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Marcus
 */
public class OurDTO {
    private String joke;
    private String refrence;
    private String joke2;
    private String refrence2;

   

    public OurDTO(ChuckDTO cDTO, DadDTO dDTO) {
        this.joke = cDTO.getValue();
        this.refrence = cDTO.getUrl();
        this.joke2 = dDTO.getJoke();
        this.refrence2 = "https://icanhazdadjoke.com/";
    }
    
    

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public String getRefrence() {
        return refrence;
    }

    public void setRefrence(String refrence) {
        this.refrence = refrence;
    }

    public String getJoke2() {
        return joke2;
    }

    public void setJoke2(String joke2) {
        this.joke2 = joke2;
    }

    public String getRefrence2() {
        return refrence2;
    }

    public void setRefrence2(String refrence2) {
        this.refrence2 = refrence2;
    }
    
    
}
