public class SocialFacade {
    private Fb fb;
    private Twitter twitter;

    public SocialFacade(Fb fb, Twitter twitter) {
        this.fb = fb;
        this.twitter = twitter;
    }
    public void share(String mss){
        this.twitter.setMss(mss);
        this.fb.setMss(mss);
        this.twitter.share();
        this.fb.share();
    }
}
