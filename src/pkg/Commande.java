package pkg;
import java.util.*;

public class Commande {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Exercice FMS-RESTO Complet et à terminer ( il faut factoriser et aussi si chiffre > a 5 pour choix des commande)
		//1)hashMap cree pour chaque choix et ensuite renvoyer le choix saisie dans un array
		/*String c1 = entree();
		String c2 = plats();
		String c3 = accompagnement();
		String c4 = boissons();
		String c5 = desserts();*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bonjour bienvenu au FMS-RESTO, combien de menus souhaitez-vous ?");
		
		/*while(!scan.hasNextInt()) {
				System.out.println("Erreur ce n'est pas chiffre");	
				// Important : il faut vider le SCAN incorrect sinon boucle infinyty
				scan.nextLine();
			}*/
		int value = checkScan(scan,"Erreur ce n'est pas chiffre");
		int counterCommande = 0;
		
		while(value > 0) {
			value--;
			counterCommande++;
			
			ArrayList<String> listCommande = new ArrayList<String>();
			System.out.println("");
			System.out.println("--------------------");
			System.out.println("Commande numéro "+counterCommande);
			listCommande.add(entree());
			listCommande.add(plats());
			listCommande.add(accompagnement());
			listCommande.add(boissons());
			listCommande.add(desserts());
			
			System.out.println("Résume de la commande: " + counterCommande);
			for(String commande: listCommande) {
				
				System.out.print(commande+",");
				
			}
		}
		System.out.println(" ");
		System.out.println("Au revoir et à bientot chez FMS-RESTO.");


	}
	public static String entree() {
		
		Scanner scan = new Scanner(System.in);
		String c1 ="string";
		HashMap<Integer, String> entree =  new HashMap<Integer, String>();
		System.out.println("Choix Entreé: ");
		entree.put(1, "SALADE"); 
		entree.put(2, "SOUPE");
		entree.put(3, "QUICHE");
		entree.put(4, "AUCUNE");
		
		System.out.println(entree);
		System.out.println("Que souhaitez-vous comme entreé ? [Saisir le chiffre correspondnant]"); 
		int value = checkScan(scan,"Erreur ce n'est pas chiffre");
		for(int i: entree.keySet()) {
			if(i == value) {
				//System.out.println(entree.get(i))
				// teste à gérer pour ne pas afficher "aucun".
				 c1 = entree.get(i);
				
			}
		}
		return c1; 
	}
	public static String plats() {
			
			Scanner scan = new Scanner(System.in);
			String c1 ="string";
			HashMap<Integer, String> plats =  new HashMap<Integer, String>();
			System.out.println("Choix Plats: ");
			plats.put(1, "POULET"); 
			plats.put(2, "BOEUF");
			plats.put(3, "POISSON");
			plats.put(4, "VEGETARIEN");
			plats.put(5, "VEGAN");
			plats.put(6, "AUCUN");
			
			System.out.println(plats);
			System.out.println("Que souhaitez-vous comme plats ? [Saisir le chiffre correspondnant]"); 
			int value = checkScan(scan,"Erreur ce n'est pas chiffre");
			for(int i: plats.keySet()) {
				if(i == value) {
					//System.out.println(entree.get(i));
					 c1 = plats.get(i);
					
				}
			}
			return c1; 
		}
	public static String accompagnement() {
		
		Scanner scan = new Scanner(System.in);
		String c1 ="string";
		HashMap<Integer, String> accompagnement =  new HashMap<Integer, String>();
		System.out.println("Choix accompagnements: ");
		accompagnement.put(1, "RIZ"); 
		accompagnement.put(2, "PATES");
		accompagnement.put(3, "FRITES");
		accompagnement.put(4, "LEGUMES");
		accompagnement.put(5, "AUCUN");
		
		System.out.println(accompagnement);
		System.out.println("Que souhaitez-vous comme accompagnement ? [Saisir le chiffre correspondnant]"); 
		int value = checkScan(scan,"Erreur ce n'est pas chiffre");
		for(int i: accompagnement.keySet()) {
			if(i == value) {
				//System.out.println(entree.get(i));
				 c1 = accompagnement.get(i);
				
			}
		}
		return c1; 
	}
	public static String boissons() {
			
			Scanner scan = new Scanner(System.in);
			String c1 ="string";
			HashMap<Integer, String> boissons =  new HashMap<Integer, String>();
			System.out.println("Choix boissons: ");
			boissons.put(1, "EAU PLATE"); 
			boissons.put(2, "EAU GAZEUZE");
			boissons.put(3, "SODA");
			boissons.put(4, "VIN");
			boissons.put(5, "AUCUNE");
			
			System.out.println(boissons);
			System.out.println("Que souhaitez-vous comme boissons ? [Saisir le chiffre correspondnant]"); 
			int value = checkScan(scan,"Erreur ce n'est pas chiffre");
			for(int i: boissons.keySet()) {
				if(i == value) {
					//System.out.println(entree.get(i));
					 c1 = boissons.get(i);
					
				}
			}
			return c1; 
		}
	public static String desserts() {
		
		Scanner scan = new Scanner(System.in);
		String c1 ="string";
		HashMap<Integer, String> desserts =  new HashMap<Integer, String>();
		System.out.println("Choix desserts: ");
		desserts.put(1, "TARTE MAISON"); 
		desserts.put(2, "MOUSSE AU CHOCOLATS");
		desserts.put(3, "TIRAMISU");
		desserts.put(4, "AUCUN");
		
		System.out.println(desserts);
		System.out.println("Que souhaitez-vous comme desserts ? [Saisir le chiffre correspondnant]"); 
		int value = checkScan(scan,"Erreur ce n'est pas chiffre");
		for(int i: desserts.keySet()) {
			if(i == value) {
				//System.out.println(entree.get(i));
				 c1 = desserts.get(i);
				
			}
		}
		return c1; 
	}
	public static String hashMap(HashMap<Integer, String> col) {
			
			Scanner scan = new Scanner(System.in);
			String c1 ="string";
			HashMap<Integer, String> entree =  new HashMap<Integer, String>();
			/*System.out.println("Choix desserts: ");
			entree.put(1, "TARTE MAISON"); 
			entree.put(2, "MOUSSE AU CHOCOLATS");
			entree.put(3, "TIRAMISU");
			entree.put(4, "AUCUN");*/
			
			System.out.println(entree);
			//System.out.println("Que souhaitez-vous comme desserts ? [Saisir le chiffre correspondnant]"); 
			int value = checkScan(scan,"Erreur ce n'est pas chiffre");
			for(int i: entree.keySet()) {
				if(i == value) {
					//System.out.println(entree.get(i));
					 c1 = entree.get(i);
					
				}
			}
			return c1; 
		}
	// Méthode pour tester si on entre un chiffre 
	public static int checkScan(Scanner scan,  String promptOnError) {
		
		// Tant que c'est pas un chiffre on boucle 
		while(!scan.hasNextInt()) {
			System.out.println(promptOnError);	
			// Important : il faut vider le SCAN incorrect sinon boucle infinyty
			scan.nextLine();
		}
		int input = scan.nextInt();	
		scan.nextLine(); // On vide le buffer
		return input; 
	}


}
