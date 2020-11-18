/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_2;

/**
 *
 * @author HP
 */
public class TestElektronik {
    public static void main(String[] args) {
        Manusia indro = new Manusia();
        TelevisiJadul tvJadul = new TelevisiJadul();
        TelevisiModern tvModern = new TelevisiModern();

        indro.nyalakanPerangkat(tvJadul);
        indro.nyalakanPerangkat(tvModern);
    }
}
