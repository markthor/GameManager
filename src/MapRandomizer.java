import java.util.HashMap;
import java.util.Random;
public class MapRandomizer
{
	private static Random random = new Random();
	private static HashMap<Integer, String> maps = new HashMap<Integer, String>();
	private static int count = 0;
	private static int players;
	
	public static void loadBNOneVsOne()
	{
		addMap("Korhal Compound");
		addMap("Ohana LE");
		addMap("Metropolis");
		addMap("Metalpolis");
		addMap("Day Break");
		addMap("Antiga Shipyard");
		addMap("Cloud Kingdom");
		addMap("Shakuras Plateau");
		addMap("Entombed Valley");
		addMap("Taldarim Altar LE");
	}
	
	public static void loadGSLOneVsOne()
	{
		addMap("Day Break");
		addMap("Antiga Shipyard");
		addMap("Dual Sight");
		addMap("Entombed Valley");
		addMap("Ohana");
		addMap("Atlantis Spaceship");
		addMap("Metropolis");
		addMap("Cloud Kingdom");
	}
	
	public static void loadGSTLOneVsOne()
	{
		addMap("Day Break");
		addMap("Antiga Shipyard");
		addMap("Dual Sight");
		addMap("Entombed Valley");
		addMap("Ohana");
		addMap("Atlantis Spaceship");
		addMap("Metropolis");
		addMap("Cloud Kingdom");
		addMap("Whirlwind");
		addMap("Muspelheim");
	}
	
	public static void loadBNTwoVsTwo()
	{
		addMap("Boneyard");
		addMap("High Orbit");
		addMap("Lunar Coloni V");
		addMap("Scorched Haven");
		addMap("The Ruins of Tarasonis");
		addMap("Kyrador Keep");
		addMap("Magma Core");
	}
	public static void addMap(String s)
	{
		maps.put(count, s);
		count++;
	}
	/*
	public static void main(String[] args)
	{
		System.out.println("Select Map Pool: 1. GSL 2. BN Ladder 3. GSTL");
		int mapPool = StdIn.readInt();
		if(mapPool == 2) {
		System.out.println("Select amount of players on each side:");
			players = StdIn.readInt();
		}
		else {
			players = 1;
		}
		if(mapPool == 1 && players == 1)
		{
			loadGSLOneVsOne();
		}
		else if(mapPool == 2 && players == 1)
		{
			loadBNOneVsOne();
		}
		else if(mapPool == 3 && players == 1)
		{
			loadGSTLOneVsOne();
		}
		else if(players == 2)
		{
			loadBNTwoVsTwo();
		}
		System.out.println(maps.get(Math.abs(random.nextInt())%count));	
	}
	*/
}