import java.util.Scanner;

abstract  class Wizard{
    String name;
    int powerLevel;
    public Wizard(String name,int powerLevel){
        this.name=name;
        this.powerLevel=powerLevel;

    }
    abstract int castSpell(String spellName);
}
class DarkWizard extends Wizard{
    public DarkWizard(String name, int powerLevel) {
        super(name, powerLevel);
    }
    @Override
    int castSpell(String spellName){
        if(spellName=="Crucio"){
                return powerLevel=powerLevel*3;
        }
        else if(spellName=="AvadaKedavra"){
            return powerLevel=powerLevel*5;
        }
        else{
            return powerLevel;
        }

    }
}
class HealingWizard extends Wizard{
    public HealingWizard(String name,int powerLevel){
        super(name,powerLevel);
    }
    @Override
    int castSpell(String spellName){
        if(spellName=="Heal"){
            return powerLevel=powerLevel*2;
        }
        else if(spellName=="Revive"){
            return powerLevel=powerLevel*4;
        }
        else{
            return 0;
        }
    }
}

class ElementalWizard extends Wizard{
    public ElementalWizard(String name,int powerLevel){
        super(name,powerLevel);
    }
    @Override
    int castSpell(String spellName){
        if(spellName=="Fireball"){
            return powerLevel=powerLevel*2;
        }
        else if(spellName=="Lightning"){
            return powerLevel=powerLevel*3;
        }
        else{
            return powerLevel;
        }
    }
}

public class Task {
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("-----------------Input------------------");
            System.out.println("Enter Wizard Type: ");
            String wizardType=sc.nextLine();
            System.out.println("Enter Name: ");
            String name=sc.nextLine();
            System.out.println("Enter Power Level: ");
            int powerLevel=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Spell: ");
            String spell=sc.nextLine();

            System.out.println("----------------------Output-----------------");



            if(wizardType.equals("DarkWizard")){
                DarkWizard dw=new DarkWizard(name,powerLevel);
                System.out.println("Wizard: "+name);
                System.out.println("Spell Casted: "+spell);
                System.out.println("Damage Dealt: "+dw.castSpell(spell));
            }
            else if(wizardType.equals("HealingWizard")){
                HealingWizard hw=new HealingWizard(name,powerLevel);
                System.out.println("Wizard: "+name);
                System.out.println("Spell Casted: "+spell);
                System.out.println("Damage Dealt: "+hw.castSpell(spell));
            }
            else if(wizardType.equals("ElementalWizard")){
                ElementalWizard ew=new ElementalWizard(name,powerLevel);
                System.out.println("Wizard: "+name);
                System.out.println("Spell Casted: "+spell);
                System.out.println("Damage Dealt: "+ew.castSpell(spell));

            }

            System.out.println("----------------------------------------");
    }
}
