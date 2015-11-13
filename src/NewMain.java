/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Recruitment
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(String e:args){
            System.out.println(e);
        }
        String i = "";
        int a =0;
        double b = 0.1;
        char c = 'a';
        
        String tst = "1";
        a = Integer.parseInt(tst);
        b = Double.parseDouble(tst);
        
        b = b * a;
        String gg = "abcde";
        if(gg.contains("a")){
            if(gg.contains("c")){
                if(gg.contains("e")){
                    
                }
            }
            
        }else if(a <= 3){
            
        }else if(a >= 3){
            
        }else if(a != 0){
            
        }else if((a % 2) == 1){
            
        }else{
            
        }
        a = 15;
        while(a < 16){
            System.out.println(a);
            a++;
        }
        a = 10;
        do{
            System.out.println(a);
            a++;
        }while(a < 10);
        
        
        String arz[] = {"one","two","three","four"};
        
        for(int az = arz.length-1;az >= 0;az--){
           //System.out.println(arz[az]);
        }
        
        
        int ars[] = {1,2,3,4,5,6,7};
        for(String cd:arz){
            System.out.println(cd);
        }
        
    }
    
}
