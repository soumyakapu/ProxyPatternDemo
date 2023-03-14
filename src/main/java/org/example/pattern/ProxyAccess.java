package org.example.pattern;

public class ProxyAccess implements InternetAccess{
    private String userName;
    private RealAccess realAccess;
    public ProxyAccess(String userName) {
        this.userName = userName;
    }

    @Override
    public void grantAccess() {
    realAccess=new RealAccess(userName);
    if(getAccess()>2){
        System.out.println("Access granted to user : "+userName);
    }
    else
    {
        System.out.println("Internet not allowed for user : "+ userName);
    }
    }
    public  int getAccess(){
        return 5;
    }
}
