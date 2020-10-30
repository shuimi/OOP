package zoo;

public class ZooAnimal extends Animal implements recDate {
    private int recDate;
    private findIndex cntx = null;

    public ZooAnimal() {
        this(0, null, null, 0, '\0');
    }
    
    public ZooAnimal(int recDate, String continent, String kind, int age, char sex) {
        super(continent, kind, age, sex);
        this.recDate = recDate;
    }
    
    public void setCntx(findIndex cntx) {
        this.cntx = cntx;
    }
    
    public interface findIndex{
        int getMyIndex(recDate t);
    }

    public int getOwnerIndex() {
        return ((findIndex) cntx).getMyIndex(this);
    }

    public int getRecDate() {
        return recDate;
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
        final ZooAnimal other = (ZooAnimal) obj;
        if (this.recDate != other.recDate) {
            return false;
        }
        return true;
    }
    
    @Override
    public void setRecDate(int date) {
        this.recDate = date;
    }
       
}
