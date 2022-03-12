public class Continue_key_word {
    public static void main (String[] args){
        int a =1;
//        for(int i=0; i<10; i++){
//            if (i==3 || i==5){
//                continue;
//            }
//            System.out.println("i= "+i);
//        }

        while(a<10){       // 3
            // a will wait here forever
            a++;
            if(a==3 || a==5){
                continue;
            }
            System.out.println("a= "+a);

        }
    }

}
