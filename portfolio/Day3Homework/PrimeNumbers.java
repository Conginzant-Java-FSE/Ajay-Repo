package Day3Homework;
class Firsthundred extends Thread{
    @Override
    public void run() {
        for (int i=2;i<=100;i++){
            boolean isprime=true;
            for (int j=2;j<=Math.pow(i,0.5);j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i);
            }
        }
    }
}
class Secondhundred extends Thread{
    @Override
    public void run() {
        for (int i=101;i<=200;i++){
            boolean isprime=true;
            for (int j=2;j<=Math.pow(i,0.5);j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i);
            }
        }
    }
}
class Thirdhundred extends Thread{
    @Override
    public void run() {
        for (int i=201;i<=300;i++){
            boolean isprime=true;
            for (int j=2;j<=Math.pow(i,0.5);j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i);
            }
        }
    }
}
class Fourthhundred extends Thread{
    @Override
    public void run() {
        for (int i=301;i<=400;i++){
            boolean isprime=true;
            for (int j=2;j<=Math.pow(i,0.5);j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i);
            }
        }
    }
}
class Fifthhundred extends Thread{
    @Override
    public void run() {
        for (int i=401;i<=500;i++){
            boolean isprime=true;
            for (int j=2;j<=Math.pow(i,0.5);j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i);
            }
        }
    }
}
class Sixthhundred extends Thread{
    @Override
    public void run() {
        for (int i=501;i<=600;i++){
            boolean isprime=true;
            for (int j=2;j<=Math.pow(i,0.5);j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i);
            }
        }
    }
}
class Seventhhundred extends Thread{
    @Override
    public void run() {
        for (int i=601;i<=700;i++){
            boolean isprime=true;
            for (int j=2;j<=Math.pow(i,0.5);j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i);
            }
        }
    }
}
class Eighthundred extends Thread{
    @Override
    public void run() {
        for (int i=701;i<=800;i++){
            boolean isprime=true;
            for (int j=2;j<=Math.pow(i,0.5);j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i);
            }
        }
    }
}
class Ninthhundred extends Thread{
    @Override
    public void run() {
        for (int i=801;i<=900;i++){
            boolean isprime=true;
            for (int j=2;j<=Math.pow(i,0.5);j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i);
            }
        }
    }
}
class Thousandhundred extends Thread{
    @Override
    public void run() {
        for (int i=901;i<=1000;i++){
            boolean isprime=true;
            for (int j=2;j<=Math.pow(i,0.5);j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i);
            }
        }
    }
}
public class PrimeNumbers {
    public static void main(String[] args){
        Firsthundred f1=new Firsthundred();
        Secondhundred sh=new Secondhundred();
        Thirdhundred th=new Thirdhundred();
        Fourthhundred fh=new Fourthhundred();
        Fifthhundred fi=new Fifthhundred();
        Sixthhundred sih=new Sixthhundred();
        Seventhhundred seh=new Seventhhundred();
        Eighthundred eh=new Eighthundred();
        Ninthhundred nh=new Ninthhundred();
        Thousandhundred thh=new Thousandhundred();
        f1.start();
        sh.start();
        th.start();
        fh.start();
        fi.start();
        sih.start();
        seh.start();
        eh.start();
        nh.start();
        thh.start();
    }
}
