package zoo;

public class ZooSnake extends Snake implements recDate, oceanariumRecDate {
    private int recDate;
    private findIndex cntx = null;
    
    public ZooSnake() {
        this(0, null, true, 0);
    }
    
    public ZooSnake(int recDate, String type, boolean acid, int bodyLength) {
        super(type, acid, bodyLength);
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
        final ZooSnake other = (ZooSnake) obj;
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
