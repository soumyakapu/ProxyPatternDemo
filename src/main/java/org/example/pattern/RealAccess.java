package org.example.pattern;

public class RealAccess implements InternetAccess{
    private String userName;

    public RealAccess(String userName) {
        this.userName = userName;
    }

    @Override
    public void grantAccess() {
        System.out.println("InterAccess granted for user : "+userName);
    }
}
