public class Waiters {
    String userName;
    String password;


    public Waiters(String name, int registerCode, String password){
        this.userName = name;
        this.password = password;
    }
    public Waiters(){

    }
    public String getName() {
        return userName;
    }


    public String getPassword() {
        return password;
    }




}