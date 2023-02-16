import java.util.Scanner;

public class KonoBat
{
    public static void main(String[] args)
    {
        double erradioa;
        double altuera;
        double azalera;
        double bolumena;
        Scanner sarrera = new Scanner(System.in);

        System.out.print("Sartu konoaren erradioa: ");
        erradioa = sarrera.nextDouble();

        System.out.print("Sartu konoaren altuera: ");
        altuera = sarrera.nextDouble();

        System.out.printf("Konoaren azalera %.2f da eta bolumena %.2f\n",azalera(erradioa,altuera),bolumena(erradioa,altuera));
    }
	
	private static double azalera(double erradioa,double altuera)
	{
		return Math.PI * erradioa * erradioa + Math.PI * erradioa * Math.sqrt(altuera * altuera + erradioa * erradioa);
	}

	private static double bolumena(double erradioa,double altuera)
	{
		return Math.PI * erradioa * erradioa * altuera / 3;
	}
}
