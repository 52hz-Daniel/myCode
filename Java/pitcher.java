public class pitcher{
  public static void main(String[] args){
     
      int[][]pitchSrray={
            {45,105,67},
            {81,100,93,25,128,88},
            {45,53},
            {79,107,53,79},
            {11,9,3,63,20,18,3}};
            
            
            int average;
            
            
            
       for (int i=0;i<pitchSrray.length;i++){
           int biggest=0;
            int smallest=10000;
            int total=0;
            int pt=0;
            String out="";
            
          for( int ptime=0;ptime<pitchSrray[i].length;ptime++){
            if (pitchSrray[i][ptime]>biggest)
             biggest= pitchSrray[i][ptime];
            if (pitchSrray[i][ptime]<smallest)
            smallest=pitchSrray[i][ptime];
            total+=pitchSrray[i][ptime];
             pt++;
            }
         out+="Pitcher#"+i+" pitched "+pt+ " games. ";
            out+="His largest pitch count was: "+biggest;
            out+=", smallest was: "+ smallest;
            out+=", total was: " +total;
            out+=", and average pitch count was: "+total/pt+"\n";
            System.out.println(out);
            
        }
        
        
    }
    
}