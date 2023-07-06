import java.util.Collections;
import java.util.ArrayList;

class student implements Comparable<student>{
    int age;
    String name;
    String tech;

    public  student(int age,String name,String tech){
        this.age =age;
        this.name=name;
        this.tech=tech;
    }
    @Override
    public String toString(){
        return "student [Age ="+age+" ,Name ="+name+" ,Tech ="+tech+" ]" ;
    }
    public int compareTo( student b){
        // return this.age - b.age;
        return this.tech.charAt(2) - b.tech.charAt(2);
        //  return this.tech.length() - b.tech.length();
    }
}

class Comparator_Comparable{
    public static void main(String[] args) {
        ArrayList<student> al= new ArrayList<>();
        al.add(new student(25,"shubham","Python"));
        al.add(new student(24,"Attraya","java"));
        al.add(new student(28,"Ankit","javascript"));
        al.add(new student(23,"rahul","Nodejs"));

        Collections.sort(al);
        System.out.println(al);
    }
}

