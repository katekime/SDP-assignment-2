# SDP-assignment-2 Report
Abstract Factory Pattern
1. Project Goal

The main purpose of this project is to demonstrate the Abstract Factory design pattern.
This pattern allows the creation of groups of related objects (in this case, game characters with different roles) without being tied to specific classes.
The project simulates two teams — Blue Team and Red Team — each consisting of the same roles: Archer, Warrior, Mage, Tank, and Healer.
Each role has its own actions, and the program shows how they perform them during a “battle.”\

2. Architecture and Structure

The codebase is divided into several packages:
PersonInterfaces — defines the interfaces for each role (Archer, Warrior, Mage, Tank, Healer). These are the contracts for character behavior.
PersonFactory — declares the abstract factory (PersonFactory) that creates the characters.
TeamFactorys — contains concrete factories:
BlueTeamFactory — creates Blue Team characters.
RedTeamFactory — creates Red Team characters.
BlueTeam and RedTeam — contain the actual implementations of the characters.
Team — aggregates the roles into a full team, initializes them through a factory, and provides methods to simulate a battle.

3. Key Components

Role Interfaces (PersonInterfaces):
Each role is described by an interface with specific methods:
Archer → shootArrow(), multiShoot(), hide()
Warrior → attack(), block(), powerStrike()
Mage → castSpell(), fireball(), teleport()
Tank → defend(), shield(), stomp()
Healer → heal(), cleanse(), support()

Abstract Factory (PersonFactory):
Declares creation methods for each role.
Concrete Factories:
BlueTeamFactory returns BlueTeam role objects.
RedTeamFactory returning RedTeam role objects.

Concrete Classes (BlueTeam / RedTeam):
Each character implements its role interface and prints role-specific messages.

Team Class:
Accepts a PersonFactory to initialize all roles.
Provides methods like ArcherSkills(), WarriorSkills(), etc., which call the abilities of each role.
The startBattle() method simulates a fight by invoking all role abilities in sequence.
4. Execution Flow
A team is created with a chosen factory, e.g., new Team(new BlueTeamFactory()).
The Team constructor initializes all characters through the factory.
When startBattle() is called, it prints out all character actions, simulating the start of a battle.
5. Strengths
Clear demonstration of the Abstract Factory pattern.
Well-structured code with logical separation of interfaces, factories, and implementations.
Easily extendable: new teams or new roles can be added without breaking existing code.
Role responsibilities are isolated, improving modularity.

6. Conclusion

The project is a successful and clear example of the Abstract Factory pattern in Java.
It is well-organized, easy to extend, and effectively demonstrates how different teams with the same set of roles can be created through factories.
