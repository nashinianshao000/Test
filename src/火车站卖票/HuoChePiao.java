package 火车站卖票;

public class HuoChePiao {
    private String qiShiZhan;
    private String zhongDianZhan;
    private Float piaoJia;
    public HuoChePiao(String qiShiZhan,String zhongDianZhan,Float piaoJia){
        this.qiShiZhan=qiShiZhan;
        this.piaoJia=piaoJia;
        this.zhongDianZhan=zhongDianZhan;
    }
    public String getQiShiZhan(){
        return this.qiShiZhan;
    }
    public String getZhongDianZhan(){
        return this.zhongDianZhan;
    }
    public Float getPiaoJia(){
        return this.piaoJia;
    }
    public String toString(){
        StringBuffer stringBuffer=new StringBuffer(this.qiShiZhan);
        stringBuffer.append("-->");
        stringBuffer.append(this.zhongDianZhan);
        stringBuffer.append(":");
        stringBuffer.append(this.piaoJia);
        return stringBuffer.toString();
    }

}
