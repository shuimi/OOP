package zoo;

import java.util.Objects;
import java.util.Scanner;

public class Animal {
    private String continent;
    private String kind;
    private int age;
    private char  sex;
    
    public Animal() {
        this(null, null, 0, '\0');
    }

    public Animal(String continent, String kind, int age, char sex) {
        this.continent = continent;
        this.kind = kind;
        this.age = age;
        this.sex = sex;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        input(sc);
    }
    
    public void input(Scanner sc){
        this.continent = sc.nextLine();
        this.kind = sc.nextLine();
        this.age = sc.nextInt(); sc.nextLine();
        this.sex = sc.nextLine().charAt(0);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.sex != other.sex) {
            return false;
        }
        if (!Objects.equals(this.continent, other.continent)) {
            return false;
        }
        if (!Objects.equals(this.kind, other.kind)) {
            return false;
        }
        return true;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    
    public String getContinent() {
        return continent;
    }

    public String getKind() {
        return kind;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }
    
    @Override
    public String toString() {
        return "Animal{" + "continent=" + continent + ", kind=" + kind + ", age=" + age + ", sex=" + sex + '}';
    }
    
    Animal copy(Animal animal){
        this.continent = animal.getContinent();
        this.kind = animal.getKind();
        this.age = animal.getAge();
        this.sex = animal.getSex();
        return this;
    }

}
