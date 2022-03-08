public class Fb implements SocialShare{
    private String mss;
    @Override
    public void setMss(String mss) {
        this.mss=mss;
    }

    @Override
    public void share() {
        System.out.println("Sharing to fb: "+mss);
    }
}
