import java.util.Scanner;

abstract class Missile{
    String missileId;
    int range;
    public Missile(String missileId,int range){
        this.missileId=missileId;
        this.range=range;
    }
    abstract boolean launch(int threatLevel,boolean hasClearance);

}

class NuclearMissile extends Missile{
    public NuclearMissile(String missileId,int range){
        super(missileId,range);
    }
    @Override
    boolean launch(int threatLevel,boolean hasClearance){
        if(threatLevel>=9 && hasClearance==true){
            return true;
        }
        return false;
    }

}
class TorpedoMissile extends Missile{
    public TorpedoMissile(String missileId,int range){
        super(missileId, range);
    }
    @Override
    boolean launch(int threatLevel,boolean hasClearance){
        if(threatLevel>=5){
            return true;
        }
        return false;
    }
}
class DefenseInterceptor extends Missile{
    public DefenseInterceptor(String missileId,int range){
        super(missileId, range);
    }
    @Override
    boolean launch(int threatLevel,boolean hasClearance){
        if(threatLevel>=3){
            return true;
        }
        return false;
    }
}
public class Task2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("-------------Input-------------------");
        System.out.println("Enter the Missile Type: ");
        String missileType=sc.nextLine();
        System.out.println("Enter Missile Id: ");
        String missileId=sc.nextLine();
        System.out.println("Enter Threat Level: ");
        int threatLevel=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Clearance: ");
        boolean hasClearance=sc.nextBoolean();
        System.out.println("--------------------Output--------------");
        if(missileType.equals("NuclearMissile")){
            NuclearMissile nm=new NuclearMissile(missileId,300);
            if(nm.launch(threatLevel, hasClearance)){
                System.out.println("Missile ID: "+missileId);
                System.out.println("Launch Status: Approved");
                System.out.println("NuclearMissile Launched Successfully");
            }
            else{
                System.out.println("Missile ID: "+missileId);
                System.out.println("Launch Status: DENIED");
                System.out.println("Reason: Threat level insufficient for nuclear launch");
            }
        }
        else if(missileType.equals("TorpedoMissile")){
            TorpedoMissile tm=new TorpedoMissile(missileId,200);
            if(tm.launch(threatLevel, hasClearance)){
                System.out.println("Missile ID: "+missileId);
                System.out.println("Launch Status: Approved");
                System.out.println("TorpedoMissile Launched Successfully");
            }
            else{
                System.out.println("Missile ID: "+missileId);
                System.out.println("Launch Status: DENIED");
                System.out.println("Reason: Threat level insufficient for nuclear launch");
            }

        }
        else if (missileType.equals("DefenseInterceptor")){
            DefenseInterceptor di=new DefenseInterceptor(missileId,100);
            if(di.launch(threatLevel, hasClearance)){
                System.out.println("Missile ID: "+missileId);
                System.out.println("Launch Status: Approved");
                System.out.println("DefenseInterceptor Launched Successfully");
            }
            else{
                System.out.println("Missile ID: "+missileId);
                System.out.println("Launch Status: DENIED");
                System.out.println("Reason: Threat level insufficient for nuclear launch");
            }
        }
    }
}
