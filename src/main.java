import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
public class Midterm_20180808011 {

		
		public static void main(String[] args) throws InterruptedException {
			
		
		GYM gym =new GYM("Efe GYM",26);
		
		PecDecFly pecDecFly = new PecDecFly(false, 2);
		CableCrossover cableCrossOver=new CableCrossover(false, 1);
		LatPullDown latPullDown = new LatPullDown(true, 1);
		
		FitnessMachines machines = new FitnessMachines(cableCrossOver, latPullDown, pecDecFly);
		
		IPersonnel 	 coach1 = new FitnessCoach ("Tuðrul", 32, 3500, 4);
		FitnessCoach coach2 = new FitnessCoach("Gonca", 32, 3500, 4);
		FitnessCoach coach3= new FitnessCoach("Volkan", 27, 3000,3);
		
		Repairman repairman = new Repairman("Mehmet", 35, 3200, 4, "05053998427");
		
		Exercise ex1 =new Exercise(10, 10, 10, 10);
		Exercise ex2=new Exercise(15, 15, 15, 15);
		Exercise ex3=new Exercise(20, 20, 20, 20);
		Exercise ex4=new Exercise(25, 25, 25, 25);
		Exercise ex5=new Exercise(30, 30, 30, 30);
		
		Members m1= new Members("Zafer Barýþ","Male",20,ex1);
		Members m2= new Members("Sevinç Sevilen","Female",25,ex4);
		Members m3= new Members("Enes Ay","Male",22,ex4);
		Members m4= new Members("Ayþe Kalyoncu","Female",18,ex3);
		Members m5= new Members("Emre Çil","Male",34,ex3);
		Members m6= new Members("Gizem Ayhan","Female",19,ex1);
		Members m7= new Members("Mehmet Karakaya","Male",34,ex3);
		Members m8= new Members("Elifnur Demir","Female",22,ex2);
		Members m9= new Members("Yener Çevik","Male",21,ex1);
		Members m10= new Members("Nihal Barýþ","Female",39,ex3);
		Members m11= new Members("Mazlum Balýk","Male",19,ex5);
		Members m12= new Members("Merve Çetin","Female",19,ex4);
		Members m13= new Members("Kemal Temur","Male",20,ex4);
		Members m14= new Members("Sude Oðuz","Female",20,ex5);
		Members m15= new Members("Osman Tandýrcý","Male",20,ex5);
		Members m16= new Members("Banu Akýn","Female",27,ex4);
		Members m17= new Members("Joseph Ledet","Male",42,ex4);
		Members m18= new Members("Demet Gülçiçek","Female",21,ex1);
		Members m19= new Members("Alperen Aksoy","Male", 27,ex2);
		Members m20= new Members("Pelin Þimþek","Female",35,ex3);
		Members m21= new Members("Mustafa Kesat","Male",25,ex3);
		Members m22= new Members("Kübra Yurtçu","Female",19,ex5);
		Members m23= new Members("Cevat Barýþ","Male",48,ex5);
		Members m24= new Members("Aslý Barýþ","Female",22,ex1);
		Members m25= new Members("Mustafa Ünal","Male",45,ex2);
		Members m26= new Members("Filiz Çiçek","Female",22,ex1);
		Members m27= new Members("LimitTest1","Male",22,ex2);

		
		gym.addMachine(machines);
		gym.addMember(coach1);
		gym.addMember(coach2);
		gym.addMember(coach3);
		
		gym.addMember(repairman);
		
		gym.addMember(m1);
		gym.addMember(m2);
		gym.addMember(m3);
		gym.addMember(m4);
		gym.addMember(m5);
		gym.addMember(m6);
		gym.addMember(m7);
		gym.addMember(m8);
		gym.addMember(m9);
		gym.addMember(m10);
		gym.addMember(m11);
		gym.addMember(m12);
		gym.addMember(m13);
		gym.addMember(m14);
		gym.addMember(m15);
		gym.addMember(m16);
		gym.addMember(m17);
		gym.addMember(m18);
		gym.addMember(m19);
		gym.addMember(m20);
		gym.addMember(m21);
		gym.addMember(m22);
		gym.addMember(m23);
		gym.addMember(m24);
		gym.addMember(m25);
		gym.addMember(m26);
		//test1  error our gym has...
		gym.addMember(m27);
		
		
		//MemberList size
		System.out.println("Gym have "+gym.membersList.size()+" members.\n");
		
		//Members list elements
		gym.printMemberList();
		
		System.out.println();
		//state of fitness hall
		gym.gymStatus();
		
		System.out.println();
		//Finding members and delete...
		System.out.println(gym.findMember("Gizem Ayhan"));//find member
		gym.deleteMember((gym.findMember("Gizem Ayhan")));//delete member
		System.out.println(gym.findMember("Gizem Ayhan"));// after delete check
		
		System.out.println();
		//Random packet choosing because of the methods of -buyMembership- is too long and gym have 26 members
		//the fallowing code select random packet_selection
		
		for(int i=0;i<gym.membersList.size();i++) {
			int a=(int)(Math.random()*12+1);
			if(gym.membersList.get(i).getPacket_selection()==0) {
				gym.membersList.get(i).setPacket_selection(a);
			}
		}
		System.out.println();

			//Checking machines isbroken and repair
			gym.checkMachines();//check broken machines
			repairman.repairMachines(machines);//repair that machines
			gym.checkMachines();//after repair check
			
			System.out.println();
		
			System.out.println(gym.profitMargin());//profit margin
			System.out.println();
			
			gym.deleteMember(m1);
			gym.deleteMember(m2);
			gym.deleteMember(m3);
			System.out.println();
			//Members list elements-checking deleteMember
			gym.printMemberList();
		
			System.out.println();
			System.out.print("profit margin:\n");
			System.out.println(gym.profitMargin());//unprofitable error
			
			gym.dismissWorker();
			
			System.out.println();
			System.out.print("new profit margin:");
			System.out.println(gym.profitMargin());// profit margin
			
			coach2.givePrize(coach2);
			coach3.givePrize(coach3);
			
			System.out.println();
			
			m21.setFitnessCoach(coach2);// assigning a trainer to the athlete
			
			coach2.prepareExercise();// create new exercise
			
			m21.doWorkOut();// do work out
			
			System.out.println();
			
			m21.buyMembership();// buy a memberShip
			
			System.out.println();
			
			m21.payAccount();
		
		}
		
		}
	class Repairman extends Personnel implements IPersonnel{
	private int experience;
	private String phone;
	
	

	public Repairman(String isim, int yas, int maas, int experience, String phone) {
		super(isim, yas, maas);
		this.experience = experience;
		this.phone = phone;
	}
	
	
	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}



	public void repairMachines(FitnessMachines machine) 
	{
		
			if(machine.getCc().isBroken()) 
			{
				System.out.println("The repairman named "+this.getName()+" repaired the "+machine.getCc().getName() +" machine.");
				machine.getCc().setBroken(false);
			}
			else if(machine.getLpd().isBroken()) 
			{
				System.out.println("The repairman named "+this.getName()+" repaired the "+machine.getLpd().getName() +" machine.");
				machine.getLpd().setBroken(false);
			}
			else if(machine.getPdf().isBroken()) 
			{
				System.out.println("The repairman named "+this.getName()+" repaired the "+machine.getPdf().getName() +" machine.");
				machine.getPdf().setBroken(false);
			}

			
			
			}
		
		
	
	@Override
	public void paySalary(IPersonnel worker) {
		System.out.println("Salaries of our employees differ.");
		this.setSalary(2500+25*this.experience);
		System.out.println("The salary of the repairman named "+this.getName()+" was paid.");
	}

	@Override
	public void givePrize(IPersonnel worker) {
		
		System.out.println((((int)super.salary/100+20)+ "TL bonus was given to the employee named" +this.name));
	}
	


}


	abstract class Personnel implements IPersonnel{

    protected String name;
    private int age;
    protected int salary;
    private final String id=UUID.randomUUID().toString();
    public ArrayList<Personnel> personnelList;
    

    public Personnel(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        personnelList= new ArrayList<Personnel>();
    }

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getId() {
		return id;
	}




	@Override
	public abstract void paySalary(IPersonnel calisan);
	@Override
	public abstract void givePrize(IPersonnel calisan);

}
		
	


	class PecDecFly extends FitnessMachines{
	private  final String name ="PecDecFly";
	private int used;

	public PecDecFly(boolean broken, int used) {
		super(broken);
		this.used = used;
		
	}

	public int getUsed() {
		return used;
	}

	public void setUsed(int used) {
		this.used = used;
	}

	
	public String getName() {
		return name;
	}


	
	
}


	class Members {

	private String name;
    private int age;
    private String gender;
    private final String id=UUID.randomUUID().toString();
    private int packet_selection;
    private FitnessCoach private_trainer;  
    private Exercise exercise;
  	
   
    public Members(String name,String gender, int age, Exercise exercise) {
		
		this.name = name;
		this.gender=gender;
		this.age = age;
		this.setExercise(exercise);

	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public FitnessCoach getPrivate_trainer() {
		return private_trainer;
	}



	public void setPrivate_trainer(FitnessCoach private_trainer) {
		this.private_trainer = private_trainer;
	}



	public Exercise getExercise() {
		return exercise;
	}


	public String getId() {
		return id;
	}


	public int getPacket_selection() {
		return packet_selection;
	}


	public void setFitnessCoach(FitnessCoach eðitmenim) {
		this.private_trainer = eðitmenim;
		System.out.println("Athlete named "+this.getName()+" will work with "+this.getPrivate_trainer().getName()+" fitness coach.");
	}


	public void setPacket_selection(int packet_selection) {
		if(packet_selection>0 && packet_selection<13) {
		this.packet_selection = packet_selection;
		}
	else {
		System.out.println("invalid request please choose(1-12).");
		
	}
	}

	


	public void buyMembership() throws InterruptedException {
		String membership_menu="Welcome to our membership selection menu\n"
								+"1.*1* month membership-->120TL\n"
								+"2.*3* month membership-->240tl\n"
								+"3.*6* month membership--->480TL\n"
								+"4 *12* month membership-->1440TL\n"
								+"Click on how many months you want to take.\n"
								+"Press '0' to exit";
		System.out.println(membership_menu);
		Scanner sc =new Scanner(System.in);
		System.out.print("Please click the package you want to choose:");
		
			
		
		int request=sc.nextInt();
		sc.nextLine();
		int counter2=5;
		boolean check = true;
		while(check) {
			
			
			if(request==0) {
				System.out.print("Exiting the membership menu...");
				Thread.sleep(3000);
				check=false;
				break;
			}
			else if(request>0 && request<13 && counter2>0) {
				
				System.out.println(request+" You have selected the "+request+" months menu, press 'yes' to confirm:" );
				Scanner sc2 = new Scanner(System.in);
				String verify=sc2.nextLine();
				
				if(verify.equalsIgnoreCase("Yes")) {
					System.out.println("Your selection has been confirmed.");
					this.setPacket_selection(request);
					break;
					
				}
				else {
					System.out.println("Your transaction has been disapproved. Try again");
					counter2--;
					System.out.println("Remaining "+counter2);
				}
			}
			else {
				System.out.println("Invalid operation. Exiting the menu");
				break;
			}
			}
	}
	
		public void payAccount() throws InterruptedException {

			if(this.packet_selection<13 && this.packet_selection>0) {
				double a=120;
				
				System.out.println("The package you choose is "+this.packet_selection+" months.");
				System.out.println("The amount you need to pay is "+(a*this.packet_selection)+".");
				System.out.println("Payment begins...");
				Thread.sleep(3000);
				Scanner sc = new Scanner(System.in);
				System.out.print("Please give money :");
				int given=sc.nextInt();
				if(given<this.packet_selection*a) {
					System.out.println("You gave missing money.");
					Thread.sleep(3000);
					int counter=5;
					while((given<this.packet_selection*a) && counter>=0) {
						
						System.out.print("Please give a valid value (remaining trial= "+counter+")"+ ":");
						int given2=sc.nextInt();
						if(!(given2<this.packet_selection*a)) {
							System.out.println("Thank you for shopping from us.");
							System.out.println("Pay back : "+(given2-this.packet_selection*a));
							break;
						}
						counter--;
					}
					System.out.println("Exiting the payment system...");
				
				}
				else {
					System.out.println("Thank you for shopping from us");
					System.out.println("Pay back :"  +(given-this.packet_selection*a));
				}
			}
		}
		
		public void doWorkOut() {
			
				
			Scanner scanner = new Scanner(System.in);

			
			System.out.println("WELCOME TO THE TRAINING PROGRAM");
			System.out.println("If you want to end your workout, press the q button.");
			
			String idmanlar = "Your workout includes:\n"
							+ "Burpee-->"+this.exercise.getNumberOfBurpee()+"\n"
							+ "Pushup-->"+this.exercise.getNumberOfPushup()+"\n"
							+ "Situp-->"+this.exercise.getNumberOfSitup()+"\n"
							+ "Squat-->"+this.exercise.getNumberOfSquat();
			
			
			System.out.println(idmanlar);
			System.out.println("Your training is starting");
			
			while(this.exercise.isExerciseFinished()==false) {
				System.out.println("Movement type(Burpee,Pushup,Situp,Squat) : ");
				
				String tour =scanner.nextLine();
				if(tour.equalsIgnoreCase("q")) {
					System.out.println("You have finished your workout.");
					break;
				}
				
				System.out.println("How many will you be doing this move :" );
				
				int number = scanner.nextInt();
				
				scanner.nextLine();
				
				this.exercise.doExercise(tour, number);
				
				
			}
			System.out.println("You have finished your training successfully...");
			
			
			}

		@Override
		public String toString() {
		
			return this.getName();
		}
			
					
	

}


	class LatPullDown extends FitnessMachines{
	public final String name ="LatPullDown";
	private int used;

	public LatPullDown(boolean broken, int used) {
		super(broken);
		this.used = used;
		
	}

	
	public String getName() {
		return name;
	}


	public int getUsed() {
		return used;
	}


	public void setUsed(int used) {
		this.used = used;
	}
	
}

	interface IPersonnel {
	
	void paySalary(IPersonnel worker);
	void givePrize(IPersonnel worker);
	
	
}


  		class GYM{
		private String name;
		private double income_expenses;
		private int size;
	    private final String id=UUID.randomUUID().toString();
	    private FitnessMachines fitnessMachines;
	    public ArrayList<Members> membersList;
	    public ArrayList<Personnel> workersList;
	    public ArrayList<FitnessMachines> machinesList;
	 
	    public GYM(String name,int size) {
		this.size=size;
		this.name=name;
		membersList=new ArrayList<Members>();
		workersList=new ArrayList<Personnel>();
		machinesList=new ArrayList<FitnessMachines>();
	}
	  
	


		public String getName() {
			return name;
		}




		public void setName(String name) {
			this.name = name;
		}




		public double getIncome_expenses() {
			return income_expenses;
		}




		public void setIncome_expenses(double income_expenses) {
			this.income_expenses = income_expenses;
		}




		public int getSize() {
			return size;
		}




		public void setSize(int size) {
			
			this.size = size;
		}




		public FitnessMachines getFitneessMachines() {
			return fitnessMachines;
		}




		public void setFitnessMachine(FitnessMachines fitnessMachines) {
			this.fitnessMachines = fitnessMachines;
		}




		public String getId() {
			return id;
		}




		public void checkMachines() {
			if(fitnessMachines.getLpd().isBroken()){
				System.out.println(fitnessMachines.getLpd().getName()+" is broken.");
				
			}
			else if(fitnessMachines.getPdf().isBroken()){
				System.out.println(fitnessMachines.getPdf().getName()+" is broken.");
				
			}
			else if(fitnessMachines.getCc().isBroken()){
				System.out.println(fitnessMachines.getPdf().getName()+" is broken.");
				
			}
			
			else {
				System.out.println("All the machines are working right now.");
			}
			
		}
		public void addMachine(FitnessMachines machine) {
			this.setFitnessMachine(machine);
		}
	    
		public <T>void addMember(T object) {
			if(this.getSize()>membersList.size()) {
			if(Personnel.class.isInstance(object)) {
				workersList.add((Personnel) object);
				
			}
			else if(Members.class.isInstance(object)) {
				membersList.add((Members) object);
			}
			else {
				System.out.println("The member could not be added to the system....");
			}
		}
			else {
				System.out.println("Our gym has reached the limit of athletes.");
			}
		}
		public <T> void deleteMember(T object) {
			
			if(Personnel.class.isInstance(object)) {
				workersList.remove(workersList.indexOf(object));
				System.out.println(object.toString()+" has been deleted.");
				
				
			}
			else if(Members.class.isInstance(object)) {
				membersList.remove(membersList.indexOf(object));
				System.out.println(object.toString()+" has been deleted.");
			
			}
			else {
				System.out.println("Our member could not be deleted....");
			}
		
				
				
			}
			public Members  findMember(String name) 
			{
					
					for(int i =0; i<membersList.size();i++) 
					{ 
							if(membersList.get(i).getName().equalsIgnoreCase(name)) 
							{
								return   membersList.get(i);
							}
					}
			
				return null;
	
			}
			public Personnel  findPersonnel(String name) 
			{
					
					for(int i =0; i<workersList.size();i++) 
					{ 
							if(workersList.get(i).getName().equalsIgnoreCase(name)) 
							{
								return  workersList.get(i);
							}
					}
			
				return null;
	
			}
			public void gymStatus(){
				int male_c=0;
				int female_c=0;
				int repairman_c=0;
				int fitness_coach=0;
				for(int i =0; i<membersList.size();i++) 
				{ 
					if(membersList.get(i).getGender().equalsIgnoreCase("Male")) {
						male_c++;
					}
					else if(membersList.get(i).getGender().equalsIgnoreCase("Female")) {
						female_c++;
					}
				}
				for(int i =0; i<workersList.size();i++) {
					
					if(Repairman.class.isInstance(workersList.get(i))) {
						repairman_c++;
					}
					else {
						fitness_coach++;
					}
				}
				System.out.println("   Male        |        Female    ");
				System.out.println("------------   |     -----------");
				for(Members a : membersList) {
					if(a.getGender().equalsIgnoreCase("Male")) {
						String b ="";
						int i=15-a.getName().length();
						
						for(int k=0;k<i;k++) {
							b+=" ";
						}
						System.out.print(a.getName()+b);
						System.out.print("|    ");
					}
					else if(a.getGender().equalsIgnoreCase("Female"))
					{
						System.out.print(a.getName()+"\n");
					}
					
					
				}
				System.out.println();
				
					
				
				System.out.println("Currently, "+fitness_coach+" fitness coaches and "+repairman_c+" repairmen work in our hall.");
				System.out.println("Currently, there are "+male_c+" Male and "+female_c+" Female in our gym");
				
			}
			public double profitMargin() {
				double income=0;
				double expenses=0;
				for(int i =0; i<membersList.size();i++) 
				{ 
					income+=membersList.get(i).getPacket_selection()*120;
			     }
				for(int i =0; i<workersList.size();i++) 
				{ 
				expenses+=workersList.get(i).getSalary();
			     }
				this.setIncome_expenses(income-expenses);
				if(income-expenses<4000) {
				System.out.println("The budget of the gym began to hurt." + 
						"Please lay off the worker.");
				
				}
				return income-expenses;
				}
			
			public void dismissWorker() {
				int first=workersList.size();
						for(int i=0;i<workersList.size();i++)
				{
					if(this.getIncome_expenses()<4000) {
						workersList.remove(i);
					}
					
				}
				int end=workersList.size();
				System.out.println((first-end)+" workers were laid off to make a profit.");
				
			}
			public void printMemberList() {
				System.out.println("Member List:");
				for(int i=0; i<membersList.size();i++) {
					System.out.println((i+1)+"."+membersList.get(i));
				}
			}

			
		
			
}


	class FitnessMachines {

	 
	protected boolean broken;
	private CableCrossover cc;
	private LatPullDown lpd;
	private PecDecFly pdf;
	
	public FitnessMachines(CableCrossover cc, LatPullDown lpd, PecDecFly pdf) {
		this.cc = cc;
		this.lpd = lpd;
		this.pdf = pdf;
		
	}
	public FitnessMachines(boolean broken) {
		this.broken=broken;
		
	}


	
	public CableCrossover getCc() {
		return cc;
	}

	public void setCc(CableCrossover cc) {
		this.cc = cc;
	}


	public LatPullDown getLpd() {
		return lpd;
	}


	public void setLpd(LatPullDown lpd) {
		this.lpd = lpd;
	}


	public PecDecFly getPdf() {
		return pdf;
	}


	public void setPdf(PecDecFly pdf) {
		this.pdf = pdf;
	}


	public boolean isBroken() {
		return broken;
	}

	public void setBroken(boolean broken) {
		this.broken = broken;
	}
	
	

}

	class FitnessCoach extends Personnel implements IPersonnel {
    private int experienced;

    public FitnessCoach(String name, int age, int salary ,int experienced) {
        super(name, age, salary);
        this.experienced=experienced;
        this.setSalary(salary+experienced*100);
    }

   
    public int getExperienced() {
		return experienced;
	}


	public void setExperienced(int experienced) {
		this.experienced = experienced;
	}


	public void prepareExercise() throws InterruptedException {
        

        System.out.println("Fitness coach named "+this.getName()+" is preparing the program.");
        Thread.sleep(3000);
        System.out.println("Your program is prepared.");

    }

	@Override
	public String toString() {
		
		return this.getName();
	}

	@Override
	public  void paySalary(IPersonnel worker) {
		this.setSalary(3000+75*this.experienced);
		System.out.println("The salary of the fitness coach named " +this.getName()+" was paid.");
		
		
	}

	@Override
	public void givePrize(IPersonnel worker) {
		System.out.println((((int)this.salary/100+20)+ "TL bonus was given to the employee named " +this.name +"."));
	}
	
 

}

	class Exercise {
	private int numberOfBurpee;
	private int numberOfPushup;
	private int numberOfSitup;
	private int numberOfSquat;
	
	public Exercise(int numberOfBurpee, int numberOfPushup, int numberOfSitup, int numberOfSquat) {
		
		this.numberOfBurpee = numberOfBurpee;
		this.numberOfPushup = numberOfPushup;
		this.numberOfSitup = numberOfSitup;
		this.numberOfSquat = numberOfSquat;
		
		
	}

	public int getNumberOfBurpee() {
		return numberOfBurpee;
	}

	public void setNumberOfBurpee(int numberOfBurpee) {
		this.numberOfBurpee = numberOfBurpee;
	}

	public int getNumberOfPushup() {
		return numberOfPushup;
	}

	public void setNumberOfPushup(int numberOfPushup) {
		this.numberOfPushup = numberOfPushup;
	}

	public int getNumberOfSitup() {
		return numberOfSitup;
	}

	public void setNumberOfSitup(int numberOfSitup) {
		this.numberOfSitup = numberOfSitup;
	}

	public int getNumberOfSquat() {
		return numberOfSquat;
	}

	public void setNumberOfSquat(int numberOfSquat) {
		this.numberOfSquat = numberOfSquat;
	}

	public void doExercise(String motion,int number) {
		if(motion.equalsIgnoreCase("Burpee")) {
			
			doBurpee(number);
		}
		else if(motion.equalsIgnoreCase("Pushup")) {
			doPushup(number);
			
		}
		else if(motion.equalsIgnoreCase("Situp")) {
			doSitup(number);
			
		}
		else if(motion.equalsIgnoreCase("Squat")) {
			doSquat(number);
			
		}
		else {
			System.out.println("invalid request.");
		}
	}
	public void doBurpee(int number) {
		if(numberOfBurpee==0) {System.out.println("You have done enough burpee movements.");
		
		}
		if(this.numberOfBurpee-number<0) {
			System.out.println("Congratulations on passing the targeted burpee movement!!");
			this.numberOfBurpee=0;
			System.out.println("Remaining burpee moves  : " + this.numberOfBurpee);
			
		}
		else {
			this.numberOfBurpee-=number;
			System.out.println("Remaining burpee moves : " + this.numberOfBurpee);
		}
	}
	public void doSquat(int number) {
		if(this.numberOfSquat==0) {System.out.println("You have done enough squat movements.");
		
		}
		if(this.numberOfSquat-number<0) {
			System.out.println("Congratulations on passing the targeted squat movement!!");
			this.numberOfSquat=0;
			System.out.println("Remaining squat moves : " + this.numberOfSquat);
			
		}
		else {
			this.numberOfSquat-=number;
			System.out.println("Remaining squat moves : " + this.numberOfSquat);
		}
	}
	public void doPushup(int number) {
		if(numberOfPushup==0) {System.out.println("You have done enough pushup movements.");
		
		}
		if(this.numberOfPushup-number<0) {
			System.out.println("Congratulations on passing the targeted pushup movement!!");
			this.numberOfPushup=0;
			System.out.println("Remaining pushup moves : " + this.numberOfPushup);
			
		}
		else {
			this.numberOfPushup-=number;
			System.out.println("Remaining pushup moves : " + this.numberOfPushup);
		}
	}
	public void doSitup(int number) {
		if(this.numberOfSitup==0) {System.out.println("You have done enough situp movements.");
		
		}
		if(numberOfSitup-number<0) {
			System.out.println("Congratulations on passing the targeted pushup movement!!");
			this.numberOfSitup=0;
			System.out.println("Remaining situp moves : " + this.numberOfSitup);
			
		}
		else {
			this.numberOfSitup-=number;
			System.out.println("Remaining situp moves : " + this.numberOfSitup);
		}
	}
	public boolean isExerciseFinished() {
		return(this.numberOfSitup==0 && this.numberOfPushup==0 && this.numberOfSquat==0 && this.numberOfBurpee==0);
	}




}

	class CableCrossover extends FitnessMachines{
	private  final String name ="CableCrossover";
	private int used;
	
	public CableCrossover(boolean broken, int used) {
		super(broken);
		this.used = used;
		
	}

	public int getUsed() {
		return used;
	}
	
	public void setUsed(int used) {
		this.used = used;
	}

	
	public String getName() {
		return name;
	}

}

	

