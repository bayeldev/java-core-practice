package practice.level3;

public class task15 {
    public static void main(String[] args) {
        boolean hasInvitation = true;
        boolean dressCodeMet = false;
        boolean passwordIsCorrect = true;
        boolean admitted = hasInvitation && dressCodeMet && passwordIsCorrect;
        boolean a = (hasInvitation && dressCodeMet) && passwordIsCorrect;
        boolean b = hasInvitation && (dressCodeMet && passwordIsCorrect);
        System.out.println(admitted+"\n"+a+"\n"+b);
    }

}
