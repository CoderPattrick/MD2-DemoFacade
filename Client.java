public class Client {
    public void share(String mss){
        SocialFacade facade = new SocialFacade(new Fb(),new Twitter());
        facade.share(mss);
    }
}
