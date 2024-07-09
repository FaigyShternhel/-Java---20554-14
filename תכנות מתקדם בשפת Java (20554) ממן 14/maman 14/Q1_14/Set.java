/**
 * @author (Faigy Shternel)
 * @version (16.05.2022)
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class Set<T extends Comparable<T>> {

    private ArrayList<T> set;

    public Set() {
        this.set = new ArrayList<T>();
    }

    public Set(T[] arrSet) {
       set = new ArrayList<T>();
        for (int i = 0; i < arrSet.length; i++) {
            this.insert(arrSet[i]);
        }
    }


    public void union(Set<T> s){
        this.set.addAll(s.set);
        checkRecurrence();
    }

    public void intersect(Set<T> s)
    {
        ArrayList<T> temp=new ArrayList<T>();
        for (int i = 0; i < s.set.size(); i++) {
            for (int j = 0; j < this.set.size(); j++) {
                if (s.set.get(i).equals(set.get(j)))
                    temp.add(s.set.get(i));
            }
        }
        this.set.removeAll(this.set);
        this.set.addAll(temp);
    }
    //if s is subset of this.set, the union of both them, is equals to this.set's size.
    public boolean isSubset(Set<T> s){
        for (int i = 0; i < s.set.size(); i++)
        {
            if(!this.isMember(s.set.get(i)))
            {
                return false;
            }
        }
        return true;
    }
    public boolean isMember(T t){
        return(this.set.indexOf(t)!=-1);
    }

    public void insert(T t) {
        if(!isMember(t))
            this.set.add(t);
    }
    public void delete(T t) {
        if(isMember(t))
            this.set.remove(t);
    }
    public Iterator<T> iterator()
    {
      return set.iterator();
    }

    @Override
    public String toString() {
        String mySet = "{ ";
        if(this.set.size()==0)
        {
            mySet += "}\n";
            return mySet;
        }
        for (int i = 0; i < this.set.size()-1; i++) {
            mySet += set.get(i).toString() + ", ";
        }
        mySet+=set.get(this.set.size()-1).toString()+" }\n";
        return mySet;
    }

    //Keeps there from being repetitive
    private void checkRecurrence()
    {
        for (int i = 0; i < this.set.size(); i++) {
            for (int j = 0; j < this.set.size(); j++) {
                if (this.set.get(i).equals(this.set.get(j)) && (i!=j))
                    this.set.remove(j);
            }
        }
        return;
    }

    public int size() {
        return this.set.size();
    }
}


