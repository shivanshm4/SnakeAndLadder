package model;

public class Ladder {

     private int start;
     private int end;
    public int getStart() {
        return start;
    }
    public void setStart(int start) {
        this.start = start;
    }
    public int getEnd() {
        return end;
    }
    public void setEnd(int end) {
        this.end = end;
    }
    @Override
    public String toString() {
        return "Ladder [end=" + end + ", start=" + start + "]";
    }
     
    
}
