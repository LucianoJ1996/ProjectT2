//package Project00;

import java.util.*;
/*import Project00.Team;
import Project00.Member;
import Project00.JordanMember;
*/

public class TeamThree extends Team
{
    public TeamThree(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new JordanMember("Jordan Luciano"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}
