package Exceptions;


class InvalidScoreException extends RuntimeException{
    InvalidScoreException(String msg){
        super(msg);
    }
}

public class FifaScore {
    public static int calculateGoalDifference(int scored, int conceded)
        throws InvalidScoreException{
        if(scored<0){
            throw new InvalidScoreException("Invalid Score");
        }
        else{
            return scored-conceded;
        }
    }
    public static void main(String args[]){
        try {
            int diff = calculateGoalDifference(4, -1);
            System.out.println(diff);
        } catch (InvalidScoreException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Match stats processed");
        }

    }

}
