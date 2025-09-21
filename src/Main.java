import PersonFactory.PersonFactory;
import TeamFactorys.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String teamColor = sc.nextLine();

        if(teamColor.equalsIgnoreCase("Red")){
            PersonFactory redFactory = new RedTeamFactory();
            Team redTeam = new Team(redFactory);
            redTeam.startBattle();
        }
        else if(teamColor.equalsIgnoreCase("Blue")){
            PersonFactory blueFactory = new BlueTeamFactory();
            Team blueTeam = new Team(blueFactory);
            blueTeam.startBattle();
        }
        else {
            System.out.println("There is no team color");
        }

    }
}