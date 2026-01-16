package Day3Homework;

class Firstrow extends Thread{
    double sumE=0;
    int[] matrix;
    public Firstrow(int[] matrix){
        this.matrix=matrix;
    }

    @Override
    public void run() {
        for (int i=0;i<matrix.length;i++){
            sumE+=matrix[i];
        }
        System.out.println("First Row Sum: "+sumE);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}
class Secondrow extends Thread{
    double sumE=0;
    int[] matrix;
    public Secondrow(int[] matrix){
        this.matrix=matrix;
    }

    @Override
    public void run() {
        for (int i=0;i<matrix.length;i++){
            sumE+=matrix[i];
        }
        System.out.println("Second Row Sum: "+sumE);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}
class Thirdrow extends Thread{
    double sumE=0;
    int[] matrix;
    public Thirdrow(int[] matrix){
        this.matrix=matrix;
    }

    @Override
    public void run() {
        for (int i=0;i<matrix.length;i++){
            sumE+=matrix[i];
        }
        System.out.println("Third Row Sum: "+sumE);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}
class Fourthrow extends Thread{
    double sumE=0;
    int[] matrix;
    public Fourthrow(int[] matrix){
        this.matrix=matrix;
    }

    @Override
    public void run() {
        for (int i=0;i<matrix.length;i++){
            sumE+=matrix[i];
        }
        System.out.println("Fourth Row Sum: "+sumE);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}
class Fifthrow extends Thread{
    double sumE=0;
    int[] matrix;
    public Fifthrow(int[] matrix){
        this.matrix=matrix;
    }

    @Override
    public void run() {
        for (int i=0;i<matrix.length;i++){
            sumE+=matrix[i];
        }
        System.out.println("Fifth Row Sum: "+sumE);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}
class Sixthrow extends Thread{
    double sumE=0;
    int[] matrix;
    public Sixthrow(int[] matrix){
        this.matrix=matrix;
    }

    @Override
    public void run() {
        for (int i=0;i<matrix.length;i++){
            sumE+=matrix[i];
        }
        System.out.println("Sixth Row Sum: "+sumE);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}
public class MatrixSum {
    public static void main(String[] args){
        int[][] matrix={{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
        Firstrow fr=new Firstrow(matrix[0]);
        Secondrow sr=new Secondrow(matrix[1]);
        Thirdrow tr=new Thirdrow(matrix[2]);
        Fourthrow four=new Fourthrow(matrix[3]);
        Fifthrow fir=new Fifthrow(matrix[4]);
        Sixthrow sir=new Sixthrow(matrix[5]);
        fr.start();
        sr.start();
        tr.start();
        four.start();
        fir.start();
        sir.start();
    }
}
