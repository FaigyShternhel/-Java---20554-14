/**
 * @author (Faigy Shternel)
 * @version (16.05.2022)
 */
public class Person implements Comparable<Person> {
    private String id;
    private String last_name;
    private String first_name;
    private int birthYear;

    public Person()
    {
        this.id = "000000000";
        this.last_name = "Israel";
        this.first_name = "Israel";
        this.birthYear = 0000;
    }
    public Person(String id, String first_name, String last_name, int birthYear)
    {
        this.id = id;
        this.last_name = last_name;
        this.first_name = first_name;
        this.birthYear = birthYear;
    }

    public int getBirthYear()
    {
        return birthYear;
    }

    public String getId()
    {
        return id;
    }

    public String getFirst_name()
    {
        return first_name;
    }

    public String getLast_name()
    {
        return last_name;
    }

    @Override
    public int compareTo(Person o) {
        if (this.id.compareTo(o.id) > 0)
        {
            return 1;
        }
        else if (this.id.compareTo(o.id) < 0)
        {
            return -1;
            }
        else { // both id are equal lexicographically
                return 0;
            }
        }


    public String toString()
    {
        return ""+this.id+" : "+this.first_name+" "+this.last_name+" "+this.birthYear+"\n";
    }
}
