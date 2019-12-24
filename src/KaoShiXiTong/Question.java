package KaoShiXiTong;

public class Question {
    private String timu;
    private String daan;
    public Question(String timu,String daan){
        this.timu=timu;
        this.daan=daan;
    }
    public String getTimu(){
        return this.timu;
    }
    public String getDaan(){
        return this.daan;
    }
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(o instanceof Question){
            Question another=(Question)o;
            if(another.timu.equals(this.timu)){

            }
        }
        return false;
    }
    public int hashCode(){
        return this.timu.hashCode();
    }
}