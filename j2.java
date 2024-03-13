class Computer{
    public void playMusic(int x){
        if(x>=10)
             System.out.println("Music playing...");
             System.out.println("Music playing Stopped ...!!");
    }
    public String getMePen(int x){
        if(x>=10)
        return "pen " + x;
        return "Enter minimum Amount , Invalid Amount is " + x;

    }
}
public class j2 {
    public static void main(String[] args) {
        Computer obj = new Computer();
        String str = obj.getMePen(1);
        System.out.println(str);
    }
}
