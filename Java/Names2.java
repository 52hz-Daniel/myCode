
public class Names2{
    
    private String first,middle , last;
    //private String firstStr, middleStr, lastStr;
    
    public Names2(String firstIn, String middleIn, String lastIn){
        first= firstIn;
        middle = middleIn;
        last= lastIn;
    }
    
    public String getFirst(){
     return first;   
    }
    public String getMiddle(){
     return middle;   
    }
    public String getLast(){
     return last;   
    }
    
    public String firstMiddleLast(){
        return first+" "+middle+" "+last;
    }
    public String lastFirstMiddle(){
        return last+", "+first+" "+middle;
    }
    
    //public boolean equals(String name1,String name2){
      //  return name1.equalsIgnoreCase(name2);
    //}
    public boolean equals(Names2 otherName){
        //String name2= otherName.getFirst()+otherName.getMiddle()+otherName.getLast();
     //   public boolean equals(Name otherName){
        return((first+middle+last).equalsIgnoreCase(otherName.getFirst()+otherName.getMiddle()+otherName.getLast()));
    }
        //return name2.equalsIgnoreCase(first+middle+last);
    
    
    public String initials(){
        //return first.substring(1,1);
        String init = first.substring(0,1)+ middle.substring(0,1)+last.substring(0,1);
    return init.toUpperCase();
       // .toUpperCase()+ middle.substring(1,1).toUpperCase()+last.substring(1,1).toUpperCase();
        
       // firstStr=first.substring(1,1);
        
    }
    
    public int length(){
        return first.length()+middle.length()+last.length();
    }
    
    
}