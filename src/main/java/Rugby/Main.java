package Rugby;

public class Main {
    public static void main(String[] args) {


        Player player = new Player("Finn", "flyer", 3, 10);
        Manager manager = new Manager("Gregory");
        Team scotland = new Team("scotland", manager);
        Manager manager2 = new Manager("Fil");
        Team england = new Team("england", manager2);


        //to use teamservice, need to create an instance first
        TeamService teamService = new TeamService();

        //this first calls the teamservice class and invokes the method below, inputting the
        // information for team scotland then stores it in a count
        int count = teamService.countEmptySpacesOnTeam(scotland);
        System.out.println(count);
        int countEngland = teamService.countEmptySpacesOnTeam(england);
        System.out.println(countEngland);

        //to add player, need to call teamservice class then invoke the addplayertoteam method
        // then input the team that is being added to and the player being added
        teamService.addPlayerToTeam(scotland, player);
        System.out.println(scotland);
    }

}
