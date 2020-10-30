package companytrain;

import java.util.Scanner;

public class CompanyTrain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Company CodeSuckers = new Company();
        CodeSuckers.input(sc);
        CodeSuckers.searchByName("VladosBandos");
        
    }
    
}
