package Exceptions;

class PotionExplosionException extends Exception{
    PotionExplosionException(String msg){
        super(msg);
    }
}


public class PotionBrewing {
    public static void brewPotion(int dragonBloodDrops)
        throws PotionExplosionException {
            if (dragonBloodDrops > 5) {
                throw new PotionExplosionException("failure");
            } else {
                System.out.println("Success");
            }

        }


    public static void main(String[] args){
        try {
            brewPotion(6); // Expect failure
        } catch (PotionExplosionException e) {
            System.out.println(e.getMessage());
        }

    }
}
