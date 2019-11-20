package 单例模式;

public class Test {
    private Test(){}
    private static Test duixiang;
    public static Test getDuixiang(){
        if(duixiang==null) {
            duixiang=new Test();
        }
        return Test.duixiang;
    }
    public static void main(String[]args){
        Test.getDuixiang();
    }
}
