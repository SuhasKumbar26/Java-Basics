//packages in java namespace that organizes class and interfaces & resolves class name conflict.
package Encapsulation.SeniorDeveloper;

//import is used to bring in classes or interfaces from other packages
import java.util.Scanner;

public class Packages {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Encapsulation.JavaDeveloper.Packages pack = new Encapsulation.JavaDeveloper.Packages();
        pack.print();
    }
}
