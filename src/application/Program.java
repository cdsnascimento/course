package application;

import java.io.File;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();
        
        File path = new File(strPath);
        
        //Exibindo apenas o nome do arquivo, sem as pastas;
        System.out.println("getName: " + path.getName());
        
        //Exibindo apenas o caminho sem o arquivo;
        System.out.println("getParent: " + path.getParent());
        
        
        sc.close();

    }
}
