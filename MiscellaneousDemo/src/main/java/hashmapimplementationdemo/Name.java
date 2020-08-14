package HashMapImplementationDemo;

import java.util.HashSet;
import java.util.Set;

import java.util.HashSet;
import java.util.Set;

public class Name {
	
    private final String first, last; 
    public Name(String first, String last) 
    { 
        this.first = first; 
        this.last = last; 
    } 
    public boolean equals(Object o) 
    { 
        if (!(o instanceof Name)) 
            return false; 
        Name n = (Name)o; 
        return n.first.equals(first) && n.last.equals(last); 
    } 
    
    public int hashCode() {
    	return 0 * first.hashCode() + last.hashCode();
    }
    
	@Override
	public String toString() {
		return "Name [first=" + first + ", last=" + last + "]";
	} 
    
    
} 
