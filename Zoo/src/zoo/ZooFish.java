package zoo;

public class ZooFish extends Fish implements recDate, oceanariumRecDate{
    private int recDate;
    private findIndex cntx = null;

    public ZooFish() {
        this(0, null, null, false, 0);
    }
    
    public ZooFish(int recDate, String water, String type, boolean eatable, int age) {
        super(water, type, eatable, age);
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
        final ZooFish other = (ZooFish) obj;
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
