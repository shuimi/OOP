package zoo;

import static java.lang.System.out;
import java.util.Objects;
import java.util.Scanner;

public class Fish {
    private String water;
    private String type;
    private boolean eatable;
    private int age;
    
    public Fish() {
        this(null, null, false, 0);
    }
    
    public Fish(String water, String type, boolean eatable, int age) {
        this.water = water;
        this.type = type;
        this.eatable = eatable;
        this.age = age;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        input(sc);
    }
    
    public void input(Scanner sc){
        this.water = sc.nextLine();
        this.type = sc.nextLine();
        this.eatable = sc.nextBoolean(); sc.nextLine();
        this.age = sc.nextInt();
    }
    
    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Fish{" + "water=" + water + ", type=" + type + ", eatable=" + eatable + ", age=" + age + '}';
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
        final Fish other = (Fish) obj;
        if (this.eatable != other.eatable) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.water, other.water)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
    
    Fish copy(Fish fish){
        this.water = fish.getWater();
        this.type = fish.getType();
        this.eatable = fish.isEatable();
        this.age = fish.getAge();
        return this;
    }

}
