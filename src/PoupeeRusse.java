

public class PoupeeRusse {
    private PoupeeRusse first;
    private boolean isOpen;
    private int taille;

    public PoupeeRusse(int taille) {
        isOpen = true;
        first = null;
        this.taille = taille;

    }

    public PoupeeRusse() {
        isOpen = true;
        first = null;
        this.taille = 1;

    }

    public void ouvrir() {
        if (first == null) {
            if (!isOpen) {
                isOpen = true;
                System.out.println("poupee russe is open");

            }
        } else {
            System.out.println("you cant open this poupee russe.!!");
        }
    }

    public void fermer() {
        if (first == null) {
            if (isOpen) {
                isOpen = false;
                System.out.println("poupee russe is close");
            } else {
                System.out.println("we cant open this poupee russe cuz is already close.!!");
            }
        } else {
            System.out.println("you cant close this poupee cue is already inside a poupee.!!");
        }
    }

    public void placerDans(PoupeeRusse p) {
        if (first == null) {
            if (!isOpen && p.isOpen && p.first == null && p.taille > this.taille) {
                this.first = p;
                System.out.println("Done !!");
            } else {
                System.out.println("we cant place this poupee inside P");
            }
        } else {
            System.out.println("is alrdy in a poupee");
        }
    }

    public void sortirDe(PoupeeRusse p) {
        if (p == this.first) {
            if (first.isOpen) {
                this.first = null;
                System.out.println("done!!!");
            } else {
                System.out.println("p is closed you need to open it");
            }
        } else {
            System.out.println("this is not inside the P");
        }
    }

    public static void main(String... arr) {
        PoupeeRusse pr = new PoupeeRusse(1);
        pr.fermer();
        PoupeeRusse pr2 = new PoupeeRusse(4);
        pr.placerDans(pr2);
        pr.ouvrir();
        PoupeeRusse p = new PoupeeRusse(3);
        pr.sortirDe(pr2);
        pr.ouvrir();
        p.placerDans(pr);
    }
}
