public class primenumber{  
 public static void main(String args[]){
        for(int i=2;i <= 50;i++)
        {
            boolean prime = true;
            for(int j = 2;j < i;j++){

                if(i%j == 0)
                {
                    prime = false;
                    break;
                }
            }
            if(prime)
            { System.out.println(i);
            }
        }
    }
}
