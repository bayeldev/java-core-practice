package practice.level16;

public class task07 {
    public static void main(String[] args) {
        ArtifactChain first = new ArtifactChain();
        first.addArtifact(100);
        first.addArtifact(200);

        first.displayChain();
    }
}

class ArtifactChain{

    private Link start;

    private static class Link{
        int value;
        Link next;

        Link(int value, Link next) {
            this.value=value;
            this.next=next;

        }

    }
    public void addArtifact(int artifactValue) {
        start= new Link(artifactValue, start);
    }

    public void  displayChain() {
        for(Link i = start;i!=null;i=i.next) {
            System.out.println(i.value);
        }
    }
}
