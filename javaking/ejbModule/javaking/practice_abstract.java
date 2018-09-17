package javaking;

abstract class party{
	protected int cost;
	protected int human;
	
	public void part_name(int cost, int human) {
	
		this.cost = cost;
		this.human = human;
	}
		
  public abstract void tot_party(int basic, int place); 
		
}		
		
		
	class birth_party extends party {

		@Override
		public void tot_party(int basic, int place) {
			// TODO Auto-generated method stub
		     
			 int pay= basic*human + place + 20000; 
			
			System.out.println("생일파티비용" + pay);
			
		}
	}

	class workshop extends party {

		@Override
		public void tot_party(int basic, int place) {
			// TODO Auto-generated method stub
			
			int inwon_check=0;
			inwon_check= (basic*cost+place)/human;  
			
			System.out.println("1명당 비용은" + inwon_check);
		}
	}

public class practice_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		birth_party bp1 = new birth_party();
		bp1.part_name(30000, 8);
		bp1.tot_party(100000, 30000);
		
		workshop ws = new workshop();
		ws.part_name(50000,10);
		ws.tot_party(100000, 28000);
		
	
	}
}
