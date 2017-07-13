// My HackerRank Submissions
//@Author - Devendra Kushwah
import java.util.*;
class Sports{

    String getName(){
        return "Generic Sports";
    }
  
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    
void getNumberOfTeamMembers()
{
    System.out.println( "Each team has 11 players in " + getName() );
}