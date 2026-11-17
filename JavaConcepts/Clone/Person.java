package Clone;
public class Person implements Cloneable{
    String name;
    int age;
    String School;

    Person(String name,int age,String school){
        this.name=name;
        this.age=age;
        this.School=school;
    }

    Person(Person other){
        this.name=other.name;
        this.age=other.age;
        this.School=other.School;
    }

    @Override 
    public Person clone(){
        try{
        return (Person)super.clone(); //Performs shallow Copy for other object type reference it performs shallow copy
        }
        catch(CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }
}
