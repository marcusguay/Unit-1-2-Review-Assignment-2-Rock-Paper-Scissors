
import java.util.Scanner;

class rock{

    public static void main( String[]Args){
        Scanner sc=new Scanner(System.in);
        boolean run=true;
       int play=0;
        int w=0;
        int l=1;
        int t=0;
       
        while(run==true){
            System.out.println("Rock Paper Scissors Game");
            System.out.println("Type [1]  for Rock, [2] for Paper, [3] for Scissors");
            
            int HAns= sc.nextInt();
            int RAns= (int)(Math.random()*(4-1)+1); 
            
            if(RAns==1){
             System.out.println("Robot threw Rock");   
                
            }
            if(RAns==2){
             System.out.println("Robot threw Paper");   
                
            }
             if(RAns==3){
             System.out.println("Robot threw Scissors");   
                
            }
            
            if(HAns >=1 && HAns <=3){
               
               if(HAns== 1 && RAns ==1){
                    System.out.println("You tie");
                   t++;
                   System.out.println("Play again? [1 for Yes ,2 for No]");
                   play= sc.nextInt();
                   if(play==1){
                       
                       run=true;
                       
                       
                    }
                    if(play==2){
                       
                       run=false;
                       
                       
                    }
                       
                   
                    
                
                }
                if(HAns== 2 && RAns ==2){
                    System.out.println("You tie");
                t++;
                System.out.println("Play again? [1 for Yes ,2 for No]");
                   play= sc.nextInt();
                   if(play==1){
                       
                       run=true;
                       
                       
                    }
                    if(play==2){
                       
                       run=false;
                       
                       
                    }
                }
                 if(HAns== 3 && RAns ==3){
                   System.out.println("You tie");
                t++;
               System.out.println("Play again? [1 for Yes ,2 for No]");
                  play= sc.nextInt();
                   if(play==1){
                       
                       run=true;
                       
                       
                    }
                    if(play==2){
                       
                       run=false;
                       
                       
                    }
                }
               
                if(HAns== 1 && RAns ==2){
                   System.out.println("You lose");
                l++;
               System.out.println("Play again? [1 for Yes ,2 for No]");
                   play= sc.nextInt();
                   if(play==1){
                       
                       run=true;
                       
                       
                    }
                    if(play==2){
                       
                       run=false;
                       
                       
                    }
                }
                
                if(HAns== 1 && RAns ==3){
                   System.out.println("You win");
                w++;
                System.out.println("Play again? [1 for Yes ,2 for No]");
                 
                   play= sc.nextInt();
                   if(play==1){
                       
                       run=true;
                       
                       
                    }
                    if(play==2){
                       
                       run=false;
                       
                       
                    }
                }
                
                 if(HAns== 2 && RAns ==3){
                    System.out.println("You lose");
                l++;
               System.out.println("Play again? [1 for Yes ,2 for No]");
                   play= sc.nextInt();
                   if(play==1){
                       
                       run=true;
                       
                       
                    }
                    if(play==2){
                       
                       run=false;
                       
                       
                    }
                }
                
                 if(HAns== 2 && RAns ==1){
                   System.out.println("You win");
                w++;
                System.out.println("Play again? [1 for Yes ,2 for No]");
                   play= sc.nextInt();
                   if(play==1){
                       
                       run=true;
                       
                       
                    }
                    if(play==2){
                       
                       run=false;
                       
                       
                    }
                }
                
                  if(HAns== 3 && RAns ==1){
                  
                       
                      System.out.println("You lose");
                l++;
                System.out.println("Play again? [1 for Yes ,2 for No]");
                   play= sc.nextInt();
                   if(play==1){
                       
                       run=true;
                       
                       
                    }
                    if(play==2){
                       
                       run=false;
                       
                       
                    }
                }
                
                  if(HAns== 3 && RAns ==2){
                   System.out.println("You win");
                w++;
                System.out.println("Play again? [1 for Yes ,2 for No]");
                   play= sc.nextInt();
                   if(play==1){
                       
                       run=true;
                       
                       
                    }
                    if(play==2){
                       
                       run=false;
                       
                       
                    }
                }
                
            }
            else {

                System.out.println("ERROR");   

            }
    
        }

            System.out.println("thanks for playing");  
        System.out.println(w + "wins");  
         System.out.println(l + "losses");  
           System.out.println(t+ "ties");
     
    
    
    
    }
    
}