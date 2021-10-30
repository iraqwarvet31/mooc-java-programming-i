/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author justadev
 */
public class Stack {
    private ArrayList<String> values;
    
    public Stack() {
        this.values = new ArrayList<>();
    }
    
    public void add(String value) {
        values.add(value);
    }
    
    public boolean isEmpty() {
        if (this.values.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public String take() {
        int lastIndex = this.values.size() - 1;
        String lastItem = this.values.remove(lastIndex);
        return lastItem;
    }
    
    public ArrayList<String> values() {
        return this.values;
    }
}
