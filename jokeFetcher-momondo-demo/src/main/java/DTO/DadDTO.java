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
public class DadDTO {
    private String joke;
    private String refrence;

    

    public DadDTO(String joke, String refrence) {
        this.joke = joke;
        this.refrence = refrence;
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
    
    
    
}
