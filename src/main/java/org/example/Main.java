package org.example;

import org.example.pattern.ProxyAccess;
import org.example.pattern.RealAccess;

public class Main {
    public static void main(String[] args) {
        ProxyAccess proxyAccess=new ProxyAccess("Sonu");
        proxyAccess.grantAccess();
    }
}