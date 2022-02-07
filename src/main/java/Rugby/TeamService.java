package Rugby;

public class TeamService {
    //count empty spaces on team
    //return int
    //parameter: Team

    public int countEmptySpacesOnTeam(Team team) {
        //temp variable to store count
        int count = 0;
        //Loop through players array and count nulls
        //team.getplayers() gets back the array of players in a team. need to find the length using .length to find out how many players we have got
        for(int i = 0; i < team.getPlayers().length; i++) {
            //if player equals null, add to count
            if(team.getPlayers()[i] == null) {
                count++;
            }
        }
        return count;
    }

    public void addPlayerToTeam(Team team, Player player){
        //loop through the players array find a null.
        //add player to null
        Player[] players = team.getPlayers();
        for (int i = 0; i < team.getPlayers().length; i++) {
            if(team.getPlayers()[i] == null) {
                players[i] = player;
                break;
            }
        }
    }
}

//        for (Player player : team.getPlayers()) {
//            if(player == null) {
//                count++;
//            }
//        }
