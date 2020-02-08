/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eqs
 */
public class Valores implements ValoresITF {

    private int[] array = new int[10];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	System.out.println("Aplicação de inserção e remoção de dados de um array!");
    }

    @Override
    public boolean ins(int v) {
    	if(v < 0) {
    		return false;
    	}
    	for(int i=0; i<this.array.length; i++) {
    		if(this.array[i] == 0) {
    			this.array[i] = v;
    			return true;
    		}
    	}
    	return false;
    }

    @Override
    public int del(int at) {
    	if( at < 0 || at >= 10 || this.array[at] == 0) {
    		return -1;
    	} else {
    		int aux = this.array[at];
    		this.array[at] = 0;
    		return aux;
    	}
    }

    @Override
    public int size() {
        int count = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != 0) {
            	count++;
            }
        }
        return count;
    }

}
