package zoo;

import static java.lang.System.out;
import java.util.Objects;
import java.util.Scanner;

public class Snake {
    private String type;
    private boolean acid;
    private int bodyLength;
    
    public Snake() {
        this(null, false, 0);
    }
    
    public Snake(String type, boolean acid, int bodyLength) {
        this.type = type;
        this.acid = acid;
        this.bodyLength = bodyLength;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        input(sc);
    }
    
    public void input(Scanner sc){
        this.type = sc.nextLine();
        this.acid = sc.nextBoolean(); sc.nextLine();
        this.bodyLength = sc.nextInt();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEatable() {
        return acid;
    }

    public void setEatable(boolean acid) {
        this.acid = acid;
    }

    public int getAge() {
        return bodyLength;
    }

    public void setAge(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    @Override
    public String toString() {
        return "Fish{" + ", type=" + type + ", acid=" + acid + ", bodyLength=" + bodyLength + '}';
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
        final Snake other = (Snake) obj;
        if (this.acid != other.acid) {
            return false;
        }
        if (this.bodyLength != other.bodyLength) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
    
    Snake copy(Snake fish){
        this.type = fish.getType();
        this.acid = fish.isEatable();
        this.bodyLength = fish.getAge();
        return this;
    }

}
