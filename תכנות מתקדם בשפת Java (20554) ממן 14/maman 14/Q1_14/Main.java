/**
 * @author (Faigy Shternel)
 * @version (16.05.2022)
 */
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[]args)
    {
        //question 1 - b
        final int SIZE=10;
        Set <Integer> set1=new Set<>();
        Set <Integer> set2=new Set<>();
        Set <Integer> set3=new Set<>();
        Set <Integer> set4=new Set<>();
        Scanner s=new Scanner(System.in);
        int x;
        Random rand=new Random();
        while(set1.size()<SIZE) {
            set1.insert(rand.nextInt(100));
        }
        while(set2.size()<SIZE){
            set2.insert(rand.nextInt(100));
        }
        while(set3.size()<SIZE){
            set3.insert(rand.nextInt(100));
        }
        System.out.println( set1.toString()+ set2.toString()+set3.toString());
        set1.union(set2);
        System.out.println( "set1 after union with set2: "+set1.toString());
        set2.intersect(set3);
        System.out.println( "set2 after intersect with set3: "+set2.toString());
        System.out.println("please enter the first number");
        x= s.nextInt();
        set4.insert(x);
        System.out.println("please enter the second number");
        x= s.nextInt();
        set4.insert(x);
        System.out.println( "is set4 subset of set1?: "+set1.isSubset(set4));
        System.out.println( "is set4 subset of set2?: "+set2.isSubset(set4));
        System.out.println( "is set4 subset of set3?: "+set3.isSubset(set4));
        System.out.println("please enter a number");
        x= s.nextInt();
        System.out.println("is "+x+" member of set1?: "+set1.isMember(x));
        set2.insert(x);
        System.out.println("add "+x+" to set2: "+set2.toString());
        set3.delete(x);
        System.out.println("delete "+x+" from set3: "+set3.toString());

       //question 1 - c
        Person p1 = new Person("332675914", "Rachel", "Levi", 2011);
        Person p2 = new Person("276218725", "Shimi", "Fish", 2004);
        Person p3 = new Person("026735418", "Ari", "Cohen", 1900);
        Person p4 = new Person("715692654", "Rivka", "Bach", 2014);
        Person p5 = new Person("239915493", "Lea", "Rubin", 2001);
        Person[] persons = {p1, p2, p3, p4, p5};
        Set<Person> set = new Set<Person>(persons);
        GenericMin<Person> min = new GenericMin<Person>();
        System.out.println("\nThe minimal member in the group is:\n" + min.Minumum(set));
    }
 }

